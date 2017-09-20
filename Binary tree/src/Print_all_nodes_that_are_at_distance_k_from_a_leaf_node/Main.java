package Print_all_nodes_that_are_at_distance_k_from_a_leaf_node;

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
	void findnode(Node root,int path[],boolean visited[], int len,int k){
		if(root==null)
			return;
		path[len] = root.d;
		visited[len] = false;
		len++;
		
		if(root.left==null&&root.right==null&&len-k>0&&visited[len-k-1]==false){
			System.out.print(path[len-k-1]+" ");
			visited[len-k-1] = true;
			return;
		}
		
		findnode(root.left,path,visited,len,k);
		findnode(root.right,path,visited,len,k);
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
	        tree.findnode(tree.root, new int[1000], new boolean[1000], 0, 2);
	}
}
