import java.util.*;
import kotlin.math.roundToInt


fun isPrime(number: Int): Boolean {
    val numberSqrt = Math.sqrt(number.toDouble())

    if(number<=1)
        return false
    else {
        for (j in 2 until numberSqrt.roundToInt()) {
            if(number % j == 0)
                return false
        }
    }
    return true
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`);
    val n = input.nextInt()

    var numbers = IntArray(n)
    for (i in 0 until n) {
        numbers[i] = input.nextInt()
    }

    for (i in 0 until numbers.size) {
        if (isPrime(numbers[i]))
            println("Prime")
        else
            println("Not Prime")
    }
}
