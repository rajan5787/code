package Reverse_alternate_levels_of_a_perfect_binarytree;

class Node{
	char d;
	 Node left,right;
	
	Node(char d){
		this.d  = d;
		this.left = this.right = null;
	}
}

class BinaryTree{
	
	Node root;
	
	BinaryTree(){
		root = null;
	}
	
	void alter(Node root1,Node root2,int l){
		
		if(root1==null||root2==null)
			return;
		System.out.println("+ "+l);
		if(l%2==0){
			char x = root1.d;
			root1.d = root2.d;
			root2.d = x;
		}
			
		alter(root1.left,root2.right,++l);
		alter(root1.right,root2.left,++l);
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
		tree.root = new Node('a');
		tree.root.left = new Node('b');
	    tree.root.right = new Node('c');
	    tree.root.left.left = new Node('d');
	    tree.root.left.right = new Node('e');
	    tree.root.right.left = new Node('f');
	    tree.root.right.right = new Node('g');
	    tree.root.left.left.left = new Node('h');
	    tree.root.left.left.right = new Node('i');
	    tree.root.left.right.left = new Node('j');
	    tree.root.left.right.right = new Node('k');
	    tree.root.right.left.left = new Node('l');
	    tree.root.right.left.right = new Node('m');
	    tree.root.right.right.left = new Node('n');
	    tree.root.right.right.right = new Node('o');
	    tree.alter(tree.root.left, tree.root.right,0);
	    tree.print(tree.root);
	 
	}
}
