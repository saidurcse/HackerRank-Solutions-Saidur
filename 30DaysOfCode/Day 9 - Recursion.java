import java.io.*;
import java.util.*;

class Calculation{
    int factorial(int n){        
        if(n<=1)
            return 1;
        return n * factorial(n-1);
    }   
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);        
        int n = in.nextInt();
        
        Calculation obj = new Calculation();
        int a = obj.factorial(n); 
        System.out.print(a);   
        
    }    
}

Sample Input:

3

Sample Output:

6