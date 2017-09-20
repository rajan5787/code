package Remove_BST_keys_outside_the_given_range;

class Node{
	int d;
	Node left,right;
	Node(int d){
		this.d = d;
		this.left=null;
		this.right = null;
	}
}
class BinaryTree{
	Node root;
	BinaryTree(){
		root = null;
	}
	
	void push(int d){
		root = insert(root,d);
	}
	Node insert(Node root,int d){
		
		if(root==null)
			return new Node(d);
		if(root.d>=d)
			root.left = insert(root.left,d);
		else
			root.right = insert(root.right,d);
		
		return root;
	}
	
	Node delete(Node root,int n1,int n2){
		
		if(root==null)
			return null;
		
		root.left = delete(root.left,n1,n2);
		root.right = delete(root.right,n1,n2);
		
		if(root.d<n1){
			Node t = root.right;
			root = null;
			return t;
		}
		else if(root.d>n2){
			Node t = root.left;
			root = null;
			return t;
		}
		else{
			return root;
		}
	}
	
	void print(Node root){
		if(root == null)
			return;
		print(root.left);
		System.out.print(root.d+" ");
		print(root.right);
	}
	
}
public class Main {
	public static void main(String argv[]){
		
		 BinaryTree tree = new BinaryTree();
		 	tree.push(50);
	        tree.push(6);
	        tree.push(-13);
	        tree.push(14);
	        tree.push(-8);
	        tree.push(15);
	        tree.push(13);
	        tree.push(7);
	        tree.print(tree.root);
		    System.out.println();
		    tree.root = tree.delete(tree.root, -10, 13);
		    tree.print(tree.root);
	}
}
