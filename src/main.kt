fun main(args: Array<String>) {

    println("Введите никнейм:")
    var name: String? = readLine()
    println("Введите возраст вашего персонажа:")
    var age: String? = readLine()
    println("Выберете рассу (Люди, Орки, Эльфы):")
    var race = readLine()
    var hp: Int = 0
    var dmg: Int = 0

    if (race == "Люди") {
        race = "Человек "
        hp = 10
        dmg = 10
    } else if (race == "Орки") {
        hp = 12
        dmg = 8
    } else if (race == "Эльфы") {
        hp = 8
        dmg = 12
    } else {
        println("Ошибка, в следующий раз верно укажите рассу!")
        return }

    println("")
    println("Ваш никнейм: $name")
    println("Ваш возраст: $age")
    println("Ваша расса: ${race.dropLast(1)}")
    println("Кол-во здоровья: $hp")
    println("Кол-во урона: $dmg")

}