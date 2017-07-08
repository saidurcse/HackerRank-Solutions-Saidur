import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
			int test = in.nextInt();			
			
			for(int i=1;i<=test;i++) {
				String str = in.next();
				char[] myCharArray = str.toCharArray();							
				 
			        //calling the function for even numbers
			        printChars(str);
					}  	
			
	}

	private static void printChars(String str) {
		// TODO Auto-generated method stub
		int i = 0;	     
		 for(i=0; i < str.length(); i = i + 2){
		     System.out.print(str.charAt(i));
		 }
		 System.out.print(" ");
		 for(i=1; i < str.length(); i = i + 2){
		     System.out.print(str.charAt(i));
		 }
		 System.out.println();
	}
	
}

Sample Input:

2
Hacker
Rank

Sample Output:

Hce akr
Rn ak