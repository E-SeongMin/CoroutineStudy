package section9

import kotlinx.coroutines.runBlocking
import util.getElapsedTime
import util.searchByKeyword

fun main() = runBlocking<Unit> {
    val startTime = System.currentTimeMillis()
    val results = searchByKeyword("Keyword")
    println("[결과] ${results.toList()}")
    println(getElapsedTime(startTime))
}
