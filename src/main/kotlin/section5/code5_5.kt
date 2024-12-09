package section5

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import util.getElapsedTime
import util.printJobState

fun main() = runBlocking<Unit> {
    val startTime: Long = System.currentTimeMillis()

    val participantDeferred1: Deferred<Array<String>> = async(Dispatchers.IO) {
        delay(1000L)
        return@async arrayOf("철수", "영수")
    }

    val participantDeferred2: Deferred<Array<String>> = async(Dispatchers.IO) {
        delay(1000L)
        return@async arrayOf("영희")
    }

    val results = listOf(participantDeferred1, participantDeferred2).awaitAll()

    println("[${getElapsedTime(startTime)}] 참여자 목록: ${listOf(results[0], results[1])}}")
}