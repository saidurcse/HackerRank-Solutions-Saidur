import java.util.*

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    val n = `in`.nextInt()
    val arr = IntArray(n)
    for (i in 0 until n) {
        arr[i] = `in`.nextInt()
    }
    val arr1 = IntArray(n)
    for (j in n - 1 downTo 0) {
        arr1[j] = arr[j]
        print(arr1[j].toString() + " ")
    }
    `in`.close()
}
