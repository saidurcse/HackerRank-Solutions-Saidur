import java.lang.NumberFormatException
import java.util.*


fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val s = sc.nextLine()

    try {
        val a = Integer.parseInt(s)
        println(a)
    } catch (e: NumberFormatException){
        println("Bad String")
    }

    sc.close()
}
