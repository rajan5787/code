package Vertical_Sum_in_a_given_BinaryTree_Set1;
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

	BinaryTree(){
		root = null;
	}
	
	HashMap<Integer,Integer> findVerticalSum(Node root){
		if(root==null)
			return null;
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		findVerticalSumUtil(root,0,map);
		return map;
	}
	
	void findVerticalSumUtil(Node root,int n,HashMap<Integer,Integer> map){
		if(root==null)
			return;
		findVerticalSumUtil(root.left,n-1,map);
		int x = map.get(n)==null ? 0 : map.get(n);
		map.put(n,x+root.d);
		findVerticalSumUtil(root.right,n+1,map);
	}
	
}
public class Main {
	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);
		tree.root.left =new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		HashMap<Integer,Integer> map = tree.findVerticalSum(tree.root);
	     
	     if(map!=null)
	    	 System.out.println(map.entrySet());
	}

}
