package Sorted_LinkedList_to_Balanced_BST;

class LinkedNode{
	int d;
	LinkedNode next;
	LinkedNode(int d){
		this.d = d;
		this.next = null;
	}
}
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
	LinkedNode head;
	BinaryTree(){
		root = null;
		head = null;
	}
	
	void push(int d){
		LinkedNode t = new LinkedNode(d);
		t.next = head;
		head = t;
	}
	void creat(){
		int n = findLength(head);
		root = creat(n);
		
	}
	Node creat(int n){
		if(n<=0)
			return null;
		Node  left = creat(n/2);
		Node root = new Node(head.d);
		//System.out.println("node "+root.d);
		root.left = left;
		head = head.next;
		root.right = creat(n-n/2-1);
		return root;
		
	}
	int findLength(LinkedNode head){
		LinkedNode curr = head;
		int count = 0;
		while(curr!=null){
			count++;
			curr = curr.next;
		}
		return count;
	}
	
	void printlist(LinkedNode head){
		LinkedNode curr = head;
		while(curr!=null){
			System.out.print(curr.d+" ");
			curr = curr.next;
		}
	}
	void print(Node root){
		if(root==null)
			return;
		print(root.left);
		System.out.print(root.d+" ");
		print(root.right);
	}
}

public class Main {

	public static void main(String argv[]){
		BinaryTree tree = new BinaryTree();
		tree.push(7);
		tree.push(6);
		tree.push(5);
		tree.push(4);
		tree.push(3);
		tree.push(2);
		tree.push(1);
		tree.printlist(tree.head);
		tree.creat();
		tree.print(tree.root);
 	}
}
