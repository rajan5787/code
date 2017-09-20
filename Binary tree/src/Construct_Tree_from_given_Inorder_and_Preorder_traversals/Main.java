package Construct_Tree_from_given_Inorder_and_Preorder_traversals;

class Node{
	char d;
	Node left,right;
	
	Node(char d){
		this.d  = d;
		this.left = this.right = null;
	}
}

class BinaryTree{
	
	//Node root;
	int j = 0;
	
	Node creatTree(char[] in,char[] pre,int iS,int iE){
		
		if(iS>iE)
			return null;
		
		Node tNode = new Node(pre[j++]);
		
		if(iS==iE)
			return tNode;
		
		int i = search(in,iS,iE,tNode.d);
		
		tNode.left = creatTree(in,pre,iS,i-1);
		tNode.right = creatTree(in,pre,i+1,iE);
		
		return tNode;

	}
	
	int search(char[] in,int iS,int iE,char d){
		int index = 0;
		for(int i = iS;i<=iE;i++){
			if(in[i]==d){
				index = i;
				break;
			}
		}
		return index;
	}
	void print(Node node){
		
		if(node==null)
			return;
		print(node.left);
		System.out.print(node.d+" ");
		print(node.right);
	}
}
public class Main {

	public static void main(String argv[]){
		
		
		BinaryTree tree = new BinaryTree();
        char in[] = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char pre[] = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
        Node root = tree.creatTree(in, pre, 0,in.length-1);
        
        tree.print(root);
        }

}
