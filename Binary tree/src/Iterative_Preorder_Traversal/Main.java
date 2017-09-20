package Iterative_Preorder_Traversal;

import java.util.*;
class Node{
	int d;
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
	
	void preOrderItrative(Node root){
		
		if(root == null)
			return;
		
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		
		while(!s.isEmpty()){
			Node temp = s.pop();
			System.out.print(temp.d+" ");
			if(temp.right!=null)
				s.push(temp.right);
			if(temp.left != null)
				s.push(temp.left);
		}
	}
}
public class Main {


	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
        tree.preOrderItrative(tree.root);
	}


}
