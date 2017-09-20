package bfs;

import java.util.*;

class Graph{
	
	int V = 0;
	LinkedList<Integer>[] adg;
	boolean visited[];
	Graph(int n){
		
		V = n;
		adg = new LinkedList[V];
		visited = new boolean[V];
		for(int i = 0;i<V;i++)
			adg[i] = new LinkedList();
		
	}
	
	public void addEdge(int v,int w){
		
		adg[v].add(w);
	}
	
	public void search(int n){
		
		visited[n] = true;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(n);
		
		while(!stack.isEmpty()){
			
			int x = stack.pop();
			System.out.print(x+" ");
			
			Iterator<Integer> i = adg[x].listIterator();
			while(i.hasNext()){
				
				int a = i.next();
				if(!visited[a]){
					stack.push(a);
					visited[a] = true;
				}
				
			}
		}
	}
	
}

public class Main {

	public static void main(String argv[]){
		
		Graph g = new Graph(5);
	
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.addEdge(2,4);
        
        g.search(0);
	}
	
}
