package section4

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield
import util.printJobState

fun main() = runBlocking<Unit> {
    val job: Job = launch {
        delay(1000L)
    }
    println(job)
    printJobState(job)
}