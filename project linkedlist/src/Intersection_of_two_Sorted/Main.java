package Intersection_of_two_Sorted;


public class Main {

	public static void main(String argv[]){
		
		LinkedList l = new LinkedList();
		l.push1(5);
		l.push1(4);
		l.push1(3);
		l.push1(2);
		l.push1(1);
		l.print(l.head1);
		System.out.println();
		
		l.push2(8);
		l.push2(5);
		l.push2(3);
		l.push2(2);
		l.push2(1);
		l.print(l.head2);
		System.out.println();
		l.intersection();
		l.print(l.head3);

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
	
	Node head1;
	Node head2;
	Node head3;

	public void push1(int data){
		
		Node node = new Node(data);
		node.next = head1;
		head1 = node;
	}
	
	public void push2(int data){
		
		Node node = new Node(data);
		node.next = head2;
		head2 = node;
	}
	
	public void print(Node head){
		
		Node curr = head;
		while(curr!=null){
			
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
	
	public Node intersection(){
		
		Node curr1 = head1;
		Node curr2 = head2;
		Node prev = null;
		while(curr1!=null&&curr2!=null){
			if(curr1.data==curr2.data){

				Node node = new Node(curr1.data);
				node.next = head3;
				head3 = node;
				curr1 = curr1.next;
				curr2 = curr2.next;
			}
			else{

			if(curr1.data>curr2.data)
				curr2 = curr2.next;
			else
				curr1 = curr1.next;
		}
		}
		return head3;
	}
}
