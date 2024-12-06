package section4

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import util.executeAfterJobCancelled
import util.getElapsedTime

fun main() = runBlocking<Unit> {
    val longJob: Job = launch(Dispatchers.Default) {
        delay(1000L)
        println("longJob 코루틴의 동작")
    }
    longJob.cancelAndJoin()
    executeAfterJobCancelled()
}