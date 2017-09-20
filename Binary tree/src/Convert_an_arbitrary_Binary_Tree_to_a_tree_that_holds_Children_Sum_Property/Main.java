package Convert_an_arbitrary_Binary_Tree_to_a_tree_that_holds_Children_Sum_Property;


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
	
	void creatSumTree(Node node){
	
		int left = 0,right = 0,dif = 0;
		
		if(node == null||node.right==null&&node.left==null)
			return;
		else{
		creatSumTree(node.left);
		creatSumTree(node.right);
	
		if(node.right!=null)
			right = node.right.d;

		if(node.left!=null)
			left = node.left.d;
		
		if(left+right>node.d)
			node.d = left+right;
		else{
			increament(node,node.d-left-right);
		}
	}
	
		
}
	public void increament(Node node,int dif){
		
		if(node.left!=null){
			
			node.left.d += dif;
			increament(node.left,dif);
		}
		else if(node.right!=null){
			node.right.d += dif;
			increament(node.right,dif);
		}
	}
	
	void print(Node root){
		
		if(root==null)
			return;
		print(root.left);
		System.out.print(root.d+" ");
		print(root.right);
	}
}
public class Main {

	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(50);
        tree.root.left = new Node(7);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(1);
        tree.root.right.right = new Node(30);
        
        tree.creatSumTree(tree.root);
        tree.print(tree.root);
	}
}
