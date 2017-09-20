package Remove_duplicates_from_unsorted_linkedlist;

import java.util.HashSet;

class Remove_duplicates_from_unsorted_linkedlist {

	public static void main(String argv[]){
		
		LinkedList l = new LinkedList();
		l.push(5);
		l.push(4);
		l.push(2);
		l.push(3);
		l.push(4);
		l.push(5);
		l.print();
		l.removeDuplicate();
		System.out.println();
		l.print();
		
	}
}

class LinkedList{
	
	
	class Node{
		
		int d;
		Node next;
		
		Node(int d){
			this.d = d;
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
			
			System.out.print(curr.d+" ");
			curr = curr.next;
			
		}
	}
	
	public void removeDuplicate(){
		
		Node prev = null;
		Node curr = head;
		HashSet<Integer> h = new HashSet<>();
		
		while(curr!=null){
			
			if(!h.contains(curr.d)){
				h.add(curr.d);
				prev = curr;
				curr = curr.next;
			}
			else{
				
				prev.next = curr.next;
				curr = null;
				curr = prev.next;
				
			}			
		}
	}
}


