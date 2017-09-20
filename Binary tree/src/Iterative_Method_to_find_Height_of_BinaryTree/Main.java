package Iterative_Method_to_find_Height_of_BinaryTree;

import java.util.*;

class Node{
	int d;
	Node left,right;
	Node(int d){
		this.d = d;
		this.left = this.right = null;
	}
}

class BinaryTree{
	
	Node root;
	BinaryTree(){
		root = null;
	}
	
	int findHeight(Node root){
		int height = 0;

		if(root==null)return 0;
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(true){
			
			int count  = q.size();
			if(count==0)
				return height;

			height++;
			while(count>0){
			
				Node temp = q.poll();
				if(temp.left!=null){
					q.add(temp.left);
				}
				if(temp.right != null)
					q.add(temp.right);
				count--;
			}
			
		}
		
	}
}

public class Main {

	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println(tree.findHeight(tree.root));
	
	}


}
