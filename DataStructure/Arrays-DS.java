https://www.hackerrank.com/challenges/arrays-ds/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
		
		int input = in.nextInt();
		int arr[] = new int[input];
		
		for(int i=0;i<input;i++){
			arr[i] = in.nextInt();
		}
		
		for(int i=input-1;i>=0;i--){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
        
    }
}


Sample Input:

4
1 4 3 2

Sample Output:

2 3 4 1