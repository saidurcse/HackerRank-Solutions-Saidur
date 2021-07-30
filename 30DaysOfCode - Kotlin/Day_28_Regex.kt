import java.util.*
import java.util.regex.Pattern

fun main(args: Array<String>) {
    val input = Scanner(System.`in`);
    val n = input.nextInt()

    val emailRx = ".+@gmail\\.com$"
    val pattern = Pattern.compile(emailRx)
    var list: MutableList<String> = ArrayList()

    for (i in 0 until n) {
        var name = input.next()
        var email = input.nextLine()

        val matcher = pattern.matcher(email)
        if(matcher.find()) {
            list.add(name);
        }
    }

    Collections.sort(list);

    for (name in list) {
        println(name)
    }
}
