import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    val array = Array(6) { IntArray(6) }
    for(i in 0 until 6) {
        for(j in 0 until  6){
            array[i][j] = input.nextInt()
        }
    }

    var max = Integer.MIN_VALUE
    var result: Int

    for(i in 0 until 4) {
        for(j in 0 until  4){
            result = array[i][j] + array[i][j+1] + array[i][j+2]+
                    array[i+1][j+1]+
                    array[i+2][j] + array[i+2][j+1] + array[i+2][j+2];
            if(result > max)
                max = result;
        }
    }

    println(max)
}
