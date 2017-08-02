import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try{
			int result =  Integer.parseInt(S);
			System.out.println(result);
		}catch(Exception e){
			System.out.println("Bad String");
		}
    }
}




Sample Input 0:

3

Sample Output 0:

3

Sample Input 1:

za

Sample Output 1:

Bad String