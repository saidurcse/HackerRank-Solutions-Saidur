https://www.hackerrank.com/challenges/2d-array/problem


import java.io.*;
import java.util.*;

fun hourglassSum(arr: Array<Array<Int>>): Int {
    
    var sum : Int
    var max = Int.MIN_VALUE
    
    for(i in 0 until 4) {
        for(j in 0 until 4) {
            sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + 
                            arr[i+1][j+1] + 
                  arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]                 
                                          
            if(sum > max) {
                max = sum
            }
        }
    }
    
    return max

}

Time complexity: O(n^2)
Space complexity: O(n^2)

Sample Input:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output:

19