package section4

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val convertImageJob1: Job = launch(Dispatchers.Default) {
        delay(1000L)
        println("[${Thread.currentThread().name}] 이미지 1 변환 완료")
    }
    val convertImageJob2: Job = launch(Dispatchers.Default) {
        delay(1000L)
        println("[${Thread.currentThread().name}] 이미지 2 변환 완료")
    }

    joinAll(convertImageJob1, convertImageJob2)

    val updateImageJob: Job = launch(Dispatchers.IO) {
        println("[${Thread.currentThread().name}] 이미지 1,2 업로드")
    }
}
