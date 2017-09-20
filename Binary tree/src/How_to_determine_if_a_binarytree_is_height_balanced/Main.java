package How_to_determine_if_a_binarytree_is_height_balanced;

class Node{
	int d;
	Node left,right;
	
	Node(int d){
		this.d  = d;
		this.left = this.right = null;
	}
}

class Height{
	int h;
}

class BinaryTree{
	
	Node root;
	BinaryTree(){
		root = null;
	}
	
	boolean check(Node root,Height h){
		
		Height lh = new Height(),rh = new Height();
		if(root==null){
			h.h = 0;
			return true;
		}
		
		boolean left = check(root.left,lh);
		boolean right =check(root.right,rh);
		
        h.h = (lh.h > rh.h? lh.h: rh.h) + 1;
		
		if(Math.abs(lh.h-rh.h)<=1&&left&&right)
			return true;
		else
			return false;
		
		
	}
	
	int height(Node node){
		if(node==null)
			return 0;
		return Math.max(height(node.right),height(node.left))+1;
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
        tree.root.left.left.left = new Node(8);
  
        System.out.println(tree.check(tree.root,new Height()));
	}
}
