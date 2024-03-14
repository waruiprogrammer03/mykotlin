import java.util.Scanner
fun marks() {
    val marks = mutableListOf<Int>()

    println("Grade calculator")
    println("Enter marks :")

    var input: Int
    do {
        input = readLine()!!.toInt()
        if (input in 0..100) {
            marks.add(input)
        } else if (input != -1) {
            println("Invalid input.Marks must be from 0 to 100.")
        }
    } while (input != -1)

    println("\nGrades:")
    for (mark in marks) {
        val grade = when (mark) {
            in 91..100 -> "A+"
            in 81..90 -> "A"
            in 71..80 -> "B+"
            in 61..70 -> "B"
            in 51..60 -> "C"
            in 41..50 -> "D"
            in 31..40 -> "D-"
            else -> "E"

        }
        println("Marks: $mark, Grade: $grade")
    }
}