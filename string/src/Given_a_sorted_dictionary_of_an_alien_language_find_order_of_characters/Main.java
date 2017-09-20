package Given_a_sorted_dictionary_of_an_alien_language_find_order_of_characters;
import java.util.*;

class MyLinkedList extends LinkedList<Integer>{
	
}
class Graph{
	int V;
	MyLinkedList[] list;
	
	Graph(int V){
		this.V = V;
		this.list = new MyLinkedList[this.V];
		for(int i = 0;i<V;i++)
			list[i] = new MyLinkedList();
	}
	
	void addEdge(int u,int v){
		list[u].add(v);
	}
	void print(){
		int i = 0;
		for(MyLinkedList l : list){
			System.out.print(i++ +" : ");
			for(Integer val : l){
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
	
	void topologicalSortUtil(int u,boolean[] visited,LinkedList<Integer> res){
		visited[u]  = true;
		
		for(int v : list[u]){
			if(!visited[v]){
				topologicalSortUtil(v,visited,res);
			}
		}
		res.addFirst(u);
	}
	
	LinkedList<Integer> topologicalSort(){
		boolean[] visited = new boolean[V];
		LinkedList<Integer> res = new LinkedList<>();
		for(int i = 0;i<V;i++){
			if(!visited[i])
				topologicalSortUtil(i,visited,res);
		}
		return res;
	}
}
public class Main {

	public static void main(String argv[]){
		
		String[] dict = {"baa", "abcd", "abca", "cab", "cad"};
		printSorted(dict,4);
	}
	
	static void printSorted(String[] dict,int V){
		Graph g = new Graph(V);
		int n = dict.length;
		for(int i = 0;i<n-1;i++){
			String s1 = dict[i];
			String s2 = dict[i+1];
			int l = Math.min(s1.length(), s2.length());
			
			for(int j = 0;j<l;j++){
				if(s1.charAt(j)!=s2.charAt(j)){
					g.addEdge(s1.charAt(j)-'a', s2.charAt(j)-'a');
					break;
				}
			}
		}
		
		LinkedList<Integer> list = g.topologicalSort();
		for(int i : list)
			System.out.print((char)(i+'a')+" ");
	}
}
