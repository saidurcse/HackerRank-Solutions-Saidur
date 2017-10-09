https://www.hackerrank.com/challenges/java-strings-introduction

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        int len = a.length() + b.length();
        System.out.println(len);

        int compare = a.compareTo(b);

        if(compare > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        a = a.substring(0,1).toUpperCase() + a.substring(1).toLowerCase();
        b = b.substring(0,1).toUpperCase() + b.substring(1).toLowerCase();

        System.out.print(a + " " + b);
        
    }
}

Sample Input:

hello
java

Sample Output:

9
No
Hello Java

Hint:

a.compareTo(b) < 0 // a < b

a.compareTo(b) > 0 // a > b

a.compareTo(b) == 0 // a == b
