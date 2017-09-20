package insertion_delete;

class Main {

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
	
	public int minofright(Node root){
		
		if(root.left!=null){
			root = root.left;
		}
		return root.data;
	}
	
	public boolean search(Node root,int data){
		if(root ==null)
			return false;
		if(root.data == data)
			return true;
		else if(root.data>data)
			return search(root.left,data);
		else
			return search(root.right,data);
	}
	public Node insert(Node root,int data){
		if(root == null){
			root =  new Node(data);
			return root;
		}
		if(root.data>data){
			root.left = insert(root.left,data);
		}
		else{
			root.right = insert(root.right,data);
		}
		return root;
	}
	
	public Node delete(Node root,int data){
		
		if(root == null)
			return root;
		if(root.data<data){
			root.right = delete(root.right,data);
		}
		else if(root.data>data){
			root.left = delete(root.left,data);
		}
		else{
			
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			else
				root.data = minofright(root.right);
				root.right = delete(root.right,root.data);
		}
		return root;
	}
	
	public void inorder(Node root){
		
	//	System.out.println("fgbfvc");
		if(root != null){
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
		
	}
	
	public void insert(int data){
		
		root = insert(root,data);
		
	}
	public void delete(int data){
		
		delete(root,data);
		
	}
	public boolean search(int data){
		
		return search(root,data);
		
	}
	void inorder()  {
	       inorder(root);
	    }
	
	public static void main(String argv[]){
		
		Main tree = new Main();
		 tree.insert(50);
	        tree.insert(30);
	        tree.insert(20);
	        tree.insert(40);
	        tree.insert(70);
	        tree.insert(60);
	        tree.insert(80);
	        
	        tree.inorder();
	        
	        tree.delete(20);
	        
	        System.out.println();
	        tree.inorder();
	        
	        tree.delete(30);
	        
	        System.out.println();
	        tree.inorder();
	        
	        tree.delete(50);
	        
	        System.out.println();
	        tree.inorder();
	        
	        System.out.println(tree.search(70));

	}
	
	
}