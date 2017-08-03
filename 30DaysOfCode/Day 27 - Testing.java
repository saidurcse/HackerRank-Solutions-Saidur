import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {        
    	/*Scanner in = new Scanner(System.in);       
    	int input = in.nextInt();
    	int count=0;
    	
    	for(int i=0;i<input;i++){
    		
    		int std = in.nextInt();
    		int can = in.nextInt();
    		int arr[] = new int[std];
    		
    		for(int j=0;j<std;j++){
    			arr[j] = in.nextInt();
    		}
    		
    		for(int j=0;j<std;j++){
    			if(arr[j] <0){
    				count++;
    			}
    		}
    		if(can > count)
    			System.out.println("YES");
    		else
    			System.out.println("NO");
    	} */
    	
    	System.out.println("5");
    	System.out.println("5 3");
    	System.out.println("-1 90 999 100 0");
    	System.out.println("4 2");
    	System.out.println("0 -1 2 1");
    	System.out.println("3 3");
    	System.out.println("-1 0 1");
    	System.out.println("6 1");
    	System.out.println("-1 0 1 -1 2 3");
    	System.out.println("7 3");
    	System.out.println("-1 0 1 2 3 4 5");
    	
    
    }
}

When properly solved, this input:

2
4 3
-1 -3 4 2
4 2
0 -1 2 1

Produces this output:

YES
NO

Input Format:

You are not responsible for reading anything from stdin.

Output Format:

Print lines of output that can be read by the Professor challenge as valid input. Your test case must result in the following output when fed as input to the Professor challenge's solution:

YES
NO
YES
NO
YES
