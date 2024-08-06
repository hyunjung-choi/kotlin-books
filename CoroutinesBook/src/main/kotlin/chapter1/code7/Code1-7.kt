package chapter1.code7

import chapter1.code6.getElapsedTime
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

fun main() {
    val startTime = System.currentTimeMillis()
    // ExecutorService 생성
    val executorService: ExecutorService = Executors.newFixedThreadPool(2)

    // 작업1 제출
    executorService.submit {
        println("[${Thread.currentThread().name}][${getElapsedTime(startTime)}] 작업1 시작")
        Thread.sleep(1000L) // 1초간 대기
        println("[${Thread.currentThread().name}][${getElapsedTime(startTime)}] 작업1 완료")
    }
    // 작업2 제출
    executorService.submit {
        println("[${Thread.currentThread().name}][${getElapsedTime(startTime)}] 작업2 시작")
        Thread.sleep(1000L) // 1초간 대기
        println("[${Thread.currentThread().name}][${getElapsedTime(startTime)}] 작업2 완료")
    }
    // 작업3 제출
    executorService.submit {
        println("[${Thread.currentThread().name}][${getElapsedTime(startTime)}] 작업3 시작")
        Thread.sleep(1000L) // 1초간 대기
        println("[${Thread.currentThread().name}][${getElapsedTime(startTime)}] 작업3 완료")
    }

    executorService.shutdown()
}