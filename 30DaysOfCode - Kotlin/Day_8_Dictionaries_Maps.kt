import java.util.*

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    val n = `in`.nextInt()

    val myMap: MutableMap<String, Int?> = HashMap()

    for (i in 0 until n) {
        val name = `in`.next()
        val phone = `in`.nextInt()
        // Write code here
        myMap[name] = phone
    }
    while (`in`.hasNext()) {
        val s = `in`.next()
        // Write code here
        if (myMap[s] != null) {
            println(s + "=" + myMap[s])
        } else {
            println("Not found")
        }
    }
    `in`.close()
}
