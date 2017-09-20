package Find_the_largest_BST_subtree_in_a_given_BinaryTree_Set1;

class Node{
	int d;
	Node left,right;
	Node(int d){
		this.d = d;
		this.left=null;
		this.right = null;
	}
}
class BinaryTree{
	Node root;
	BinaryTree(){
		root = null;
	}
	Node node = null;
	boolean find(Node root){
		if(root==null||(root.left==null&&root.right==null))
			return true;
		boolean left = find(root.left);
		boolean right = find(root.right);
		if(left&&right){
			if(root.left!=null&&root.right!=null){
				if(root.d<root.right.d&&root.d>root.left.d){
					node = root;
					return true;
				}
				else
					return false;				
			}
			else if(root.left==null){
				if(root.d<root.right.d){
					node = root;
					return true;
				}
				else
					return false;
			}
			else{
				if(root.d>root.left.d){
					node = root;
					return true;
				}
				else
					return false;
			}
		}
		else
			return false;
	}
}
public class Main {
	public static void main(String argv[]){
		
		 BinaryTree tree = new BinaryTree();
		 tree.root = new Node(15);
		 tree.root.left        = new Node(2);
		  tree.root.right       = new Node(60);
		  tree.root.left.left  = new Node(5);
		  tree.root.left.right = new Node(20);
		  tree.root.right.left  = new Node(55);
		  tree.root.right.left.left  = new Node(45);
		  tree.root.right.right = new Node(70);
		  tree.root.right.right.left = new Node(65);
		  tree.root.right.right.right = new Node(80);
		  tree.find(tree.root);
		  if(tree.node!=null)
			  System.out.println(tree.node.d);
		  else
			  System.out.println("Not found");
	}
	
}
