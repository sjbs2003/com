package com.KOTLIN.Class_With_Generics

fun main() {
    Quiz().apply{
        printQuiz()
    }
}
interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}
class Quiz: ProgressPrintable {
    override val progressText: String
        get() = "$answered of $total answered"
    override fun printProgressBar() {
        repeat(answered){ print("▓") }
        repeat(total - answered) { print("▒") }
        println()
        println(progressText)
    }

    private val question1 = Question("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    private val question2 = Question("The sky is green. True or false", false, Difficulty.EASY)
    private val question3 = Question("How many days are there between full moons?", 28, Difficulty.HARD)
    companion object StudentProgress{
        var total: Int = 10
        var answered: Int = 3
    }
    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}
data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
enum class Difficulty{
    EASY, MEDIUM, HARD
}

