https://www.hackerrank.com/challenges/java-end-of-file

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int i=1;
        while(sc.hasNext()){        	
        	System.out.println(i + " " + sc.nextLine());
        	i++;
        }
    }
}

Sample Input:

Hello world
I am a file
Read me until end-of-file.

Sample Output:

1 Hello world
2 I am a file
3 Read me until end-of-file.