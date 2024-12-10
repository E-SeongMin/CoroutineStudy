package util

import kotlinx.coroutines.Job

fun getElapsedTime(startTime: Long): String =
    "지난 시간: ${System.currentTimeMillis() - startTime} 밀리초"

fun executeAfterJobCancelled() {
    println("longJob 코루틴 취소 후 실행되어야 하는 동작")
}

fun printJobState(job: Job) {
    println(
        "Job State\n" +
        "isActive >> ${job.isActive}\n" +
        "isCancelled >> ${job.isCancelled}\n" +
        "isCompleted >> ${job.isCompleted}"
    )
}