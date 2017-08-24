https://www.hackerrank.com/challenges/java-date-and-time

import java.util.Scanner;
import java.time.LocalDate;

public class Solution {

    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int day   = scan.nextInt();
        int year  = scan.nextInt();
        scan.close();
        
        /* Create LocalDate instance */
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.getDayOfWeek());
    }
}

Sample Input:

08 05 2015

Sample Output:

WEDNESDAY