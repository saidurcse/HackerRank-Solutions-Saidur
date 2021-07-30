import java.util.*

fun main(args: Array<String>) {

    val scan  = Scanner(System.`in`)
    val n = scan.nextInt()

    val arr = IntArray(n)
    for(i in 0 until n) {
        arr[i] = scan.nextInt()
    }

    var numberOfSwaps = 0;
    for(i in 0 until n) {
        for (j in 0 until n-1) {
            if (arr[j] > arr[j+1]) {
                val tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
                numberOfSwaps++;
            }
        }
        if( numberOfSwaps == 0) {
            break;
        }
    }
    println("Array is sorted in $numberOfSwaps swaps.")
    System.out.println("First Element:  " + arr[0])
    System.out.println("Last Element:  " + arr[n-1])

}
