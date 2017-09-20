package Diameter_of_a_BinaryTree;

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
	
	int findDiameter(Node root,Height h){
	
		Height lh = new Height(), rh = new Height();
		
		if(root==null){
			h.h = 0;
			return 0;
		}
		else{
			lh.h++;
			rh.h++;
			int ld = findDiameter(root.left,lh);
			int rd = findDiameter(root.right,rh);
			
			return Math.max(lh.h+rh.h+1, Math.max(ld, rd)+1);
		}
	}
	
}
public class Main {
	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(50);
        tree.root.left = new Node(7);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(1);
        tree.root.right.right = new Node(30);
        System.out.println(tree.findDiameter(tree.root, new Height()));
	}
}
