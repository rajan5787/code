package Check_for_Children_Sum_Property_in_a_BinaryTree;

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
	
	boolean check(Node root){
		
		if(root==null)
			return true;
		else if(root.left==null&&root.right==null)
			return true;
		else if(root.left==null&&root.right.d==root.d)
			return true;
		else if(root.right==null&&root.left.d==root.d)
			return true;
		else
			if(root.d == root.left.d+root.right.d)
				return true;
			else
				return false;
		
	}
}

public class Main {
	public static void main(String argv[]){
		
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(2);
        
        if(tree.check(tree.root))
        	System.out.println("YES");
        else
        	System.out.println("NO");
	}
}
