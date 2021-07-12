import java.util.*

object sum_wall_2d {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)

        val numRows = `in`.nextInt()
        val numCols = `in`.nextInt()
        val arr = Array(numRows) { IntArray(numCols) }

        for (i in 0 until numRows) {
            for (j in 0 until numCols) {
                arr[i][j] = `in`.nextInt()
            }
        }
        var perTotal = 0
        // left and right column
        // left and right column
        for (r in 1 until numRows - 1) perTotal += arr[r][0] + arr[r][numCols - 1]
        println("left and right column=$perTotal")
        // top and bottom row
        // top and bottom row
        for (c in 0 until numCols) perTotal += arr[0][c] + arr[numRows - 1][c]
        println("top and bottom row=$perTotal")

        // output
        // output
        println("Perimeter=$perTotal")

    }
}