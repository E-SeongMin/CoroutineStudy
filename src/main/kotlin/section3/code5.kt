package section3

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    launch(Dispatchers.Default) {
        launch {
            println("[${Thread.currentThread().name}] 작업 1 실행")
        }
        launch {
            println("[${Thread.currentThread().name}] 작업 2 실행")
        }
        launch {
            println("[${Thread.currentThread().name}] 작업 3 실행")
        }
    }
}