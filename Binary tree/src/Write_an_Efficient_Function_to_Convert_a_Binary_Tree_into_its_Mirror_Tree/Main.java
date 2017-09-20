package Write_an_Efficient_Function_to_Convert_a_Binary_Tree_into_its_Mirror_Tree;

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
	
	void creatMirror(Node root){
		
		if(root == null)
			return;

		if(root.left!=null&&root.right!=null){
			Node node = root.left;
			root.left = root.right;
			root.right = node;
			creatMirror(root.left);
			creatMirror(root.right);
		}
		else if(root.left==null&&root.right!=null){
			
			root.left = root.right;
			root.right = null;
			creatMirror(root.left);
		}
		else if(root.left!=null&&root.right==null){
			
			root.right = root.left;
			root.left = null;
			creatMirror(root.right);
		}
		
	}
	
	void printInorder(Node root){
		
		if(root == null)
			return;
		
		printInorder(root.left);
		System.out.print(root.d+" ");
		printInorder(root.right);
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
        
        tree.printInorder(tree.root);

        System.out.println();
        tree.creatMirror(tree.root);
        tree.printInorder(tree.root);
        
	}

}
