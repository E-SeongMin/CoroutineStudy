package section10

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield
import util.getElapsedTime

fun main() = runBlocking<Unit> {
    val job = launch {
        println("1. launch 코루틴 작업이 시작했습니다.")
        delay(1000L)
        println("2. launch 코루틴 작업이 완료됐습니다.")
    }
    println("3. runBlocking 코루틴이 곧 일시 중단 되고 메인 스레드가 양보됩니다.")
    job.join()
    println("4. runBlocking이 메인 스레드에 보내져 작업이 다시 재게됩니다.")
}