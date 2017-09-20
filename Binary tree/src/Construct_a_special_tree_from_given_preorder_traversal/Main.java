package Construct_a_special_tree_from_given_preorder_traversal;

class Node{
	int d;
	 Node left,right;
	
	Node(int d){
		this.d  = d;
		this.left = this.right = null;
	}
}

class index{
	int i;
}
class BinaryTree{
	
	Node root;

	BinaryTree(){
		root = null;
	}
	
	Node creatTree(int[] arr,char[] ptr,int n,index index,Node temp){
		
		int t = index.i;
		if(index.i==n)
			return null;
		temp = new Node(arr[index.i]);
		//System.out.println(index.i+"dd "+temp.d+" "+ptr[t]);
		index.i++;
		if(ptr[t]=='N'){
			temp.left = creatTree(arr,ptr,n,index,temp.left);
			temp.right = creatTree(arr,ptr,n,index,temp.right);
			
		}
		
		return temp;
		
	}
	
	void print(Node root){
		if(root == null)
			return;
		print(root.left);
		System.out.print(root.d+" ");
		print(root.right);
	}
	
}
public class Main {
	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
		int arr[] = new int[]{10, 30, 20, 5, 15};
        char ptr[] = new char[]{'N', 'N', 'L', 'L', 'L'};
        int n = arr.length;
        tree.root = tree.creatTree(arr, ptr, n, new index(), tree.root);
        tree.print(tree.root);
	}

}
