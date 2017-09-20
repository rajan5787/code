package Delete_nodes_have_greater_value_on_rightside;

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
		l.push(3);
		l.print();
		System.out.println();
		l.delete();
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
	
	public void delete(){
		
		Node curr = null;
		Node prev = null;
		
		while(head.data<head.next.data){
			Node temp = head;
			head = head.next;
			temp = null;
		}
		prev = head;
		curr = head.next;
		while(curr.next!=null){
			if(curr.next!=null&&curr.data<curr.next.data){
				
				Node temp = curr.next;
				prev.next = temp;
				curr = null;
				curr = temp;
			}
			else{
				prev = curr;
				curr = curr.next; 
			}
		}
		
	}
	
}