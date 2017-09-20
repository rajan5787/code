package Convert_a_given_BinaryTree_to_Doubly_LinkedList_Set2;



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
	BinaryTree(){
		root = null;
	}
	
	void prevPointer(Node root){
		
		Node node = null;
		if(root !=null){
			prevPointer(root.left);
			root.left = node;
			node = root;
			prevPointer(root.right);
		}
	}
	
	Node nextPointer(Node root){
		
		Node node = null;
		while(root!=null&&root.right!=null)
			root = root.right;
		
		while(root!=null&&root.left!=null){
			node = root;
			root = root.left;
			root.right = node;
		}
		return root;
	}
	void print(Node root){
		Node node = root;
		while(node!=null){
			System.out.print(node.d+" ");
			node = node.right;
		}
	}
	
	Node BTtoDLL(Node root){
		prevPointer(root);
		return nextPointer(root);

	}
}
public class Main {

	public static void main(String argv[]){
		BinaryTree b = new BinaryTree();
		b.root = new Node(10);
		b.root.left        = new Node(12);
		b.root.right       = new Node(15);
		b.root.left.left  = new Node(25);
		b.root.left.right = new Node(30);
		b.root.right.left = new Node(36);
		b.root = b.BTtoDLL(b.root);
		b.print(b.root);
	}
}
