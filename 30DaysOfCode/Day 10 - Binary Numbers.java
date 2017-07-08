import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);        
        int n = in.nextInt();
        
        String convert_num = Integer.toBinaryString(n);
        String[] temp = convert_num.split("[0]+");
        //System.out.println(temp[]);
        int max=0;
        for (String s : temp) {
            if (s.length() > max)
                max = s.length();
        }
        System.out.println(max);
    }
}

Sample Input 1:

5

Sample Output 1:

1

Sample Input 2:

13

Sample Output 2:

2