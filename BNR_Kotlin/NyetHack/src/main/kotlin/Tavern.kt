fun main(args: Array<String>) {
    var beverage = readLine()

    beverage?.let {
        beverage = it.capitalize()
    } ?: println("beverage가 null입니다!")

    val beverageServed: String = beverage ?: "맥주"

    println(beverageServed)
}