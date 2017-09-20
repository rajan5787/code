package Level_order_traversal_in_spiral_form;
import java.util.*;

class Node{
	int d;
	Node left,right;
	
	Node(int d){
		this.d  = d;
		this.left = this.right = null;
	}
}

class BinaryTree{
	
	Node root;
	BinaryTree(){
		root = null;
	}

	void printSpiral(Node root){
		
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		
		s1.push(root);
		while(!s1.isEmpty()||!s2.isEmpty()){
			
			while(!s1.isEmpty()){
				Node n = s1.pop();
				System.out.print(n.d+" ");
				if(n.right!=null)
					s2.push(n.right);

				if(n.left!=null)
					s2.push(n.left);
			}
			
			while(!s2.isEmpty()){
				Node n = s2.pop();
				System.out.print(n.d+" ");
				
				if(n.left!=null)
					s1.push(n.left);

				if(n.right!=null)
					s1.push(n.right);
			}
		}
	}
}
public class Main {

	public static void main(String argv[]){
		
		
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(12);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(25);
        tree.root.left.right = new Node(30);
        tree.root.right.left = new Node(36);
        
        tree.printSpiral(tree.root);
	}
}
