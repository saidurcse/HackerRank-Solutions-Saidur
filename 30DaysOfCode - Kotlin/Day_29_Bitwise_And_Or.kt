import java.util.*

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    val tcase = `in`.nextInt()
    var N = 0
    var K = 0


    for (t in 1..tcase) {
        N = `in`.nextInt()
        K = `in`.nextInt()
        var max = 0
        var `val` = 0
        for (i in 1 until N) {
            for (j in i + 1..N) {
                `val` = i and j
                if (`val` < K && `val` > max) {
                    max = `val`
                }
            }
        }
        println(max)
    }
}
