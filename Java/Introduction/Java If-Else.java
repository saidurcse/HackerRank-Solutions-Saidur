https://www.hackerrank.com/challenges/java-if-else

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();            
		String ans="";
	
		if(n%2 == 1){
			ans = "Weird";
		}
		else{
			if(n<=4){
				ans = "Not Weird";
			}
			else if (n>4 && n<=20){
				ans = "Weird";
			}
			else{
				ans = "Not Weird";
			}    		
		}
		System.out.println(ans);
		
	}
}

Sample Input 0:

3

Sample Output 0:

Weird

Sample Input 1:

24

Sample Output 1:

Not Weird