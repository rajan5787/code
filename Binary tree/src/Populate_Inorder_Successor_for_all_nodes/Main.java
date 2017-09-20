package Populate_Inorder_Successor_for_all_nodes;

class Node{
	int d;
	 Node left,right,next;
	
	Node(int d){
		this.d  = d;
		this.left = this.right = this.next = null;
	}
}

class BinaryTree{
	
	Node root;
	static Node node = null;

	BinaryTree(){
		root = null;
	}
	
	void findSuccessor(Node root){
		
		if(root==null)
			return;
		findSuccessor(root.right);
		root.next = node;
		node = root;
		
		findSuccessor(root.left);
	}
	
	void print(Node root){
		
		if(root==null)
			return;
		print(root.left);
		if(root.next!=null)
			System.out.println(root.d+" "+root.next);
		else 
			System.out.println(root.d+" "+-1);

		print(root.right);
	}
}
public class Main {
	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(12);
        tree.root.left.left = new Node(3);
        tree.findSuccessor(tree.root);
        Node ptr = tree.root;
        
        while(ptr.left!=null)
        	ptr = ptr.left;
        while (ptr != null) 
        {
            // -1 is printed if there is no successor
            int print = ptr.next != null ? ptr.next.d : -1;
            System.out.println("Next of " + ptr.d + " is: " + print);
            ptr = ptr.next;
        }
	}

}
