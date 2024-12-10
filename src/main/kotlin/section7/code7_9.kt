package section7

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking
import util.getElapsedTime
import util.printJobState
import kotlin.coroutines.CoroutineContext

class CustomCoroutineScope : CoroutineScope {
    override val coroutineContext: CoroutineContext = Job() + newSingleThreadContext("CustomScopeThread")
}

fun main() = runBlocking<Unit> {
    val coroutineScope = CustomCoroutineScope()
    coroutineScope.launch {
        delay(100L)
        println("[${Thread.currentThread().name}] 코루틴 실행 완료")
    }
    Thread.sleep(1000L)
}