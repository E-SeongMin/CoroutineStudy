package section6

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val coroutineContext = newSingleThreadContext("MyThread") + CoroutineName("MyCoroutine")
    val newCoroutineContext = coroutineContext + CoroutineName("NewCoroutine")

    launch(context = newCoroutineContext) {
        println("[${Thread.currentThread().name}] 실행")
    }
}