import java.util.*

object `Arrary-2D` {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        val m = `in`.nextInt()
        val n = `in`.nextInt()
        val arr = Array(m) { IntArray(n) }
        for (i in 0 until m) {
            for (j in 0 until n) { //arr[i][j-n] = 0;
                arr[i][j] = `in`.nextInt()
            }
        }
        for (i in 0 until m) {
            for (j in n - 1 downTo 0) {
                if (i == j) {
                    arr[i][j] = -1
                }
                print(arr[i][j].toString() + " ")
            }
            println()
        }
    }
}