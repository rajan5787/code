package Program_for_Shortest_Job_First_scheduling;

import java.util.Arrays;

class Pair implements Comparable<Pair>{
	int x,y;
	Pair(int x,int y){
		this.x = x;
		this.y = y;
	}
	@Override
    public int compareTo(Pair o) {
        // usually toString should not be used,
        // instead one of the attributes or more in a comparator chain
        return ((this.y - o.y));
    }
	
}
public class Main {
	

	public static void main(String argv[]){
		int[][] a = {{1, 6}, {2, 8}, {3, 7}, {4, 3}};
		Pair[] p = new Pair[a.length];
		for(int i = 0;i<a.length;i++)
			p[i] = new Pair(a[i][0],a[i][1]);
		
		Arrays.sort(p);
		int waiting = 0;
		int turn_around_time = 0;
		for(int i = 0;i<p.length;i++){
			turn_around_time = waiting+p[i].y; 
			System.out.println(p[i].x+" "+p[i].y+" "+waiting+" "+turn_around_time);
			waiting+=p[i].y;
		}
		
		
	}
}
