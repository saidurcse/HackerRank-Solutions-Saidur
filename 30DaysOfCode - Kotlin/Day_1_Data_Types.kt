import java.util.*

fun main(args: Array<String>) {

    val i = 4
    val d = 4.0
    val s = "HackerRank "

    val read = Scanner(System.`in`)

    var numInt = read.nextInt()
    var numDouble =  read.nextDouble()
    read.nextLine()
    var inputString = read.nextLine()

    println(i + numInt)
    println(d + numDouble)
    println(s + inputString)
}