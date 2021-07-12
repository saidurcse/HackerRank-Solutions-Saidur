import java.util.*

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    val n = `in`.nextInt()

    val convert_num = Integer.toBinaryString(n)
    val temp = convert_num.split("[0]+".toRegex()).toTypedArray()
    //System.out.println(temp[]);
    //System.out.println(temp[]);
    var max = 0
    for (s in temp) {
        if (s.length > max) max = s.length
    }
    println(max)
}
