package section7

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking
import util.getElapsedTime

fun main() = runBlocking<Unit> {
    var startTime = System.currentTimeMillis()
    val parentJob = launch {
        launch {
            delay(1000L)
            println("[${getElapsedTime(startTime)}] 자식 코루틴 실행 완료")
        }
        println("[${getElapsedTime(startTime)}] 부모 코루틴이 실행하는 마지막 코드")
    }
    parentJob.invokeOnCompletion {
        println("[${getElapsedTime(startTime)}] 부모 코루틴 실행 완료")
    }
}