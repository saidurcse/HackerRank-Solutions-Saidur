import java.util.*;
import java.io.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class Solution{
    
	public static int getHeight(Node root){
		
	//To Do
	//Write your code here
	
	public static int getHeight(Node root){
      /*if( root == null)
				return -1;
		
			int leftDepth = getHeight(root.left);
			int rightDepth = getHeight(root.right);
			
			return (leftDepth > rightDepth ? leftDepth : rightDepth) + 1;	   */  
		
			int heightLeft = 0;
		    int heightRight = 0;
	
		    if (root.left != null) {
		        heightLeft = getHeight(root.left) + 1;
		    }
		    if (root.right != null) {
		        heightRight = getHeight(root.right) + 1;
		    }
	
		    return (heightLeft > heightRight ? heightLeft : heightRight);		    
    }
	
	
	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	
    public static void main(String args[]){
		
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
			
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            int height=getHeight(root);
            System.out.println(height);
        }	
}



Sample Input:

7
3
5
2
1
4
6
7

Sample Output:

3