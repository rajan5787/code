package Print_BST_keys_in_the_given_range;

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
	
	void print(Node root,int n1,int n2){
		
		if(root==null)
			return;
		if(root.d<=n2&&root.d>=n1)
			System.out.print(root.d+" ");
		
		if(root.d<n1)
			print(root.right,n1,n2);
		else if(root.d>n2)
			print(root.left,n1,n2);
		else{
			print(root.left,n1,root.d);
			print(root.right,root.d,n2);
		}
	}
}
public class Main {
	public static void main(String argv[]){
		
		 BinaryTree tree = new BinaryTree();
		 	tree.push(20);
	        tree.push(8);
	        tree.push(22);
	        tree.push(4);
	        tree.push(12);
	        tree.print(tree.root, 10, 25);
	}
}
