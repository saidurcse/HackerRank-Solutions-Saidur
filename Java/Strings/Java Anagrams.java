https://www.hackerrank.com/challenges/java-anagrams

import java.io.*;
import java.util.*;

public class Solution {

	static boolean isAnagram(String a, String b) {
		
		char arr[] = a.toLowerCase().toCharArray();
		char arr1[] = b.toLowerCase().toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
				
		return Arrays.equals(arr, arr1);
	}
 public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	String a = scan.next();
	String b = scan.next();
	scan.close();
	boolean ret = isAnagram(a, b);
	System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
}

Sample Input 0:

anagram
margana

Sample Output 0:

Anagrams

