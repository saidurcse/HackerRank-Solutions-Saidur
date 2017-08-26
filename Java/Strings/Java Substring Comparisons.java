https://www.hackerrank.com/challenges/java-string-compare

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        String S = in.next();
        int number = in.nextInt(); 
        
       	/*SortedSet<String> sets = new TreeSet<String>();
        
        for(int i=0;i<=S.length()-number;i++){
        	sets.add(S.substring(i,i+number));
        }
        
        System.out.println(sets.first());
        System.out.println(sets.last());*/
        
        List<String> str = new ArrayList<String>();
        for(int i=0;i<=S.length()-number;i++){
        	str.add(S.substring(i,i+number));
        }
        Collections.sort(str);
        //System.out.println(str);
        System.out.println(str.get(0));
        System.out.println(str.get(str.size()-1));
    }
}

Sample Input 0:

welcometojava
3

Sample Output 0:

ava
wel


