import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
       
       int res=0;
       int max = Integer.MIN_VALUE;
       for(int i=0;i<4;i++) {
    	   for(int j=0;j<4;j++) {    		   		
    		   		res = arr[i][j] +  arr[i][j+1]   + arr[i][j+2]+
    				   	  			   arr[i+1][j+1] +
    				   	  arr[i+2][j] +arr[i+2][j+1] + arr[i+2][j+2];
    		   		//System.out.println(res);
	    		   if(res>max)
	    			   max = res;
	    		    //System.out.println(max);
    	   }
       }
       System.out.println(max);
    }
}


Sample Input:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output:

19