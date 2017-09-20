package findPalindrome;


public class findPalindrome {

	public static void main(String argv[]){
		
		LinkedList l = new LinkedList();
		l.push(1);
		l.push(2);
		l.push(3);
		l.push(3);

		l.push(2);
		l.push(1);
		System.out.println(l.checkpalindrome());
		
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
	
	public void print(Node prev){
		Node curr = prev;
		while(curr!=null){
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	
	public boolean checkpalindrome(){
		
		Node curr = head;
		Node prev = null,mid = null;
		Node curr_next = head;
		
		while(curr_next!=null&&curr_next.next!=null){
		
			curr_next = curr_next.next.next;
			prev = curr;
			curr = curr.next;
		}
		
		if(curr_next!=null){
			
			mid = curr;
			curr = curr.next;
		}
		
		prev.next = null;
		prev = null;
		
		while(curr!=null){
			
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		
		curr= head;
		Node prev2 = prev;
		
		while(curr!=null&&prev2!=null){
			if(curr.data!=prev2.data)
				return false;
			
			curr = curr.next;
			prev2 = prev2.next;
		}
		return true;
	}
}



