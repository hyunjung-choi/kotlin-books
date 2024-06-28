package chapter1.code3

class ExampleThread : Thread() {
    override fun run() {
        println("[${Thread.currentThread().name}] 새로운 스레드 시작")
        Thread.sleep(2000L)
        println("[${Thread.currentThread().name}] 새로운 스레드 종료")
    }
}