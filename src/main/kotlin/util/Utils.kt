package util

import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.supervisorScope

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

suspend fun delayAndPrintHelloWorld() {
    delay(1000L)
    println("Hello World")
}

suspend fun delayAndPrint(keyword: String) {
    delay(1000L)
    println(keyword)
}

suspend fun searchByKeyword(keyword: String): Array<String> = supervisorScope {
    val dbResultDeferred = async {
        searchFromDB(keyword)
    }
    val serverResultsDeferred = async {
        searchFromServer(keyword)
    }

    val dbResults = try {
        dbResultDeferred.await()
    } catch (e: Exception) {
        arrayOf()
    }

    val serverResults = try {
        serverResultsDeferred.await()
    } catch (e: Exception) {
        arrayOf()
    }

    return@supervisorScope arrayOf(*dbResults, *serverResults)
}

suspend fun searchFromDB(keyword: String): Array<String> {
    delay(1000L)
    return arrayOf("[DB]${keyword}1", "[DB]${keyword}2")
}

suspend fun searchFromServer(keyword: String): Array<String> {
    delay(1000L)
    return arrayOf("[Server]${keyword}1", "[Server]${keyword}2")
}