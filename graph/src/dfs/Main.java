package dfs;

import java.util.*;

 class Graph{
	
	int V = 0;
	LinkedList<Integer> adg[];
	
	Graph(int n){
		
		V = n;
		adg = new LinkedList[n];
		for(int i = 0;i<n;i++)
			adg[i] = new LinkedList(); 
	}
	
	public void addEdge(int v,int w){
		
		adg[v].add(w);
	}
	
	public void search(int x){
		
		boolean[] visited = new boolean[V];
		visited[x] = true;
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(x);
		visited[x] = true;
		
		while(queue.size()!=0){
			
			x = queue.poll();
			//System.out.print(x+" ");
			System.out.print(x+" ");

			Iterator<Integer> i = adg[x].listIterator();
			while(i.hasNext()){
				
				int a = i.next();
				if(!visited[a]){

				queue.add(a);
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
        g.addEdge(3, 4);
        g.addEdge(2, 4);
        
        g.search(0);
	}
}
