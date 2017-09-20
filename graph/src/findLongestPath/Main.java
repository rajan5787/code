package findLongestPath;
import java.util.*;

class Node{
	
	int v;
	int weight;
	Node(int v,int w){
		this.v = v;
		this.weight = w;
	}
}

class Graph{
	
	int V =0;
	LinkedList<Node>[] adg;
	Graph(int n){
		
		V = n;
		adg = new LinkedList[V];
		for(int i=0;i<V;i++)
			adg[i] = new LinkedList<Node>();
		
	}
	
	public void addEdge(int v,int w,int d){
		
		adg[v].add(new Node(w,d));
	}

	public int[] longestPath(int n){
		
		Stack<Node> stack = new Stack<Node>();
		boolean visited[] = new boolean[V];
		int dis[] = new int[V];
		
		visited[n] = true;
		Node nn = new Node(n,0);
		stack.push(nn);
		
		while(!stack.isEmpty()){
			
			Node x = stack.pop();
			//System.out.println(x.v+" "+x.weight);

			Iterator<Node> i = adg[x.v].listIterator();
			
			while(i.hasNext()){
				
				Node a = i.next();
				//System.out.println(a.v+" "+a.weight);

				if(!visited[a.v]){
					stack.push(a);
				//	System.out.println(a.v+" "+a.weight);
					if(dis[a.v]<dis[x.v]+a.weight)
						dis[a.v] = dis[x.v]+a.weight;
					
					visited[a.v] = true;
				}
			}
		}
		
		return dis;
	}
	
}

public class Main {

	public static void main(String argv[]){
		
		Graph g = new Graph(6);
		g.addEdge(0, 1, 5);
	    g.addEdge(0, 2, 3);
	    g.addEdge(1, 3, 6);
	    g.addEdge(1, 2, 2);
	    g.addEdge(2, 4, 4);
	    g.addEdge(2, 5, 2);
	    g.addEdge(2, 3, 7);
	    g.addEdge(3, 5, 1);
	    g.addEdge(3, 4, -1);
	    g.addEdge(4, 5, -2);
	 
		
		
		int[] dis = g.longestPath(1);
		int max = dis[0];
		int maxIndex = 0;
		
		for(int i = 0;i<6;i++){
			System.out.println(dis[i]);
	
		}
		
	}
}
