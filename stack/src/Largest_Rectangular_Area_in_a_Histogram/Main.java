package Largest_Rectangular_Area_in_a_Histogram;
import java.util.*;

public class Main {

	public static void main(String rgv[]){
		
		Stack<Integer> s = new Stack<Integer>();
		
		int hist[] =  {6, 1, 5, 4, 5, 2, 6};
		int n = hist.length;
		int i = 0;
		int area = 0,curr_area = 0;
		while(i<n){
			
			if(s.isEmpty()||hist[s.peek()]<hist[i])
				s.push(i++);
			else{
				int x = s.pop();
				curr_area = hist[x]*(s.isEmpty()? i :i - s.peek()-1 );
				if(area<curr_area)
					area = curr_area;
			}
		}
		
		while(!s.isEmpty()){
			int x = s.pop();
			curr_area = hist[x]*(s.isEmpty()? i : i - s.peek()-1 );
			if(area<curr_area)
				area = curr_area;
		}
		
		
		System.out.println(area);
	}
}
