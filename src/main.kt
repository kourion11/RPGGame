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

    if(age in 1..100)
        age = age
    else
        println("Введите корректное значение!")

    if(race in 1..3) {
        if(race == 1)
            raceChar = "Человек"
        else if(race == 2)
            raceChar = "Орк"
        else if(race == 3)
            raceChar = "Эльф"
        else
            println("Выберите рассу из списка!") }
    else
        println("Выберите вариант от 1 до 3")

    println("")
    println("Ваш никнейм: $name")
    println("Ваш возраст: $age")
    println("Ваша расса: $raceChar")
    println("Кол-во здоровья: $hp")
    println("Кол-во урона: $dmg")

}