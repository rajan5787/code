package Tree_traversals_itrrative;

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
	
	void InorderIterretive(Node root){
		
		Stack<Node> s = new Stack<Node>();
		
		Node node = root;
		while(node!=null){
			s.push(node);
			node  = node.left;
		}
		
		while(s.size()>0){
			
			node = s.pop();
			System.out.print(node.d+" ");
			
			if(node.right!=null){
				node = node.right;
				
				while(node!=null){
					s.push(node);
					node  = node.left;
				}
			}
		}
	}
	
	void inorderMorris(Node root){
		
		if(root == null)
			return;
		Node node = root;
		if(node.left==null){
			System.out.print(node.d+" ");
			node = node.right;
		}
		else{
			
			Node pre = node;
			node = node.left;
			
			while(node.right!=null&&node.right!=pre){
				node = node.right;
			}
			if(node.right==null){
				node.right = pre;
				node = pre.left;
			}
			else{
				Node n = node.right;
				node.right = null;
				System.out.print(n.d+" ");
				node = n;
			}
		}
	}
	
}

public class Main {

	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(-2);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(40);
        tree.root.left.right.right = new Node(8);
        tree.root.left.left.right = new Node(2);
        tree.root.left.left.left = new Node(-1);
        
        System.out.println("Inorder");
        tree.InorderIterretive(tree.root);
        System.out.println();
        System.out.println("InorderM");
        tree.InorderIterretive(tree.root);
        tree.inorderMorris(tree.root);
	}
}
