import java.util.*

class Calculator {

    fun power(n: Int, p: Int): Any {
        if(n<0 || p<0){
            throw Exception("n and p should be non-negative")
        } else {
            return Math.pow(n.toDouble(), p.toDouble()).toInt()
        }
    }
}

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    var t = sc.nextInt()
    while (t -- > 0) {
        val n = sc.nextInt()
        val p = sc.nextInt()
        val myCalculator = Calculator()
        try {
            val ans = myCalculator.power(n, p)
            println(ans)
        } catch (e: Exception) {
            println(e.message)
        }
    }
}
