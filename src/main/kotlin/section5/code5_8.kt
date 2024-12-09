package section5

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() = runBlocking<Unit> {
    val networkDeferred1: Deferred<String> = async(Dispatchers.IO) {
        delay(1000L)
        return@async "결과값1"
    }

    val networkDeferred2: Deferred<String> = async(Dispatchers.IO) {
        delay(1000L)
        return@async "결과값2"
    }

    val results: List<String> = awaitAll(networkDeferred1, networkDeferred2)

    println("합쳐진 결과값: ${results.joinToString(", ")}")
}