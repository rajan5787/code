package Iterative_Postorder_Traversal_Set1_Using_Two_Stacks;
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
	
	void printPostOrder(Node node){
		
		if(node == null)
			return;
		
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		
		s1.push(node);
		
		while(!s1.isEmpty()){
			
			Node temp = s1.pop();
			s2.push(temp);
			
			if(temp.left!=null)
				s1.push(temp.left);

			if(temp.right!=null)
				s1.push(temp.right);
		}
		
		while(!s2.isEmpty()){
			Node temp = s2.pop();
			System.out.print(temp.d+" ");
		}
	}

}
public class Main {

	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left                = new Node(2);
		tree.root.left.left          = new Node(4);
		tree.root.left.right         = new Node(5);
		tree.root.right               = new Node(3);
		tree.root.right.left        = new Node(6);

		tree.root.right.right        = new Node(7);
		
		tree.printPostOrder(tree.root);
	}
}
