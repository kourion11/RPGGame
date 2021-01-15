import kotlin.system.exitProcess

fun main() {

    println("Введите никнейм:")
    val name: String? = readLine()
    println("Введите возраст вашего персонажа (1 - 100):")
    val tmpAge = readLine()?.toIntOrNull()
    var age = 0
    if(tmpAge is Int)  {
        age = tmpAge.toInt()
    } else {
        println("В следующий раз укажите корректный ворзаст (от 1 до 100)")
        exitProcess(0)
    }
    //Корректность возраста
    checkAge(age)

    println("Выберите рассу: 1.Люди, 2.Орки, 3.Эльфы:")
    var tmpRace = readLine()?.toIntOrNull()
    var race = 0
    if(tmpRace is Int)  {
        race = tmpRace.toInt()
    } else {
        println("В следующий раз выберите вариант от 1 до 3")
        exitProcess(0)
    }

    var raceChar = ""
    var hp: Int = 0
    var dmg: Int = 0
    var ageHero: Int = 0

    //Проверка возраста
    ageHero = setAgeHero(age)

    //Расса героя
    val raceData = setRace(race)
    raceChar = raceData[0] as String
    hp = raceData[1] as Int
    dmg = raceData[2] as Int

    //Возраст героя
    val ageHeroData = setHeroAgeText(ageHero, hp, dmg)
    var ageHeroText = ageHeroData[0] as String
    hp = ageHeroData[1] as Int
    dmg = ageHeroData[2] as Int

    //Вывод характеристик персонажа
    charInfo(name, age, ageHeroText, raceChar, hp, dmg)

}

fun checkAge(age: Int) {
    when (age) {
        in 1..100 -> age
        else -> {
            println("В следующий раз укажите корректный ворзаст (от 1 до 100)")
            exitProcess(0)
        }
    }
}

fun setAgeHero(age: Int): Int {
    var ageHero: Int = 0
    when (age) {
        in 1..30 -> ageHero = 1
        in 30..60 -> ageHero = 2
        in 60..100 -> ageHero = 3
    }
    return ageHero
}

fun setRace(race: Int): Array<Any> {
    var raceChar = ""
    var mhp = 0
    var mdmg = 0

    when (race) {
        1 -> {
            raceChar = "Человек"
            mhp = 10
            mdmg = 10
        }
        2 -> {
            raceChar = "Орк"
            mhp = 12
            mdmg = 8
        }
        3 -> {
            raceChar = "Эльф"
            mhp = 8
            mdmg = 12
        }

    }
    return arrayOf(raceChar, mhp, mdmg)
}

fun setHeroAgeText(ageHero: Int, inputHp: Int, inputDmg: Int): Array<Any> {
    var ageHeroText: String = ""
    var hp: Int = 0
    var dmg: Int = 0

    when (ageHero) {
        1 -> {
            ageHeroText = "Ваш персонаж молод, Вы получаете +2 к хп и +2 к урону"
            hp = inputHp+2
            dmg = inputDmg+2
        }
        2 -> {
            ageHeroText = "Ваш персонаж средних лет"
            hp = inputHp
            dmg = inputDmg
        }
        3 -> {
            ageHeroText = "Ваш персонаж стар, Вы теряете -2 хп и -2 от урона"
            hp = inputHp-2
            dmg = inputDmg-2
        }
        else -> println("Не получилось определить возраст")
    }
    return arrayOf(ageHeroText, hp, dmg)
}

fun charInfo(name: String?, age: Int, ageHeroText: String, raceChar: String, hp: Int, dmg: Int) {
    println("")
    println("Персонаж успешно создан!")
    println("Ваш никнейм: $name")
    println("Ваш возраст: $age")
    println(ageHeroText)
    println("Ваша расса: $raceChar")
    println("Кол-во здоровья: $hp")
    println("Кол-во урона: $dmg")
}