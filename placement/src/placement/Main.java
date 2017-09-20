package placement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static int max = 0;
	static int depth = 0;
	public static void main(String argv[])throws Exception{
		
		BufferedReader asd = new BufferedReader(new InputStreamReader(System.in));
		String[] s = asd.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int[][] arr =new int[a][b];

		for(int i = 0;i<a;i++){
			s = asd.readLine().split(" ");
			for(int j = 0;j<b;j++)
				arr[i][j] = Integer.parseInt(s[j]);
		}
			
		int max = 0;
		//int n
	
		for(int i = 0;i<a;i++){
			for(int j = 0;j<b;j++){
				boolean[][] visited = new boolean[a][b];
				dfs(arr,i,j, a, b);

			}
		}
		
	}
	
	static void dfs(int[][] arr,int i,int j,int a,int b){
			
		boolean visited[][] = new boolean[arr.length][arr[0].length];
		Node x = null;
		int n = 0;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(new Node(arr[i][j],i,j));
		while(queue.size()!=0){
			
			 x = queue.poll();
			
			if(x.i>0&&x.data>arr[x.i-1][x.j]&&!visited[x.i-1][x.j]){
				visited[x.i-1][x.j] = true;
				queue.add(new Node(arr[x.i-1][x.j],x.i-1,x.j));
				
			}
			if(x.i<a-1&&x.data>arr[x.i+1][x.j]&&!visited[x.i+1][x.j]){
				visited[x.i+1][x.j] = true;

				queue.add(new Node(arr[x.i+1][x.j],x.i+1,x.j));
			}
			if(x.j>0&&x.data>arr[x.i][x.j-1]&&!visited[x.i][x.j-1]){
				visited[x.i][x.j-1] = true;

				queue.add(new Node(arr[x.i][x.j-1],x.i,x.j-1));
			}
			if(x.j<b-1&&x.data>arr[x.i][x.j+1]&&!visited[x.i][x.j+1]){
				visited[x.i][x.j+1] = true;

				queue.add(new Node(arr[x.i-1][x.j],x.i,x.j+1));
			}
			
			n++;
		}
		
		if(n>max){
			max = n;
			depth = arr[i][j]-x.data;
		}
		else if(n==max){
			if(depth<arr[i][j]-x.data);
				depth = arr[i][j] - x.data;
		}
	}
}
class Node{
	int i;int j;int data;
	
	Node(int data,int i,int j){
		
		this.data = data;
		this.i = i;
		this.j = j;
	}
}


