package Find_next_right_node_of_a_given_key;
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
	
	Node findrightnode(Node root,int k){
		if(root==null)
			return null;
		Queue<Node> q = new LinkedList<Node>();
		Queue<Integer> level = new LinkedList<Integer>();
		q.add(root);
		level.add(0);
		int l = 0;
		while(q.size()!=0){
			Node temp = q.poll();
		//	System.out.println("rajn");
			l = level.poll();
			
			if(k==temp.d){
			if(q.size()==0||l!=level.peek())
				return null;
			
			return q.peek();
			}
		
			if(temp.left!=null){
				q.add(temp.left);
				level.add(l+1);
			}
			if(temp.right!=null){
				q.add(temp.right);
				level.add(l+1);
			}
		}
			return null;

		}
	}


public class Main {
	public static void main(String argv[]){
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(6);
        tree.root.right.right = new Node(5);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(4);
  
        Node aa =tree.findrightnode(tree.root, 10);
        if(aa==null){
        	System.out.println("Not found");
        }
        else
        	System.out.println(aa.d);
        
        aa =tree.findrightnode(tree.root, 2);
        if(aa==null){
        	System.out.println("Not found");
        }
        else
        	System.out.println(aa.d);
        
        aa =tree.findrightnode(tree.root, 6);
        if(aa==null){
        	System.out.println("Not found");
        }
        else
        	System.out.println(aa.d);
        
        aa =tree.findrightnode(tree.root, 5);
        if(aa==null){
        	System.out.println("Not found");
        }
        else
        	System.out.println(aa.d);
        
        aa =tree.findrightnode(tree.root, 8);
        if(aa==null){
        	System.out.println("Not found");
        }
        else
        	System.out.println(aa.d);
        
        aa =tree.findrightnode(tree.root, 4);
        if(aa==null){
        	System.out.println("Not found");
        }
        else
        	System.out.println(aa.d);
        
       }
}
