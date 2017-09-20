package Delete_Alternet_e;


public class Main {
public static void main(String argv[]){
		
		LinkedList l = new LinkedList();
		l.push(1);
		l.push(2);
		l.push(3);
		l.push(3);
		l.push(2);
		l.push(1);
		l.print();
		System.out.println();
		l.alternet();
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
	
	public void alternet(){
		
		Node curr = head.next;
		Node prev = head;
		
		while(curr.next!=null){
			
			Node temp = curr.next;
			prev.next = curr.next;
			curr = null;
			prev = temp;
			curr = prev.next;
			
		}
	}
}


