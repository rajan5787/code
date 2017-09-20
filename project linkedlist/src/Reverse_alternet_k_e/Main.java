package Reverse_alternet_k_e;


public class Main {
public static void main(String argv[]){
		
		LinkedList l = new LinkedList();
		l.push(1);
		l.push(2);
		l.push(3);
		l.push(4);
		l.push(5);
		l.push(6);
		l.print();
		System.out.println();
		l.head = l.reverse(l.head,2);
		l.print();
		
		
	}
}

	
class LinkedList{

class Node{
	
	int data;
	Node next;
	Node(int d){
		this.data = d;
		this.next = null;
	}
}
	
	Node head;
	public void push(int data){
		
		if(head==null)
			head = new Node(data);
		else{
			
			Node curr = head;
			Node prev = head;
			while(curr!=null){
				prev = curr;
				curr = curr.next;
			}
			
			prev.next = new Node(data);
		}
	}
	
	public void print(){
		Node curr = head;
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
	
	public Node reverse(Node head,int x){
		
		Node curr = head;
		Node prev = null;
		Node next = null;
		int count = 0;
		while(count<x&&curr!=null){
			
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
			
		}
		
		if(head!=null){
			head.next = curr;
		}
		count = 0;
		
		while(count<x-1&&curr!=null){
			
			curr = curr.next;
			count++;
		}
		
		
		if(curr!=null){
			curr.next = reverse(curr.next,x);
		}
		
		return prev;
	}
	}