package Remove_all_node_which_dont_lie_in_any_path_with_sum_k;

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
	
	Node remove(Node root,int sum){
		if(root==null)
			return null;
		root.left = remove(root.left,sum-root.d);
		root.right = remove(root.right,sum-root.d);
		
		if(root.left==null&&root.right==null){
			if(root.d<sum){
				root=null;
				return null;
				
			}
		}
		
		return root;

	}
	
	void print(Node root){
		if(root==null)
		return;
		print(root.left);
		System.out.println(root.d+" ");
		print(root.right);
	}
}
public class Main {

	public static void main(String argv[]){
		BinaryTree tree = new BinaryTree();
		int k = 45;
	    tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.left.left.left = new Node(8);
		tree.root.left.left.right = new Node(9);
		tree.root.left.right.left = new Node(12);
		tree.root.right.right.left = new Node(10);
		tree.root.right.right.left.right = new Node(11);
		tree.root.left.left.right.left = new Node(13);
		tree.root.left.left.right.right = new Node(14);
		tree.root.left.left.right.right.left = new Node(15);

		tree.remove(tree.root,k);
        tree.print(tree.root);
	}

}
