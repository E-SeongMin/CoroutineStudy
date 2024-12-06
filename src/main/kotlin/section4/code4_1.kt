package section4

import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val job: Job = launch {
        println("[${Thread.currentThread().name}] 실행")
    }
}
