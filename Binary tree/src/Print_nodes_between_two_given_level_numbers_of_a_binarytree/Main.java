package Print_nodes_between_two_given_level_numbers_of_a_binarytree;
import java.util.*;

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
	static int level = 1;
	BinaryTree(){
		root = null;
	}
	
	void print(Node root,int n1,int n2){
		if(root==null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		boolean flag=false;
		while(!q.isEmpty()){
			
			int count = q.size();
			
			while(count>0){
				Node temp= q.poll();
				if(level>=n1&&level<=n2){
					flag = true;
					System.out.print(temp.d+" ");
				}
				
			if(temp.left!=null)
				q.add(temp.left);

			if(temp.right!=null)
				q.add(temp.right);
			count--;
			}
			if(flag)
				System.out.println();
			flag = false;
			level++;
			if(level>n2)
				break;
		}
	}
}

public class Main {

	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
		 tree.root = new Node(20);
	        tree.root.left = new Node(8);
	        tree.root.right = new Node(22);
	  
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(12);
	        tree.root.left.right.left = new Node(10);
	        tree.root.left.right.right = new Node(14);
	        tree.print(tree.root, 2, 3);
	}
}
