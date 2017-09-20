package Convert_a_given_tree_to_its_Sum_Tree;

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
	
	int creatTree(Node root){
		
		if(root==null)
			return 0;
		
		int left = creatTree(root.left);
		int right = creatTree(root.right);
		//System.out.println(root.d+" "+left+" "+right);
		int num = root.d;
		root.d = left+right;
		return root.d+num;
		
	}
	
	void print(Node root){
		if(root==null)
			return;
		print(root.left);
		System.out.print(root.d+" ");
		print(root.right);
	}
}

public class Main {
	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
		 tree.root = new Node(10);
	     tree.root.left = new Node(-2);
	     tree.root.right = new Node(6);
	     tree.root.left.left = new Node(8);
	     tree.root.left.right = new Node(-4);
	     tree.root.right.left = new Node(7);
	     tree.root.right.right = new Node(5);
	     tree.creatTree(tree.root);
	     tree.print(tree.root);
	}
}
