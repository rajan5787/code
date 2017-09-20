package print_out_all_of_its_roottoleaf_paths_one_per_line;

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
	int[] arr = new int[10000];
	BinaryTree(){
		root = null;
	}
	
	void printPath(Node root,int len){
		
		if(root==null)
			return;
		
		arr[len++] = root.d;
		
		if(root.left==null&&root.right==null)
			printarray(len);
		else{
			printPath(root.left,len);
			printPath(root.right,len);
		}
	}
	
	void printarray(int len){
		
		for(int i = 0;i<len;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
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
        
        tree.printPath(tree.root, 0);
	
	}


}
