import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dexpect = in.nextInt();
        int mexpect = in.nextInt();
        int yexpect = in.nextInt();
        int doriginal = in.nextInt();
        int moriginal = in.nextInt();
        int yoriginal = in.nextInt();
        
        int ddiff = (dexpect-doriginal);
        int mdiff = (mexpect-moriginal);
        int ydiff = (yexpect-yoriginal); 
        
        int fine=0;
                
        if (ydiff > 0) {
            fine = 10000;
        }
        else if (mdiff > 0 && ydiff == 0) {
            fine = 500 * mdiff;
        }
        else if (ddiff > 0 && ydiff == 0) {
            fine = 15 * ddiff;
        }
        
        System.out.println(fine);
    }
}

Sample Input:

9 6 2015
6 6 2015

Sample Output:

45
