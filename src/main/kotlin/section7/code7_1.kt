package section7

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    launch {
        println("부모 코루틴 실행")
        launch {
            println("자식 코루틴 실행")
        }
    }
}