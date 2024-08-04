package chapter1.code10

import chapter1.code6.getElapsedTime
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executors

fun main() {
    val startTime = System.currentTimeMillis()
    val executor = Executors.newFixedThreadPool(2)

    // CompletableFuture 생성 및 비동기 작업 실행
    val completableFuture = CompletableFuture.supplyAsync({
        Thread.sleep(1000L)
        return@supplyAsync "결과"
    }, executor)

    // 비동기 작업 도중 다른 작업 실행
    completableFuture.thenAccept { result ->
        println("[${getElapsedTime(startTime)}] $result 처리")
    }

    println("[${getElapsedTime(startTime)}] 다른 작업 실행")

    executor.shutdown()
}