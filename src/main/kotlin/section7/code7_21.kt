package section7

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    launch(CoroutineName("Coroutine1")) {
        val coroutineJob = this.coroutineContext[Job]
        val newJob = Job(parent = coroutineJob)
        launch(CoroutineName("Coroutine2") + newJob) {
            delay(100L)
            println("[${Thread.currentThread().name}] 코루틴 실행")
        }
        newJob.complete()
    }
}