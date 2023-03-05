const val MAX_EXPERIENCE: Int = 5000
fun main(args: Array<String>) {
    val name = "마드리갈"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    // 아우라
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    // 플레이어의 상태 출력
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)
}

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println(
        "(Aura: ${auraColor}) " +
                "(Blessed: ${if (isBlessed) "YES" else "NO"})"
    )
    println("${name} ${healthStatus}")
    castFireball(5)
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String {
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    return auraColor
}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String =
    when (healthPoints) {
        100 -> "최상의 상태임!"
        in 90..99 -> "약간의 찰과상만 있음."
        in 75..89 -> if (isBlessed) {
            "경미한 상처가 있지만 빨리 치유되고 있음!"
        } else {
            "경미한 상처만 있음."
        }

        in 15..74 -> "많이 다친 것 같음."
        else -> "최악의 상태임!"
    }

private fun castFireball(numFirebaalls: Int = 2) =
    println("한 덩어리의 파이어볼이 나타난다. (x$numFirebaalls)")
