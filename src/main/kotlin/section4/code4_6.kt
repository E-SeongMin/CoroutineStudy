package section4

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import util.getElapsedTime

fun main() = runBlocking<Unit> {
    val startTime = System.currentTimeMillis()
    val immediateJob: Job = launch {
        println("[${getElapsedTime(startTime)}] launch 코루틴 실행")
    }
}