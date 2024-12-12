package section9

import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import util.delayAndPrintHelloWorld
import util.getElapsedTime

fun main() = runBlocking<Unit> {
    val startTime = System.currentTimeMillis()
    val job1 = launch {
        delayAndPrintHelloWorld()
    }
    val job2 = launch {
        delayAndPrintHelloWorld()
    }
    joinAll(job1, job2)
    println(getElapsedTime(startTime))
}