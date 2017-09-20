package Tree_Traversals;

import java.util.*;
class Node{
	
	int data;
	Node left,right;
	
	Node(int data){
		this.data = data;
		this.left = this.right = null;
	}
}

class BinaryTree{
	
	Node root;
	
	BinaryTree(){
		this.root = null;
	}
	
	void printPreorder(Node root){
		
		if(root!= null){
		System.out.print(root.data+" ");
		printPreorder(root.left);
		printPreorder(root.right);
		}
	}
	

	void printInorder(Node root){
		
		if(root!= null){
		printInorder(root.left);
		System.out.print(root.data+" ");
		printInorder(root.right);
		}
	}
	

	void printPostorder(Node root){
		
		if(root == null)
			return;
		
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(root.data+" ");

		
	}
	void printLevelorderQ(Node root){
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			Node n = q.poll();
			System.out.print(n.data+" ");
			if(n.left!=null)
				q.add(n.left);
			if(n.right!=null)
				q.add(n.right);
		}
		
	}
	
	void printLevelorderH(Node root){
		
		if(root==null)
			return;
		int h = treeHight(root);
		//System.out.println("hh "+h);
		for(int i=1;i<=h;i++)
			levelorder(root,i);
	}
	void levelorder(Node root,int level){
		

		if(root==null)
			return;
		if(level==1)
			System.out.print(root.data + " ");
		else{
			
			levelorder(root.left,level-1);
			levelorder(root.right,level-1);
		}
	}
	
	int treeHight(Node root){
		
		if(root==null)
			return 0;
		else{
		int lefth = treeHight(root.left);
		int righth = treeHight(root.right);
		
		return Math.max(lefth, righth)+1;
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
        
        System.out.println("PreOrder");
        tree.printPreorder(tree.root);
        System.out.println();
        System.out.println("InOrder");
        tree.printInorder(tree.root);
        System.out.println();
        System.out.println("PostOrder");
        tree.printPostorder(tree.root);
        System.out.println();
        System.out.println("LevelOrderQ");
        tree.printLevelorderQ(tree.root);
        System.out.println();
        System.out.println("LevelOrderH");
        tree.printLevelorderH(tree.root);
 		
	}
}
