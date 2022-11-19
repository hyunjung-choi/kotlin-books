package challenge.chapter03

fun main(args: Array<String>) {
    val name = "마드리갈"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    // 아우라
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val karma = (Math.pow(Math.random(), (100 - healthPoints) / 100.0) * 20).toInt()
    val auraColor = if (auraVisible) {
        when (karma) {
            in 0..5 -> "RED"
            in 6..10 -> "ORANGE"
            in 11..15 -> "PURPLE"
            in 16..20 -> "GREEN"
            else -> "NONE"
        }
    } else {
        "NONE"
    }

    val healthStatus = when (healthPoints) {
        100 -> "최상의 상태임!"
        in 90..99 -> "약간의 찰과상만 있음."
        in 75..89 -> if (isBlessed) {
            "경미한 상처가 있지만 빨리 치유됨!"
        } else {
            "경미한 상처만 있음."
        }
        in 15..74 -> "많이 다친 것 같음."
        else -> "최악의 상태임!"
    }

    // 플레이어의 상태 출력
    println("(Aura: ${auraColor}) " +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("${name} ${healthStatus}")

    // 챌린지: 구성 가능한 형식의 상태 출력
    val HP = "HP: ${healthPoints}"
    val A = "Aura: ${auraColor}"
    val H = "${name} ${healthStatus}"
    println("(${HP})(${A}) -> ${H}")
}