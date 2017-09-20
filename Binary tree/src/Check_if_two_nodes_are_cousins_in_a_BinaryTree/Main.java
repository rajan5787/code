package Check_if_two_nodes_are_cousins_in_a_BinaryTree;

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
	static int level = 0;
	BinaryTree(){
		root = null;
	}
	boolean check(Node root,Node n1,Node n2,int templevel){
		if(root==null)
			return false;

		if((root.left==n1&&root.right==n2)||(root.left == n2&&root.right == n1))
			return false;
		if(root==n1||root==n2){
			if(level==0){
				level = templevel;
			}
			else if(level==templevel)
				return true;
			else
				return false;
				
		}
		boolean left = check(root.left,n1,n2,templevel+1);
		boolean right = check(root.right,n1,n2,templevel+1);
		return (left||right);
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
	        tree.root.left.right.right = new Node(15);
	        tree.root.right.left = new Node(6);
	        tree.root.right.right = new Node(7);
	        tree.root.right.left.right = new Node(8);
	        System.out.println(tree.check(tree.root, tree.root.left.left,tree.root.right.right,1));
	       
	}
}
