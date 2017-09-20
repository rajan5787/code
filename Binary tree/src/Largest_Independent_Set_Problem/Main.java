package Largest_Independent_Set_Problem;

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
	
	int find(Node root){
		if(root==null)
			return 0;
		int ex = find(root.left)+find(root.right);
		
		int in = 1;
		if(root.left!=null)
			in+=find(root.left.left)+find(root.left.right);
		if(root.right!=null)
			in+=find(root.right.left)+find(root.right.right);
		
		return Math.max(in, ex);
	
	}
}
public class Main {

	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(20);
		tree.root.left                = new Node(8);
		tree.root.left.left          = new Node(4);
		tree.root.left.right         = new Node(12);
		tree.root.left.right.left   = new Node(10);
		tree.root.right               = new Node(22);
		tree.root.right.right        = new Node(25);
		System.out.println(tree.find(tree.root));
	}
}
