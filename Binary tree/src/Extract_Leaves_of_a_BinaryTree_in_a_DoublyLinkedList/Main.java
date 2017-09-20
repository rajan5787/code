package Extract_Leaves_of_a_BinaryTree_in_a_DoublyLinkedList;

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
	Node head;
	Node prev;
	BinaryTree(){
		root = null;
		head = null;
	}
	
	Node creatBTandDLL(Node root){
		if(root==null)
			return null;
		
		if(root.left==null&&root.right==null){
			if(head==null){
				head = root;
				prev = root;
			}
			else{
				prev.right = root;
				root.left = prev;
				prev = root;
			}
			return null;
		}
		
		root.left = creatBTandDLL(root.left);
		root.right = creatBTandDLL(root.right);
		return root;
	}
	
	void printBT(Node root){
		
		if(root==null)
			return;
		printBT(root.left);
		System.out.print(root.d+" ");
		printBT(root.right);
	}
	
	void printDLL(){
		Node node = head;
		while(node!=null){
			System.out.print(node.d+" ");
			node = node.right;
		}
	}
}
public class Main {
	public static void main(String argv[]){
		BinaryTree tree = new BinaryTree();
		
		 tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	  
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.root.right.right = new Node(6);
	        tree.root.left.left.left = new Node(7);
	        tree.root.left.left.right = new Node(8);
	        tree.root.right.right.left = new Node(9);
	        tree.root.right.right.right = new Node(10);
	  
	       tree.creatBTandDLL(tree.root);
	       tree.printBT(tree.root);
	       System.out.println();
	       tree.printDLL();
	}
}
