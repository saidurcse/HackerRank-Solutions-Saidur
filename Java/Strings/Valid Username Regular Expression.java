https://www.hackerrank.com/challenges/valid-username-checker/problem


import java.util.Scanner;

class UsernameValidator {
    /*
     * Write regular expression here.
     */
	 
	String pattern = "^[aA-zZ]\\w{7,29}$"; 
	
	/*
	^[a-zA-Z] = first word
	[\w] = any character
	{7,29}$ = number of words
	
	Actually, when ^ is outside of character class, it represents an anchor for the start of the input.
	Similarly, the $ represents the end of the input.
	*/
	 
    public static final String regularExpression = null;
}

public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}

Sample Input 0:

8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007

Sample Output 0:

Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid

