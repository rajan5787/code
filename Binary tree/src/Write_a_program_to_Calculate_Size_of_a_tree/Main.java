package Write_a_program_to_Calculate_Size_of_a_tree;


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
	
	int treeSize(Node root){
		
		if(root == null)
			return 0;
		
		return treeSize(root.left) +treeSize(root.right)+1;
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
     
        System.out.println(tree.treeSize(tree.root));
	}
}
