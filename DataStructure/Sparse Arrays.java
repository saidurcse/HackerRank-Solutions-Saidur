https://www.hackerrank.com/challenges/sparse-arrays/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Simple {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    ArrayList<String> name=new ArrayList<String>();
	    for(int i=0;i<n;i++)
	        name.add(sc.next());
	    int q=sc.nextInt();
	    for(int i=0;i<q;i++)
	        System.out.println(Collections.frequency(name,sc.next()));
	}
}

Sample Input:

4
aba
baba
aba
xzxb
3
aba
xzxb
ab

Sample Output:

2
1
0
