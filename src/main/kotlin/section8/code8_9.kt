package section8

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.supervisorScope

fun main() = runBlocking<Unit> {
    val exceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
        println("[예외발생] ${throwable}")
    }
    CoroutineScope(context = exceptionHandler).launch(CoroutineName("Coroutine1")) {
        launch(CoroutineName("Coroutine2")) {
            throw Exception("Coroutine2에 예외가 발생했습니다.")
        }
    }
    delay(1000L)
}