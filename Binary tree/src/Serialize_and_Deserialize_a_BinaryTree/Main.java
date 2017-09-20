package Serialize_and_Deserialize_a_BinaryTree;


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
	static int level = 0;
	BinaryTree(){
		root = null;
	}
}

public class Main {

	public static void main(String argv[]){
		
		BinaryTree tree = new BinaryTree();
	}
}
