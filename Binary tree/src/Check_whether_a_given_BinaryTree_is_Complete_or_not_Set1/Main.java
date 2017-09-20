package Check_whether_a_given_BinaryTree_is_Complete_or_not_Set1;

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
	boolean check(Node root){
		if(root == null|| (root.left==null&&root.right==null))
			return true;
		if(root.left==null&&root.right!=null)
			return false;
		return (check(root.left)&&check(root.right));
	}
}
public class Main {

	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		 tree.root.left         = new Node(2);
		  tree.root.right        = new Node(3);
		  tree.root.left.left   = new Node(4);
		  tree.root.left.right  = new Node(5);
		  tree.root.right.left = new Node(6);
		 System.out.println(tree.check(tree.root));
	}
}
