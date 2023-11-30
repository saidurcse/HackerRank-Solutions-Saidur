https://www.hackerrank.com/challenges/dynamic-array/problem


import java.io.*;
import java.util.*;

public class Simple {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int input = in.nextInt();
		int lastAnswer = 0;

		// Creating 2-D Array List
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			arr.add(new ArrayList<Integer>());
		}

		int number, x, y;

		// Performing the querying
		for (int i = 0; i < input; i++) {
			number = in.nextInt();
			x = in.nextInt();
			y = in.nextInt();

			// Original sequence list from the input
			ArrayList<Integer> sequence = arr.get(((x ^ lastAnswer) % N));

			if (number == 1) {
				sequence.add(y);//Querying number 1
			} else if (number == 2) {
				lastAnswer = sequence.get(y % sequence.size());// Querying number 2
				System.out.println(lastAnswer);
			}
		}
		
	}
}

Sample Input:

2 5
1 0 5
1 1 7
1 0 3
2 1 0
2 1 1

Sample Output:

7
3