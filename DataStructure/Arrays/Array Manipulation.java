https://www.hackerrank.com/challenges/crush/problem

import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		        
		long[] arr = new long[n];
		        
		int lower;
		int upper;
		long sum;

		for(int i=0;i<n;i++) arr[i]=0;

		for(int i=0;i<m;i++){
		    lower=scan.nextInt();
		    upper=scan.nextInt();
		    sum=scan.nextInt();
		    arr[lower-1]+=sum;
		    if(upper<n) arr[upper]-=sum; 
		    //System.out.println(arr[lower-1]);
		    //System.out.println(arr[upper]);
		}
		        
		long max=0;
		long temp=0;

		for(int i=0;i<n;i++){
		    temp += arr[i];
		    if(temp> max) max=temp;
		}

		System.out.println(max);
	}

}


Sample Input:

5 3
1 2 100
2 5 100
3 4 100

Sample Output:

200
