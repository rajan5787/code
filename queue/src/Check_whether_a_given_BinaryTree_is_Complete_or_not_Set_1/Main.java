package Check_whether_a_given_BinaryTree_is_Complete_or_not_Set_1;
import java.util.*;

class Node{
	int d;
	Node left;
	Node right;
	Node(int d){
		this.d =d;
		this.left = this.right = null;
	}
}

class Tree{
	Node root;
	Tree(){
		root = null;
	}
	
	boolean find(){
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		boolean flag = false;
		
		while(!q.isEmpty()){
			
			Node temp = q.poll();
			if(temp.left!=null){
				q.add(temp.left);
			
				if(flag==true)
					return false;
			}
			else
				flag = true;
			
			if(temp.right!=null){
				q.add(temp.right);
			
				if(flag==true)
					return false;
			}
			else
				flag = true;
			
			
		}
		return true;
	}
}

public class Main {

	public static void main(String argv[]){
		
		  Tree t = new Tree();
		  t.root  = new Node(1);
		  t.root.left         = new Node(2);
		  t.root.right        = new Node(3);
		  t.root.left.left   = new Node(4);
		  t.root.left.right  = new Node(5);
		  t.root.right.right = new Node(6);
		  
		  if(t.find())
			  System.out.println("Tree is Complete");
		  else 
			  System.out.println("Tree isnot Complete");
	}
}
