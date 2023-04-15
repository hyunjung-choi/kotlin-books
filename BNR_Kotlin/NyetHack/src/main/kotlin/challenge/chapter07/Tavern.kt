package challenge.chapter07

import java.util.*

const val TAVERN_NAME = "Taernyl's Folly"
fun main(args: Array<String>) {
//     placeOrder("shandy,Dragon's Breath,5.91")
    placeOrder("elixir,Shirley's Temple,4.12")
    println(toDragonSpeak("DRAGON'S BREATH: IT'S GOT WHAT ADVENTURES CRAVE!"))
}

// 대문자도 올바르게 번역할 수 있도록 함수 개선
private fun toDragonSpeak(phrase: String) =
    phrase.replace(Regex("[aeiouAEIOU]")) {
        when (it.value) {
            "a", "A" -> "4"
            "e", "E" -> "3"
            "i", "I" -> "1"
            "o", "O" -> "0"
            "u", "U" -> "|_|"
            else -> it.value
        }
    }

private fun placeOrder(menuData: String) {
    val indexOfApostorphe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostorphe)
    println("마드리갈은 ${tavernMaster}에게 주문한다.")

//    val data = menuData.split(",")
//    val type = data[0]
//    val name = data[1]
//    val price = data[2]
    val (type, name, price) = menuData.split(",") // 해체선언
    val message = "마드리갈은 금화 $price 로 $name ($type)를 구입한다."
    println(message)

    val phrase = if (name == "Dragon's Brath") {
        "마드리갈이 감탄한다: ${toDragonSpeak("와 $name 진짜 좋구나!")}"
    } else {
        "마드리갈이 말한다: 감사합니다 $name."
    }
    println(phrase)
}