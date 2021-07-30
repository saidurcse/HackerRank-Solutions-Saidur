import java.util.*

internal interface AdvancedArithmetic {
    fun divisorSum(n: Int): Int
}

internal class Calculator1 : AdvancedArithmetic {
    override fun divisorSum(n: Int): Int {
        var sum = 0
        for (i in 1..n) {
            if (n % i == 0) {
                sum = sum + i
            }
        }
        return sum
    }
}

fun main(args: Array<String>) {

    val scan  = Scanner(System.`in`)
    val n = scan.nextInt()
    scan.close()

    val myCalculator: AdvancedArithmetic = Calculator1()
    val sum = myCalculator.divisorSum(n)
    println("I implemented: " + myCalculator.javaClass.getInterfaces()[0].getName())
    println(sum)
}
