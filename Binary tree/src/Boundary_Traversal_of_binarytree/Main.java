package Boundary_Traversal_of_binarytree;

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
	
	void printBoundary(Node node){
		
		if(node==null)
			return;
		Node temp = root;
		while(temp.left!=null){
			System.out.print(temp.d+" ");
			temp = temp.left;
		}
		
		printleaf(node.left);
		printleaf(node.right);

		temp = node.right;
		while(temp.right!=null){
			System.out.print(temp.d+" ");
			temp = temp.right;
		}
		
	}
	
	void printleaf(Node root){
		if(root == null)
			return;
		printleaf(root.left);

		if(root.left==null&&root.right==null)
			System.out.print(root.d+" ");
		printleaf(root.right);
		
	}
}
public class Main {

	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        tree.root.right = new Node(22);
        tree.root.right.right = new Node(25);
        tree.printBoundary(tree.root);
	}

}
