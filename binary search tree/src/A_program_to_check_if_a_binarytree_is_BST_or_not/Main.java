package A_program_to_check_if_a_binarytree_is_BST_or_not;

class Node{
	int d;
	Node left,right;
	Node(int d){
		this.d = d;
		this.left=null;
		this.right = null;
	}
}
class BinaryTree{
	Node root;
	BinaryTree(){
		root = null;
	}
	
	boolean check(Node root,int min,int max){
		if(root==null)
			return true;
		if(root.d<min||root.d>max)
			return false;
		
		return check(root.left,min,root.d-1)&&check(root.right,root.d+1,max);
		
	}
}
public class Main {

	public static void main(String argv[]){
		
		 BinaryTree tree = new BinaryTree();
	        tree.root = new Node(4);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(5);
	        tree.root.left.left = new Node(1);
	        tree.root.left.right = new Node(3);
	        System.out.println(tree.check(tree.root, -1000, 10000));
	}
}
