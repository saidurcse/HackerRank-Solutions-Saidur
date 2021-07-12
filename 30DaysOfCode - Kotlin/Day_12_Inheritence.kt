import java.util.*

internal open class Person     // Constructor
    (protected var firstName: String, protected var lastName: String, protected var idNumber: Int) {

    // Print person data
    fun printPerson() {
        println(
            "Name: " + lastName + ", " + firstName
                    + "\nID: " + idNumber
        )
    }
}

internal class Student     // Write your constructor here
    (firstName: String, lastName: String, identification: Int, private val testScores: IntArray) :
    Person(firstName, lastName, identification) {

    fun calculate(): String {
        var total_number = 0
        for (i in testScores.indices) {
            total_number = total_number + testScores[i]
        }
        total_number = total_number / testScores.size
        if (total_number >= 90) {
            return "O"
        } else if (total_number >= 80) {
            return "E"
        } else if (total_number >= 70) {
            return "A"
        } else if (total_number >= 55) {
            return "P"
        } else return if (total_number >= 40) {
            "D"
        } else {
            "T"
        }
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val firstName = scan.next()
    val lastName = scan.next()
    val id = scan.nextInt()
    val numScores = scan.nextInt()
    val testScores = IntArray(numScores)
    for (i in 0 until numScores) {
        testScores[i] = scan.nextInt()
    }
    scan.close()

    val s = Student(firstName, lastName, id, testScores)
    s.printPerson()
    System.out.println("Grade: " + s.calculate())
}
