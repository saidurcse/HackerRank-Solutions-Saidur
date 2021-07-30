import java.util.*;
import kotlin.math.roundToInt


fun main(args: Array<String>) {
    val input = Scanner(System.`in`);
    val day1 = input.nextInt()
    val month1 = input.nextInt()
    val year1 = input.nextInt()

    val day2 = input.nextInt()
    val month2 = input.nextInt()
    val year2 = input.nextInt()

    var fine = 0;

    if(year1 > year2) {
        fine = 10000;
    } else  if ((year1 >= year2) && (month1 > month2)){
        fine = 500 * (month1 - month2);
    } else  if ((year1 >= year2) && (month1 >= month2) && (day1 > day2)){
        fine = 15 * (day1 - day2);
    } else {
        fine = 0;
    }

    println(fine)
}
