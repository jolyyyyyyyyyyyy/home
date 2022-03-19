fun main(args: Array<String>) {
    println("Напишите ваше имя и фамилию")
    val y = readLine()
    println("Введите свой возраст")
    val x = readLine()!!
    if (x > 18.toString())
        println("Пропускаем $y")
    else if (x < 14.toString()) {
        println("Вызываем полицию для $y")
    }
    else {
        println("Не пускаем $y")
    }

}