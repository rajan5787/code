package Deepest_left_leaf_node_in_a_binarytree;

class Node{
	int d;
	Node left,right;
	Node(int d){
		this.d = d;
		this.left = this.right = null;
	}
}

class max{
	int m;
	Node n;
}

class BinaryTree{
	
	Node root;
	max m = new max();
	BinaryTree(){
		root = null;
	}
	
	void maxdepth(Node root,boolean flag,int level){
		if(root==null)
			return;
		if(root.left==null&&root.right==null&&flag){
			if(level>m.m){
				m.m = level;
				m.n = root;
			}
		}
		maxdepth(root.left,true,level+1);
		maxdepth(root.right,false,level+1);
	}
}
public class Main {
	public static void main(String argv[]){
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.left.right = new Node(7);
        tree.root.right.right.right = new Node(8);
        tree.root.right.left.right.left = new Node(9);
        tree.root.right.right.right.right = new Node(10);
        tree.maxdepth(tree.root,true,0);
        System.out.println(tree.m.n.d);
	}
}
