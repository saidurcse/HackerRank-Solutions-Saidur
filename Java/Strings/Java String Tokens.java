https://www.hackerrank.com/challenges/java-string-tokens

import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		StringTokenizer st = new StringTokenizer(str,"!,?._'@ "); 
		System.out.println(st.countTokens()); 
		while (st.hasMoreTokens()) { 
			System.out.println(st.nextToken()); 
		}
    }
}

Sample Input:

He is a very very good boy, isn't he?

Sample Output:

10
He
is
a
very
very
good
boy
isn
t
he

