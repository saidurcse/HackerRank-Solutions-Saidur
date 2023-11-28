https://www.hackerrank.com/challenges/arrays-ds/problem

import java.io.*;
import java.util.*;

fun reverseArray(a: Array<Int>): Array<Int> {
    a.reverse()

    return a
}

fun reverseArray(a: Array<Int>): Array<Int> {  
    var result = Array(a.size) {0}
    
    for(i in a.size-1 downTo 0) {
        result[a.size-i-1] = a[i]
    }
    
    return result
}

Time complexity: O(n)
Space complexity: O(1)

Sample Input:

4
1 4 3 2

Sample Output:

2 3 4 1