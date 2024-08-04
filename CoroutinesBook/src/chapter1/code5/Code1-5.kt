package chapter1.code5

import kotlin.concurrent.thread

fun main() {
    println("[${Thread.currentThread().name}] 메인 스레드 시작")
    thread(isDaemon = false) {
        println("[${Thread.currentThread().name}] 새로운 스레드 시작")
        Thread.sleep(2000L)
        println("[${Thread.currentThread().name}] 새로운 스레드 종료")
    }
    Thread.sleep(1000L) // 1초 동안 대기
    println("[${Thread.currentThread().name}] 메인 스레드 종료")
}