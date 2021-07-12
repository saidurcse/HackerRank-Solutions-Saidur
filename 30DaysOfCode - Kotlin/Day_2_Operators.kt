/*
 * Complete the 'solve' function below.
 *
 * The function accepts following parameters:
 *  1. DOUBLE meal_cost
 *  2. INTEGER tip_percent
 *  3. INTEGER tax_percent
 */

fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Unit {
    val a = meal_cost * tip_percent / 100
    val b = meal_cost * tax_percent / 100
    val total = meal_cost + a + b

    val totalCost = Math.round(total).toInt()

    print(totalCost)
}

fun main(args: Array<String>) {

    val meal_cost = readLine()!!.trim().toDouble()

    val tip_percent = readLine()!!.trim().toInt()

    val tax_percent = readLine()!!.trim().toInt()

    solve(meal_cost, tip_percent, tax_percent)
}