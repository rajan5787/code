package Inplace_conversion_of_Sorted_DLL_to_Balanced_BST;


class Node
{
    int d;
    Node next, prev;
 
    Node(int d)
    {
        this.d = d;
        this.next = this.prev = null;
    }
}

class BinaryTree{
	Node head;
	Node prev;
	BinaryTree(){
		head = null;
		prev = null;
	}
	
	Node creat(){
		int n = findLength(head);
		return creat(n);
	}
	
	Node creat(int n){
		
		if(n<=0)
			return null;
		
		
		Node prev = creat(n/2);
		Node root = head;
		root.prev = prev;
		head = head.next;
		root.next = creat(n-n/2-1);
		return root;
		
	}
	int findLength(Node head){
		Node curr = head;
		int count = 0;
		while(curr!=null){
			count++;
			curr = curr.next;
		}
		return count;
	}
	void push(int d){
		Node node = new Node(d);
		node.next = head;
		if(head!=null)
		head.prev = node;
		head = node;
	}
	void printList(Node root){
		Node temp  =root;
		while(temp!=null){
			System.out.print(temp.d+" ");
			temp = temp.next;
		}
	}
	void print(Node root){
		if(root==null)
			return;
		print(root.prev);
		System.out.print(root.d+" ");
		print(root.next);
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
		tree.printList(tree.head);
		Node root = tree.creat();
		System.out.println();
		tree.print(root);
	}
}
