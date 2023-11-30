https://www.hackerrank.com/challenges/2d-array/problem


import java.io.*;
import java.util.*;

public class Simple {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
       
        int arr[][] = new int [6][6];   
        
        for(int i=0;i<6;i++){
        	for(int j=0;j<6;j++){
        		arr[i][j] = scanner.nextInt();
        	}
        }
        
        int sum = 0, max = Integer.MIN_VALUE;
        
        for(int i=0;i<4;i++){
        	for(int j=0;j<4;j++){
        		sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + 
        						arr[i+1][j+1] +
        			  arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
        		
        		if(sum > max)
        			max = sum;
        				
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