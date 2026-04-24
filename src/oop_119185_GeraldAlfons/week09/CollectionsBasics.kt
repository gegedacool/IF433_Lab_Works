package oop_119185_GeraldAlfons.week09

fun main() {
    println("=== TEST LIST ===")
    // Immutable List
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable List: $frameworks")

    // Mutable List
    val scores: MutableList<Int> = mutableListOf(85, 98)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")
}
