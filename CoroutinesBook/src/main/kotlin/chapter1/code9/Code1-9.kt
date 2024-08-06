package chapter1.code9

import chapter1.code6.getElapsedTime

fun main() {
    val startTime = System.currentTimeMillis()

    println("[${getElapsedTime(startTime)}] 메인 스레드 시작")
    Thread.sleep(1000L) // 1초 동안 스레드 대기 (스레드 블로킹)
    println("[${getElapsedTime(startTime)}] 스레드 블로킹이 끝나고 실행되는 작업")
}