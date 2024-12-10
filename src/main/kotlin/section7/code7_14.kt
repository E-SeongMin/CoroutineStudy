package section7

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

public val CoroutineScope.isActive : Boolean
    get() = coroutineContext[Job]?.isActive ?: false

fun main() = runBlocking<Unit> {
    val whileJob: Job = launch(Dispatchers.Default) {
        while (this.isActive) {
            println("작업 중")
        }
    }
    delay(100L)
    whileJob.cancel()
}