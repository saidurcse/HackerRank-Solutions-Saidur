import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int[] arr1 = new int[n];
        for(int j=n-1;j>=0;j--) {
        	arr1[j] = arr[j];
        	System.out.print(arr1[j] + " ");
        }
        in.close();
    }
}

Sample Input:

4
1 4 3 2

Sample Output:

2 3 4 1