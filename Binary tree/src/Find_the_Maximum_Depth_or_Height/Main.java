package Find_the_Maximum_Depth_or_Height;

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
	
	int findDepth(Node root){
		
		if(root == null)
			return 0;
		return Math.max(findDepth(root.left), findDepth(root.right))+1;
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
        System.out.println(tree.findDepth(tree.root));
	}
}
