package Convert_a_Binary_Tree_to_a_Circular_Doubly_LinkList;

class Node{
	int d;
	Node left,right;
	
	Node(int d){
		this.d  = d;
		this.left = this.right = null;
	}
}

class BinaryTree{
	
	Node root;
	BinaryTree(){
		root = null;
	}
	
	Node prev = null;
	Node head = null;
	void creatLinkedList(Node root){
		
		if(root==null)
			return;
		creatLinkedList(root.left);
		if(head==null){
			head = root;
			prev = head;
		}
		else{
			
			prev.right = root;
			root.left = prev;
			prev = root;
		}
		creatLinkedList(root.right);
	}
	
	void print(Node root){
		
		if(root==null)
			return;
		print(root.left);
		System.out.print(root.d+" ");
		print(root.right);
	}
	
	void printt(){
		Node n = head;
        //System.out.println(n.d);

		while(n.right!=head){
			System.out.print(n.d+" ");
			n = n.right;
		}
	}
}

public class Main {
public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(12);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(25);
        tree.root.left.right = new Node(30);
        tree.root.right.left = new Node(36);
        
        
        //tree.print(tree.root);
        System.out.println();

        tree.creatLinkedList(tree.root);
        tree.head.left = tree.prev;
        tree.prev.right = tree.head;
        tree.printt();
	
	}

}
