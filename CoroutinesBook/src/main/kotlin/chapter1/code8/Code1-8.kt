package chapter1.code8

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future

fun main() {
    val executorService: ExecutorService = Executors.newFixedThreadPool(2)
    val future: Future<String> = executorService.submit<String> {
        Thread.sleep(2000)
        return@submit "작업 1완료"
    }

    val result = future.get() // 메인 스레드 블로킹
    println(result)
    executorService.shutdown()
}