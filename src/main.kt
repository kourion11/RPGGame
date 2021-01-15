fun main(args: Array<String>) {

    println("Введите никнейм:")
    var name: String? = readLine()
    println("Введите возраст вашего персонажа:")
    var age = readLine()!!.toInt()
    println("Выберите рассу: 1.Люди, 2.Орки, 3.Эльфы:")
    var race = readLine()!!.toInt()
    var raceChar: String = ""
    var hp: Int = 0
    var dmg: Int = 0
    var ageHero: Int = 0
    var ageHeroText: String = ""

    //Корректность возраста
    when (age) {
        in 1..100 -> age
        else -> println("Введите корректное значение!")
    }

    //Проверка возраста
    when (age) {
        in 1..30 -> ageHero = 1
        in 30..60 -> ageHero = 2
        in 60..100 -> ageHero = 3
    }

    //Расса героя
    when (race) {
        1 -> {
            raceChar = "Человек"
            hp = 10
            dmg = 10
        }
        2 -> {
            raceChar = "Орк"
            hp = 12
            dmg = 8
        }
        3 -> {
            raceChar = "Эльф"
            hp = 8
            dmg = 12
        }
        else -> println("Выберите вариант от 1 до 3")
    }

    //Возраст героя
    when (ageHero) {
        1 -> {
            ageHeroText = "Ваш персонаж молод, Вы получаете +2 к хп и +2 к урону"
            hp += 2
            dmg += 2
        }
        2 -> ageHeroText = "Ваш персонаж средних лет"
        3 -> {
            ageHeroText = "Ваш персонаж стар, Вы теряете -2 хп и -2 от урона"
            hp -= 2
            dmg -= 2
        }
        else -> println("Не получилось определить возраст")
    }

    //Вывод характеристик персонажа
    char(name, age, ageHeroText, raceChar, hp, dmg)

}

fun char(name: String?, age: Int, ageHeroText: String, raceChar: String, hp: Int, dmg: Int) {
    println("")
    println("Персонаж успешно создан!")
    println("Ваш никнейм: $name")
    println("Ваш возраст: $age")
    println(ageHeroText)
    println("Ваша расса: $raceChar")
    println("Кол-во здоровья: $hp")
    println("Кол-во урона: $dmg")
}