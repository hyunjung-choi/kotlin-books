package challenge.chapter09

fun main() {
    val firstItemSquared = listOf(1, 2, 3).first().let {
        it * it
    }

//    val firstElement = listOf(1, 2, 3).first()
//    val firstItemSquared = firstElement * firstElement
}

fun formatGreeting(vipGuest: String?): String {
    return vipGuest?.let {
        "오랜만입니다, $it. 테이블이 준비되어 있으니 들어오시죠."
    } ?: "저희 술집에 오신 것을 환영합니다. 곧 자리를 마련해 드리겠습니다."
}

fun formatGreeting2(vipGuest: String?): String {
    return if (vipGuest != null) {
        "오랜만입니다, $vipGuest. 테이블이 준비되어 있으니 들어오시죠."
    } else {
        "저희 술집에 오신 것을 환영합니다. 곧 자리를 마련해 드리겠습니다."
    }
}