import java.io.*;
import java.util.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
    
	static void levelOrder(Node root){
     /*Queue<Node> queue = new LinkedList<Node>();		
		
		//if(root != null)		
			queue.add(root);
		
			while(!queue.isEmpty()){
				 Node tree = queue.remove();
				 System.out.println(tree.data+" ");
				 
				 if(tree.left != null)
					 queue.add(tree.left);
				 if(tree.right != null)
					 queue.add(tree.right);
			}
            */
    Queue<Node> queue = new LinkedList();
    queue.add(root);
    
    while(!queue.isEmpty()){
        Node current = queue.remove();
        System.out.print(current.data+" ");
        if (current.left!=null) queue.add(current.left);
        if (current.right!=null) queue.add(current.right);
    }
      
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
            levelOrder(root);
        }	
}

Sample Input:

6
3
5
4
7
2
1

Sample Output:

3 2 5 1 4 7 