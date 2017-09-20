package Find_depth_of_the_deepest_odd_level_leaf_node;

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
	int odddepth = 0;
	BinaryTree(){
		root = null;
	}
	
	int depth(Node root,int depth){
		if(root == null)
			return 0;
		if(root.left==null&&root.right==null&&((depth&1)==1))
			return depth;
		return Math.max(depth(root.left,depth+1), depth(root.right,depth+1));
	}
}

public class Main {

	public static void main(String argv[]){
		BinaryTree b = new BinaryTree();
		b.root = new Node(10);
		b.root.left        = new Node(12);
		b.root.right       = new Node(15);
		b.root.left.left  = new Node(25);
		b.root.left.right = new Node(30);
		b.root.right.left = new Node(36);
		System.out.println(b.depth(b.root,1));
	}

}
