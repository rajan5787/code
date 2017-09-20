package Print_all_nodes_at_distance_k_from_a_given_node;

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
	
	void kdistanceDown(Node root,int k){
		
		if(root == null)
			return;
		if(k==0){
			System.out.print(root.d+" ");
			return;
		}
		kdistanceDown(root.left,k);
		kdistanceDown(root.right,k);
		
	}
	
	int kdistance(Node root,int target,int k){
		
		if(root==null)
			return -1;
		if(root.d==target){
			kdistanceDown(root, k);
			return 0;
		}
		int dl = kdistance(root.left,target,k);
		if(dl!=-1){
			if(dl+1==k)
				System.out.print(root.d+" ");
			else
				kdistanceDown(root.right, k-dl-2);
			
			return dl+1;

		}
		
		dl = kdistance(root.right,target,k);
		if(dl!=-1){
			if(dl+1==k)
				System.out.print(root.d+" ");
			else
				kdistanceDown(root.left, k-dl-2);
			
			return dl+1;

		}
		return -1;
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
        tree.kdistance(tree.root, 12, 2);
	}
}
