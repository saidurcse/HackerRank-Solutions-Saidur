/*
import java.util.*

class Printer<in T> {
    fun <E> printArray(generic: Array<E>) {
        for (element in generic) {
            println(element)
        }
    }
}

fun main(args: Array<String>) {

    val scan  = Scanner(System.`in`)
    var n = scan.nextInt()

    var intArray = IntArray(n)
    for (i in 0 until n) {
        intArray[i] = scan.nextInt()
    }

    n = scan.nextInt()
    val stringArray = arrayOfNulls<String>(n)
    for (i in 0 until n) {
        stringArray[i] = scan.next()
    }

    val intPrinter: Printer<Int> = Printer<Int>()
    val stringPrinter: Printer<String> = Printer<String>()
    intPrinter.printArray(intArray)
    stringPrinter.printArray(stringArray)
    if (Printer::class.java.getDeclaredMethods().size > 1) {
        println("The Printer class should only have 1 method named printArray.")
    }
}

*/
