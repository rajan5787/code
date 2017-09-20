package Move_last_element_to_front;


public class Main {

	public static void main(String argv[]){
		LinkedList l = new LinkedList();
		l.push(5);
		l.push(4);
		l.push(3);
		l.push(2);
		l.push(1);

		l.print();
		System.out.println();
		l.swap();
		l.print();

	}
}


class LinkedList{
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head;
	public void push(int data){
		
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	public void print(){
		
		Node curr = head;
		while(curr!=null){
			
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
	
	public void swap(){
		
		Node curr = head;
		Node prev = null;
		while(curr.next!=null){
			prev = curr;
			curr = curr.next;
		}
		
		curr.next = head;
		head = curr;
		prev.next = null;
		
	}
}
