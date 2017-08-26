https://www.hackerrank.com/challenges/java-string-reverse

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rev = new StringBuffer(A).reverse().toString();
				
		if(A.equals(rev) == true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
        
    }
}


Sample Input:

madam

Sample Output:

Yes
