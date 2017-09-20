package Find_all_possible_interpretations_of_an_array_of_digits;

import java.util.Arrays;

class Node{
	String d;
	Node left,right;
	Node(String d){
		this.d = d;
		this.left = this.right = null;
	}
}


public class Main {

	static void findIterpretation(int[] arr,String[] alphabet){
		
		String s = "";
		Node root = creatTree(arr,s,0);
        print(root);

	}
	
	static Node creatTree(int[] arr,String s,int data){
	
		if(data>26)
			return null;
		
		String ss = s+alphabet[data];
		Node root = new Node(ss);

		if(arr.length!=0){
			data = arr[0];
			int[] newarr = Arrays.copyOfRange(arr, 1, arr.length);
			root.left = creatTree(newarr,ss,data);
			
			if(arr.length>1){
				data = arr[0]*10+arr[1];
				newarr = Arrays.copyOfRange(arr,2,arr.length);
				root.right = creatTree(newarr,ss,data);
			}
		}
		
		return root;
	}

	static void print(Node root){
		if(root==null)
			return;
		if(root.left==null&&root.right==null)
		System.out.print(root.d+" ");
		
		print(root.left);
		print(root.right);
	}
	
	static void printString(int[] arr,int index,String s){
	
		if(index>=arr.length){
			System.out.println(s);
			return;
		}
		String temp = s+alphabet[arr[index]];
		printString(arr,index+1,temp);
		if(arr.length-1>index){
			int n = arr[index]*10+arr[index+1];
			if(n<=26){
				temp = s+alphabet[n];
				printString(arr,index+2,temp);
			}
		}
		
	}
	
	static String[] alphabet = {"", "a", "b", "c", "d", "e",
	        "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
	        "s", "t", "u", "v", "w", "x", "v", "z"};
    
	public static void main(String argv[]){
		
		int[] arr = {1, 1, 3, 4};
        findIterpretation(arr,alphabet);
        System.out.println();
        printString(arr,0,"");
	}

}
