package section3

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val dedicateDispatcher = Dispatchers.IO.limitedParallelism(2)
    repeat(100) {
        launch(dedicateDispatcher) {
            Thread.sleep(1000L)
            println("[${Thread.currentThread().name}] 중요 작업 완료")
        }
    }
}