package section9

import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import util.delayAndPrint
import util.delayAndPrintHelloWorld
import util.getElapsedTime

fun main() = runBlocking<Unit> {
    delayAndPrint(keyword = "부모 코루틴이 실행 중입니다.")
    launch {
        delayAndPrint(keyword = "자식 코루틴이 실행 중입니다.")
    }
}
