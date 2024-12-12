package section9

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import util.delayAndPrintHelloWorld
import util.getElapsedTime

fun main() = runBlocking<Unit> {
    val startTime = System.currentTimeMillis()
    delayAndPrintHelloWorld()
    delayAndPrintHelloWorld()
    println(getElapsedTime(startTime))
}