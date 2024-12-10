package section6

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val coroutineContext = CoroutineName("MyCoroutine") + newSingleThreadContext("MyThread")

    launch(context = coroutineContext) {
        println("[${Thread.currentThread().name}] 실행")
    }
}