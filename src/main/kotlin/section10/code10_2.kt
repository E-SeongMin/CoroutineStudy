package section10

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield
import util.getElapsedTime

fun main() = runBlocking<Unit> {
    val startTime = System.currentTimeMillis()
    repeat(10) { repeatTime ->
        launch {
            delay(1000L)
            println("[${getElapsedTime(startTime)}] 코루틴${repeatTime} 실행 완료")
        }
    }
}