package section6

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

@OptIn(ExperimentalStdlibApi::class)
fun main() = runBlocking<Unit> {
    val coroutineContext = CoroutineName("MyCoroutine") + Dispatchers.IO
    val nameFromContext = coroutineContext[CoroutineDispatcher]
    println(nameFromContext)
}