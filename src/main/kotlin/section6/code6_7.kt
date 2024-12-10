package section6

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val coroutineName: CoroutineName = CoroutineName("MyCoroutine")
    val dispatcher: CoroutineDispatcher = Dispatchers.IO
    val myJob = Job()
    val coroutineContext = coroutineName + dispatcher + myJob

    val deletedCoroutineContext = coroutineContext.minusKey(CoroutineName)

    println("coroutineContext: $coroutineContext")
    println("deletedCoroutineContext: $deletedCoroutineContext")
}