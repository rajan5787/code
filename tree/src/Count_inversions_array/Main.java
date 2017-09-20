package Count_inversions_array;

public class Main {

	Node root;
	int result = 0;
	class Node{
		int data;
		int count;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			this.count = 1;
			this.left = null;
			this.right = null;
		}
		
	}
	
	Main(){
		root = null;
	}
	
	
	
	public Node insert(Node root,int data){
		if(root == null){
			return new Node(data);
		}
		if(root.data>data){
			root.left = insert(root.left,data);
			result+=root.count;

		}
		else if(root.data<data){
			root.right = insert(root.right,data);
			root.count++;
		}
		return root;
	}
	
	int countinversion(int[] array,int n){
		
		
		for(int i=0;i<n;i++){
			
			root = insert(root,array[i]);
			
		}
		return result;
	}
	
		
	public static void main(String argv[]){
		
		Main m = new Main();
		int array[] = {8,2,1,4};
		System.out.println(m.countinversion(array,array.length));
		
		
		
	}
}
