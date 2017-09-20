package Print_a_BinaryTree_in_Vertical_Order_Set1;
import java.util.*;
import java.util.Map.Entry;

class Node{
	int d;
	Node left,right;
	Node(int d){
		this.d = d;
		this.left = this.right = null;
	}
}

class BinaryTree{
	HashMap<Integer,ArrayList<Integer>> map;
	Node root;
	BinaryTree(){
		root = null;
	}	
	
	void pritVertical(Node root){
		
		 map = new HashMap<Integer,ArrayList<Integer>>();
		 printVerticalUtil(root,0);
		  if(map!=null)
		    	 System.out.println(map.entrySet());
		  
			for(Entry<Integer,ArrayList<Integer>> e: map.entrySet()){
				ArrayList<Integer> arr=e.getValue();
				for(Integer i:arr){
					System.out.print(i+" ");
				}
				System.out.println();
			}
		
	}
	void printVerticalUtil(Node root,int a){
		
		if(root==null)
			return;
		if(root.left!=null)
		printVerticalUtil(root.left,a-1);
		ArrayList<Integer> x = map.get(a)==null ? new ArrayList<Integer>() : map.get(a);
		x.add(root.d);
		map.put(a,x);
		if(root.right!=null)
		printVerticalUtil(root.right,a+1);
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
	        tree.root.right.left = new Node(6);
	        tree.root.right.right = new Node(7);
	        tree.root.right.left.right = new Node(8);
	        tree.root.right.right.right = new Node(9);
	        tree.pritVertical(tree.root);
	}
}
