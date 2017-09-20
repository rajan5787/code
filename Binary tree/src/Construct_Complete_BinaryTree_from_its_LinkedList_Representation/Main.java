package Construct_Complete_BinaryTree_from_its_LinkedList_Representation;
import java.util.*;

class ListNode{
	int d;
	ListNode next;
	ListNode(int d){
		this.d = d;
		this.next = null;
	}
}

class Node{
	int d,x;
	Node left,right;
	
	Node(int d){
		this.d = d;
		this.left = this.right = null;
	}
}

class BinaryTree{
	Node root;
	ListNode head;
	
	BinaryTree(){
		root = null;
	}
	void push(int new_data) 
    {
        ListNode new_node = new ListNode(new_data);  
        new_node.next = head;
        head = new_node;
    }
  
	Node convert(Node root){
		
		Queue<Node> q = new LinkedList<Node>();
		
		if(head==null){
			root = null;
			return root;
		}
		root = new Node(head.d);
		q.add(root);	
		head = head.next;
		
		while(head!=null){
			
			Node temp = q.poll();
			Node left = null,right =null;
			left = new Node(head.d);
			q.add(left);
			head = head.next;
			
			if(head!=null){
				right = new Node(head.d);
				q.add(right);
				head = head.next;
			}
			temp.left = left;
			temp.right = right;

		}
		
		return root;
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
		tree.push(36);
        tree.push(30);
        tree.push(25);
        tree.push(15);
        tree.push(12);
        tree.push(10); 
        tree.root = tree.convert(tree.root);
        tree.print(tree.root);
	}


}
