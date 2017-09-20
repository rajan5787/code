package Find_minimum_distance_between_two_numbers;
import java.util.*;

public class Main {

	public static void main(String[] argv){
		
		int[] a = {2, 5, 3, 5, 4, 4, 2, 3};
		Stack<Integer> s = new Stack<>();
		int min = a.length;
		int i = 0;
		int x = 3;
		int y= 5;
		for(i = 0;i<a.length;i++){
			
			if(a[i]==x||a[i]==y){
				s.push(a[i]);
				break;
			}
		}
		
		for(int j = i+1;j<a.length;j++){
			
			if(a[j]!=x&&a[j]!=y){
				s.push(a[j]);
			}
			else{
				int n = 0;
				int count = 0;
					while(!s.isEmpty()){
						n = s.pop();
						count++;
					}
					if((n==x&&a[j]==y)||(n==y&&a[j]==x)){
						if(min>count)
							min = count;
					}
					else{
						s.push(a[j]);
					}
				
			}
		}
		
		System.out.println(min);
		
	}
}
