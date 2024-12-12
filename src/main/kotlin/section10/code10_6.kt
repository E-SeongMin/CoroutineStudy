package section10

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield
import util.getElapsedTime

fun main() = runBlocking<Unit> {
    val whileJob = launch(Dispatchers.Default) {
        while (this.isActive) {
            println("작업 중")
        }
    }
    delay(100L)
    whileJob.cancel()
}