package Segregate_even_and_odd_nodes;

public class Main {
public static void main(String argv[]){
		
		LinkedList l = new LinkedList();
		l.push(18);
		l.push(15);
		l.push(16);
		l.push(11);
		l.push(5);
		l.push(6);
		l.push(2);
		l.push(4);
		l.print();
		System.out.println();
		l.segregate();
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
	
	public void segregate(){
		
		Node end = head;
		Node curr = head;
		Node prev=null;
		
		while(end.next!=null){
			end = end.next;
		}
		Node new_end = end;
		
		while(curr.data%2!=0&&curr!=end){
			new_end.next = curr;
			curr = curr.next;
			new_end.next.next = null;
			new_end = new_end.next;
			
		}
		
		if(curr.data%2==0){
			System.out.println("xx");
			head = curr;
		
		while(curr!=end){
			
			if(curr.data%2==0){
				prev = curr;
				curr = curr.next;
			}
			else{
				prev.next = curr.next;
				curr.next = null;
				new_end.next = curr;
				new_end = curr;
				curr = prev.next;
			}
		}
	}
		else
			prev = curr;
		
		if(new_end!=end&&end.data%2!=0){
			prev.next = end;
			new_end.next = null;
		}
	}
	
}