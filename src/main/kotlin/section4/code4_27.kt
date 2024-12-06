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
    val whileJob: Job = launch(Dispatchers.IO) {
        while (true) {
            yield()
        }
    }
    whileJob.cancelAndJoin()
    println(whileJob)
    printJobState(whileJob)
}