package Lowest_Common_Ancestor_in_a_BinaryTree_Set1;

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
	Node findAncestor(Node root,int n1,int n2){
		if(root==null)
			return null;
		if(root.d==n1||root.d==n2)
			return root;
		Node left = findAncestor(root.left,n1,n2);
		Node right = findAncestor(root.right,n1,n2);
		
		if(left!=null&&right!=null)
			return root;
		
		return (left!=null) ? left : right;
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
	        tree.root.right.left = new Node(6);
	        tree.root.right.right = new Node(7);
	        System.out.println(tree.findAncestor(tree.root,4,5).d);
	}
}
