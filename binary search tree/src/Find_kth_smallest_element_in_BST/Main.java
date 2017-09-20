package Find_kth_smallest_element_in_BST;

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
	
	void push(int d){
		root = insert(root,d);
	}
	Node insert(Node root,int d){
		
		if(root==null)
			return new Node(d);
		if(root.d>=d)
			root.left = insert(root.left,d);
		else
			root.right = insert(root.right,d);
		
		return root;
	}
	
	void inorder(Node root){
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.d+" ");
		inorder(root.right);
	}
	int count = 0;
	boolean flag = true;
	void find(Node root,int k,int c){
		
		if(root==null||c>=k)
			return;
		find(root.left,k,c);
		c++;
		if(c==k){
			System.out.print(root.d+" ");
			return;
		}
		find(root.right,k,c);
	}
	/*void find(Node root,int k){
		if(root==null){
			return;
		}
		if(root.left!=null)
		find(root.left,k);
		else
			count++;
		//System.out.println("aa "+root.d+" "+count);
		if(count==k){
			if(flag){
			System.out.println(root.d);
			flag = false;
			}
			return;

		}
		find(root.right,k);
		count++;

	}*/
}
public class Main {
	public static void main(String argv[]){
		
		 BinaryTree tree = new BinaryTree();
		 	tree.push(50);
	        tree.push(30);
	        tree.push(20);
	        tree.push(40);
	        tree.push(70);
	        tree.push(60);
	        tree.push(80);
	        tree.inorder(tree.root);
	        System.out.println();
	        for(int i = 1;i<=8;i++){
	        	tree.count = 0;
	        	tree.find(tree.root, i,0);
	        	//System.out.println();
	        	//tree.find(tree.root, i);
	        	tree.flag = true;
	        	//System.out.println("ffffffffffffffffffff");
	        }
	}
}
