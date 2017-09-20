package Print_Left_View_of_a_BinaryTree;

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
	int maxlevel = -1;
	int odddepth = 0;
	BinaryTree(){
		root = null;
	}
	
	void leftview(Node root,int level){
		
		if(root==null)
			return;
		if(level>maxlevel){
			System.out.print(root.d+" ");
			maxlevel = level;
		}
		
		leftview(root.left,level+1);
		leftview(root.right,level+1);
	}
}
public class Main {

	public static void main(String argv[]){
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(12);
        tree.root.left = new Node(5);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(9);
        tree.root.left.left.left = new Node(1);
        tree.root.left.right.left = new Node(1);
        tree.leftview(tree.root, 0);
	}
}
