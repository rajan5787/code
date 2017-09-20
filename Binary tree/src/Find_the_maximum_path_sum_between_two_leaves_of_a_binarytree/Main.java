package Find_the_maximum_path_sum_between_two_leaves_of_a_binarytree;

class Node{
	int d;
	 Node left,right;
	
	Node(int d){
		this.d  = d;
		this.left = this.right = null;
	}
}

class Max{
	int m=-10000;
}
class BinaryTree{
	
	Node root;
	
	BinaryTree(){
		root = null;
	}
	
	int maxPath(Node root,Max m){
		
		if(root==null)
			return 0;
		if(root.left==null&&root.right==null){
			return root.d;
		}
		
		int left = maxPath(root.left,m);
		int right = maxPath(root.right,m);
		
		if(root.left!=null&&root.right!=null){
			if(m.m<left+right+root.d){
				m.m = left+right+root.d;
			//	System.out.println(m.m+" "+root.d);
			}
			return Math.max(left,right)+root.d;
		}
		
		return (root.left==null) ? right+root.d : left+root.d;
	}
	
	int maxPath(Node root){
		Max m  = new Max();
		maxPath(root,m);
		return m.m;
		
	}
}
public class Main {
	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(-15);
        tree.root.left = new Node(5);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(-8);
        tree.root.left.right = new Node(1);
        tree.root.left.left.left = new Node(2);
        tree.root.left.left.right = new Node(6);
        tree.root.right.left = new Node(3);
        tree.root.right.right = new Node(9);
        tree.root.right.right.right = new Node(0);
        tree.root.right.right.right.left = new Node(4);
        tree.root.right.right.right.right = new Node(-1);
        tree.root.right.right.right.right.left = new Node(10);
        System.out.println(tree.maxPath(tree.root));
	}
}
