import java.io.*;
import java.util.*;
import java.util.Collections;
import java.util.regex.*;;

public class Solution {

    public static void main(String[] args) {
    
    	Scanner in = new Scanner(System.in);
    	
    	int n = in.nextInt();
    	String emailRegEx = ".+@gmail\\.com$";
    	Pattern pattern = Pattern.compile(emailRegEx);
    	//Map<String, String> map = new HashMap<String, String>();
    	List<String> list = new ArrayList();
    	
    	for(int i=0;i<n;i++){        	
        	String name = in.next();
        	String emailId = in.next();
        	Matcher matcher = pattern.matcher(emailId);
        	if(matcher.find()){
        		list.add(name);
        	}
        	//System.out.println(list);
    	}
    	
    	Collections.sort(list);
    	//Map<String, String> treeMap = new TreeMap<String, String>(map);
    	
    	for(String name : list ){
    		System.out.println(name);
    	}
    	
    }      
}


Sample Input:

6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com

Sample Output:

julia
julia
riya
samantha
tanya
