package Find_the_closest_leaf_in_a_BinaryTree;

class Node{
	char d;
	 Node left,right;
	
	Node(char d){
		this.d  = d;
		this.left = this.right = null;
	}
}
class Min{
	int m;
}
class BinaryTree{
	
	Node root;
	static int level = 1;
	BinaryTree(){
		root = null;
	}
	void findclosestLeaf(Node root,char k){
		Min m = new Min();
		m.m = 10000;
		findclosestLeaf(root,m,k);
		System.out.println(m.m);
	}
	int findclosestLeaf(Node root,Min m,char k){
		
		if(root == null)
			return -1;
		if(root.d==k){
			findClosestLeafDown(root,m,0);
			return 1;
		}
	
		int left = findclosestLeaf(root.left,m,k);
		int right = findclosestLeaf(root.right,m,k);

		if(left>0){

			findClosestLeafDown(root.right,m,left+1);
			return left+1;
		}
		if(right>0){
			findClosestLeafDown(root.left,m,right+1);
		
			return right+1;
		}
		
		return -1;
	}
	
	void findClosestLeafDown(Node root,Min m,int level){
		
		if(root==null)
			return;
		
		if(root.left==null&&root.right==null){
			m.m = Math.min(m.m, level);
			return;
		}
		
		findClosestLeafDown(root.left,m,level+1);
		findClosestLeafDown(root.right,m,level+1);
		
	}
}
public class Main {
	
	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node('A');
		tree.root.left = new Node('B');
		tree.root.right = new Node('C');
		tree.root.right.left = new Node('E');
		tree.root.right.right = new Node('F');
		tree.root.right.left.left = new Node('G');
		tree.root.right.left.left.left = new Node('I');
		tree.root.right.left.left.right = new Node('J');
		tree.root.right.right.right = new Node('H');
		tree.root.right.right.right.left = new Node('H');
		tree.findclosestLeaf(tree.root, 'H');
		tree.findclosestLeaf(tree.root, 'C');
		tree.findclosestLeaf(tree.root, 'E');
		tree.findclosestLeaf(tree.root, 'B');

		

	}
}
