package Reverse_Level_Order_Traversal;
import java.util.*;

class Node{
	int d,x;
	Node left,right;
	
	Node(int d){
		this.d = d;
		this.left = this.right = null;
	}
}

class BinaryTree{
	Node root;
	
	BinaryTree(){
		root = null;
	}
	
	void printLevelOrderReverseIterat(Node root){
		
		Stack<Node> s = new Stack<Node>();
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(root);
		while(!q.isEmpty()){
			
			Node temp = q.poll();
			s.push(temp);
			
			if(temp.right!=null)
				q.add(temp.right);
			if(temp.left!=null)
				q.add(temp.left);
		}
		
		while(!s.isEmpty()){
			Node temp = s.pop();
			System.out.print(temp.d+" ");
		}
		
	}
	void printLevelOrderReverseRec(Node root){
		
		int h = height(root);
		for(int i = h;i>=1;i--){
			printLevelOrderReverceRec(root,i);
		}
	}
	
	void printLevelOrderReverceRec(Node root,int h){
		
		if(root == null)
			return;
		if(h==1)
			System.out.print(root.d+" ");
		printLevelOrderReverceRec(root.left,h-1);
		printLevelOrderReverceRec(root.right,h-1);
	}

	int height(Node root){
		if(root==null)
			return 0;
		return Math.max(height(root.left),height(root.right))+1;
	}
}
public class Main {

	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
		 tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	       tree.printLevelOrderReverseRec(tree.root);
	       System.out.println();
	       tree.printLevelOrderReverseIterat(tree.root);

	}

}
