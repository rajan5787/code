package Root_to_leaf_path_sum_equal_to_a_given_number;

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
	

	void find(Node root,int sum,int total){
		if(root==null)
			return;
		if(root.left==null&&root.right==null){
			if(total==sum+root.d)
				System.out.println("YES");
		}
		else{
				
			sum+= root.d;
			find(root.left,sum,total);
			find(root.right,sum,total);
		}
	}
}
public class Main {
	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
        tree.find(tree.root,0,10);
	}

}
