package section9

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import util.delayAndPrintHelloWorld

fun main() = runBlocking<Unit> {
    delayAndPrintHelloWorld()
    delayAndPrintHelloWorld()
}