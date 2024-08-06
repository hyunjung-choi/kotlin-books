package chapter1.code4

import chapter1.code3.ExampleThread

fun main() {
    println("[${Thread.currentThread().name}] 메인 스레드 시작")
    ExampleThread().apply {
        isDaemon = true
    }.start()
    Thread.sleep(1000L) // 1초 동안 대기
    println("[${Thread.currentThread().name}] 메인 스레드 종료")
}