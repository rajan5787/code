package Cycle_detection_undirected_graph;

import java.util.*;
import java.io.*;

class Graph{
    Edge[] edge;
    int n;
    int e;
    class Edge{
        int s;
        int d;
    }
    
    Graph(int v,int e){
        n = v;
        this.e = e;
        edge = new Edge[e];
        for(int i =0;i<e;i++)
            edge[i] = new Edge();
    }
    public int find(int parent[],int x){
        
        if(x!=parent[x])
            parent[x] = find(parent,parent[x]);
            
        return parent[x];    
    }
    public void union(int[] parent,int[] rank,int x,int y){
        
        int x_p = find(parent,x);
        int y_p = find(parent,y);
        if(x_p==y_p)
            return;
        if(rank[x_p]>rank[y_p]){
            parent[y_p] = x_p;
        }    
        else if(rank[x_p]<rank[y_p]){
            parent[x_p] = y_p;
        }
        else{
            parent[y_p] = x_p;
            rank[x_p]++;
        }
    }
    public boolean isCycle(){
        int[] parent = new int[n];
        int[] rank = new int[n];
        for(int i = 0;i<n;i++){
            parent[i] = i;
            rank[i] = 0;
        }
        for(int i = 0;i<e;i++){    
            int x = find(parent,edge[i].s);
            int y = find(parent,edge[i].d);
            if(x==y)
                return true;
                
            union(parent,rank,x,y);    
        }
        return false;
    }
}
public class Main{
    public static void main(String argv[]){
        
        Graph g = new Graph(3,3);
        g.edge[0].s = 0;
        g.edge[0].d = 1;
        g.edge[1].s = 1;
        g.edge[1].d = 2;
        g.edge[2].s = 2;
        g.edge[2].d = 2;
        if(g.isCycle()){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}