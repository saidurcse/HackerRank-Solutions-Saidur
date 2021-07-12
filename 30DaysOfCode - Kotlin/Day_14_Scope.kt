import java.util.*


internal class Difference(private val elements: IntArray) {
    var maximumDifference = 0
    fun computeDifference() {
        val n = elements.size
        Arrays.sort(elements)
        maximumDifference = elements[n - 1] - elements[0]
    }
}

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = IntArray(n)
    for (i in 0 until n) {
        a[i] = sc.nextInt()
    }
    sc.close()

    val difference = Difference(a)

    difference.computeDifference()

    System.out.print(difference.maximumDifference)
}
