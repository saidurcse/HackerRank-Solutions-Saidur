import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
        	arr[i]=scan.nextInt();
        }
        scan.close();
        
        bubbleSort(arr);
    }
    private static void bubbleSort(int[] arr) {
		
		int endPosition = arr.length - 1;
        int swapPosition,pos=0;
        
        while( endPosition > 0 ) {
            swapPosition = 0;            
            
            for(int i = 0; i < endPosition; i++) {
            	
                if( arr[i] > arr[i + 1] ){
                    // Swap elements 'i' and 'i + 1':
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    
                    swapPosition = i;
                    pos++;
                    //System.out.println("Array is sorted in " + (swapPosition+1) +" swaps.");
                } // end if               
                
            } // end for
            
            endPosition = swapPosition;                        
        }
        System.out.println("Array is sorted in " + pos +" swaps.");
        
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length - 1]);
	}
}



Sample Input 0:

3
1 2 3

Sample Output 0:

Array is sorted in 0 swaps.
First Element: 1
Last Element: 3