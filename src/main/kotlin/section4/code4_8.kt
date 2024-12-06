package section4

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import util.getElapsedTime

fun main() = runBlocking<Unit> {
    val startTime = System.currentTimeMillis()
    val lazyJob: Job = launch(start = CoroutineStart.LAZY) {
        println("[${getElapsedTime(startTime)}] launch 코루틴 지연 실행")
    }
    delay(3000L)
    lazyJob.start()
//    lazyJob.join()
}