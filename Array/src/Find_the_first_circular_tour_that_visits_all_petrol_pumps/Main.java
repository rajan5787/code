package Find_the_first_circular_tour_that_visits_all_petrol_pumps;

import java.io.*;
class Pump{
	int petrol;
	int distance;
	Pump(int x,int y){
		this.petrol = x;
		this.distance = y;
	}
}

public class Main {

	public static void main(String argv[])throws Exception{
	
		BufferedReader asd = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(asd.readLine().trim());
		Pump[] a = new Pump[n];
		for(int i = 0;i<n;i++){
			String[] s = asd.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			a[i] = new Pump(x,y); 
		}
			System.out.println(find(a));
				
	}
	
	static int find(Pump[] a){
		int start = 0;
		int end = 1;
		int dis = a[start].petrol - a[start].distance;
		
		while(start!=end||dis<0){
			
			while(dis<0&&start!=end){
				
				dis -= a[start].petrol - a[start].distance;
				start = (start+1)%a.length;
				
				if(start==0)
					return -1;
			}
			
			dis += a[end].petrol-a[end].distance;
			end = (end+1)%a.length;
		}

		return start;
	}
}