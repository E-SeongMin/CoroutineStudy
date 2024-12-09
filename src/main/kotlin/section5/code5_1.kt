package section5

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val networkDeffered: Deferred<String> = async(Dispatchers.IO) {
        delay(1000L)
        return@async "Dummy Response"
    }
    val result: String = networkDeffered.await()
    println(result)

}