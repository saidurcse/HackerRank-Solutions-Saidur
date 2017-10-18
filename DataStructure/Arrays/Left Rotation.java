https://www.hackerrank.com/challenges/array-left-rotation/problem


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Simple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; a[i] = scan.nextInt(), i++)
			;
		d = d % n;
		// System.out.println("d: " + d);
		for (int i = d; i < n; i++)
			System.out.print(a[i] + " ");

		for (int i = 0; i < d; i++)
			System.out.print(a[i] + " ");
	}

}

Sample Input:

5 4
1 2 3 4 5

Sample Output:

5 1 2 3 4


Solution Explanation:

Now you understand what is the problem, we just have to shift the elements of an array to the left as many times
as our second input value. so if the array is [7 6 8 9 ]  and shift-value d=2 this means for the first time
array will be [ 6 8 9 7] and after second rotation it will be [ 8 9 7 6].

Let’s think about how we will do it in programming. First logic is very easy:
just take input in the array and take the value of d. if d>n  we will take the remainder because after
n rotation array will be the same. so d=d%n  now we are following the position print out concept.

what is position print out concept?
because we know the value of d so, we will print that element whose index is d.

again see the above example.  a=[7 6 8 9 ]  and d=2

here see carefully a[d]=a[2]=8 so we will print 8 then 9. i.e; first loop will be from d to the last index
and the second loop will be from beginning to d.

8 and 9 from the first loop, and 7 6 from the second loop.