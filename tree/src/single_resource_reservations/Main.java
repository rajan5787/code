package single_resource_reservations;


public class Main {

	 Node root;
	 class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data){
			this.data = data;
			this.left = this.right = null;
		}
	}
	
	Main(){
		root = null;
	}
	
	public void insert(int data){
		
	}
	public Node insert(Node root,int data,int k){
		
		if(root == null)
			return new Node(data);
		
		if((root.data+k>data)&&(root.data<data)){
			return root;
		}
		else if((root.data-k<data)&&(root.data>data)){
			return root;
		}
		else{
			if(root.data>data)
				root.left = insert(root.left,data,k);
			else
				root.right = insert(root.right,data,k);
		}
		return root;
	}
	
	public static void main(String argv[]){
		
		Main tree = new Main();
		
	}
}
