package section10

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield
import util.getElapsedTime

fun main() = runBlocking<Unit> {
    val dispatcher = newFixedThreadPoolContext(2, "Thread")
    launch(dispatcher) {
        repeat(5) {
            println("[${Thread.currentThread().name}] 코루틴 실행이 일시 중단 됩니다.")
            delay(100L)
            println("[${Thread.currentThread().name}] 코루틴 실행이 재개 됩니다.")
        }
    }
}