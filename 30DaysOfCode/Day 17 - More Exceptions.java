import java.util.*;
import java.io.*;

//To DO

class Calculator {
	  
	int power(int n, int p) throws Exception {
        if(n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        } else {
            return (int) Math.pow(n, p);
        }
        
    /* 
	    int power = 1;
	    for (int i = 0; i < p; i++) {
	      power *= n;
	    }
	    
	    return power; 
    */
    }
}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}





Sample Input:

4
3 5
2 4
-1 -2
-1 3

Sample Output:

243
16
n and p should be non-negative
n and p should be non-negative