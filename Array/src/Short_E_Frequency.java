
import java.util.*;

public class Short_E_Frequency {

	public static void main(String argv[]){
		
		int[] arr = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8};
		shortarray(arr);
		
	}
	
	public static void shortarray(int[] arr){
		
		List<Node> l = new ArrayList<>();
		Node n = null;
		
		for(int i=0;i<arr.length;i++){
			
			n = new Node(arr[i],1,i);
			if(l.contains(n)){
				n = l.get(l.indexOf(n));
				n.fre++;
			}
			else{
				l.add(n);
			}
			
		}
		
		Collections.sort(l);
		
		for(Node x : l){
			for(int i = 0;i<x.fre;i++)
			System.out.println(x.no);
		}
		
	}
}

class Node implements Comparable<Node>{
	
	int no;
	int fre;
	int index;
	
	Node(int a,int b,int c){
		no = a;
		fre = b;
		index = c;
	}

	@Override
	public int compareTo(Node o) {
		
		Node x = (Node) o;
		if(x.no>this.no){
			return 1;
		}
		else if(x.no<this.no){
			return -1;
		}
		else if(x.no==this.no){
			if(x.index>this.index)
				return 1;
			else
				return -1;
		}

		return 0;
	}
	
	
}
