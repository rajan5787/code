package BinarySearchTree_Set2_Delete;

class Node{
	int d;
	Node left,right;
	Node(int d){
		this.d = d;
		this.left = this.right = null;
	}
}
class BST{
	Node root;
	BST(){
		root = null;
	}
	void push(int d){
		root = push(root,d);
	}
	Node push(Node root,int d){
		if(root==null){
			root = new Node(d);
			return root;
		}
		if(d>root.d)
			root.right = push(root.right,d);

		if(d<=root.d)
			root.left = push(root.left,d);
		
		return root;
		
	}
	
	void inorder(Node root){
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.d+" ");
		inorder(root.right);
	}
	
	void delete(int d){
		root = delete(root,d);
	}
	
	Node delete(Node root,int d){
		
		if(root==null)
			return null;
		if(root.d==d){
			if(root.left==null&&root.right==null)
				return null;
			else if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			else{
				int temp = findNode(root.right);
				root.d = temp;
				return root;
			}
		}
		else{
		root.left = delete(root.left,d);
		root.right = delete(root.right,d);
		return root;
		}
	}
	
	int findNode(Node root){
		Node prev = null;
		while(root.left!=null){
			prev = root;
			root = root.left;
		}
			
		int x = root.d;
		prev.left = null;
		return x;
	}
}
public class Main {

	public static void main(String argv[]){
		BST tree = new BST();
		tree.push(50);
        tree.push(30);
        tree.push(20);
        tree.push(40);
        tree.push(70);
        tree.push(60);
        tree.push(80);
        tree.inorder(tree.root);
        tree.delete(20);
        System.out.println();
        tree.inorder(tree.root);
        tree.delete(20);
        System.out.println();
        tree.inorder(tree.root);
        tree.delete(30);
        System.out.println();
        tree.inorder(tree.root);
        tree.delete(50);
        System.out.println();
        tree.inorder(tree.root);
	}
}
