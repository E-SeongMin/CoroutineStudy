package section4

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield

fun main() = runBlocking<Unit> {
    val whileJob: Job = launch(Dispatchers.IO) {
        while (true) {

        }
    }
    whileJob.cancel()
    println(whileJob)
}