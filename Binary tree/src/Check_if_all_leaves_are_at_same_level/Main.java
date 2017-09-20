package Check_if_all_leaves_are_at_same_level;

class Node{
	int d;
	Node left,right;
	Node(int d){
		this.d = d;
		this.left = this.right = null;
	}
}
class Leaflevel{
	int i ;
}

class BinaryTree{
	
	Node root;
	int odddepth = 0;
	BinaryTree(){
		root = null;
	}
	
	boolean checkdepth(Node root,int level,Leaflevel leaf){
		
		if(root==null)
			return true;
		if(root.left==null&&root.right==null){
			if(leaf.i==0){
				leaf.i = level;
			}
			else{
				if(leaf.i==level)
					return true;
				else
					return false;
			}
				
		}
		return checkdepth(root.left,level+1,leaf)&&checkdepth(root.right,level+1,leaf);
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
        
        System.out.println(tree.checkdepth(tree.root,0,new Leaflevel()));
	}

}
