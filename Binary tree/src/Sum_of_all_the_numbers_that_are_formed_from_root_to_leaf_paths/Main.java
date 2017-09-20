package Sum_of_all_the_numbers_that_are_formed_from_root_to_leaf_paths;

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
	
	int print(Node root,String s){
		if(root==null)
			return 0;
		if(root.left==null&&root.right==null){
			System.out.println(s+""+root.d);
			return Integer.parseInt(s+""+root.d);
		}
		return print(root.left,s+""+root.d)+
		print(root.right,s+""+root.d);
	}
}

public class Main {
	public static void main(String argv[]){
		BinaryTree tree = new BinaryTree();
		  tree.root = new Node(6);
	        tree.root.left = new Node(3);
	        tree.root.right = new Node(5);
	        tree.root.right.right = new Node(4);
	        tree.root.left.left = new Node(2);
	        tree.root.left.right = new Node(5);
	        tree.root.left.right.right = new Node(4);
	        tree.root.left.right.left = new Node(7);
	        System.out.println(tree.print(tree.root,""));
	}
}
