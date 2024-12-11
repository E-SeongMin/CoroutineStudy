package section8

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.supervisorScope

fun main() = runBlocking<Unit> {
    supervisorScope {
        val deferred: Deferred<String> = async(CoroutineName("Coroutine1")) {
            throw Exception("Coroutine1에 예외가 발생했습니다.")
        }
        try {
            deferred.await()
        } catch (e: Exception) {
            println("[노출된 예외] ${e.message}")
        }
    }
}