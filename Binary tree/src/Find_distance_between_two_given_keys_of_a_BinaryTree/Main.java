package Find_distance_between_two_given_keys_of_a_BinaryTree;


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
	int[] arr1 ;
	int[] arr2 ;
	int index1 = 0,index2 =0;
	BinaryTree(){
		root = null;
	}	
	
	void findDistace(Node root,int n1,int n2){
		arr1 = new int[50];
		arr2 = new int[50];
		index1 = 0;index2 = 0;
		findDistance1(root,n1);
		findDistance2(root,n2);
		int count = 0;
		int i,j;
		
		for(i = index1,j = index2;i>=0&&j>=0;i--,j--)
		{
			if(arr1[i]!=arr2[j]){
				break;
			}
		}
		
		i++;
		j++;
		for(int k = 0;k<index1;k++)
			System.out.print(arr1[k]+" ");
		
		System.out.println();

		for(int k = 0;k<index2;k++)
			System.out.print(arr2[k]+" ");
		System.out.println();
		
		if((i==0&&j>0)||(j==0&&i>0)){
			if(!check(root,arr1[i],arr2[j])){
				System.out.println(i+j);
			}
			else
				System.out.println(i+j+1);
		}
		else
			System.out.println(i+j+2);
	}
	
	boolean check(Node root,int a,int b){
		
		if(root==null)
			return false;
		if((root.d==a&&(root.left.d==b||root.right.d==b))||
				(root.d==b&&(root.left.d==a||root.right.d==a)))
				return true;
		return (check(root.left,a,b)||check(root.right,a,b));
	}
	boolean findDistance1(Node root,int n){
		if(root==null)
			return false;
		if(root.d==n)
			return true;
		if(findDistance1(root.left,n)||findDistance1(root.right,n)){
			arr1[index1++] = root.d;
			return true;
		}
		return false;
	}
	boolean findDistance2(Node root,int n){
		if(root==null)
			return false;
		if(root.d==n)
			return true;
		if(findDistance2(root.left,n)||findDistance2(root.right,n)){
			arr2[index2++] = root.d;
			return true;
		}
		return false;
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
	        tree.findDistace(tree.root,3,6);
	        System.out.println();
	        tree.findDistace(tree.root,8,7);
	}
}
