package section6

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val coroutineContext = CoroutineName("MyCoroutine") + Dispatchers.IO
    val nameFromContext = coroutineContext[CoroutineName.Key]
    println(nameFromContext)
}