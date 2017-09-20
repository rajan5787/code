package Find_Minimum_length_Unsorted_Subarray;

import java.util.*;

public class Main {

	public static void main(String argv[]){
		
		int[] a = {0, 1, 15, 25, 6, 7, 30, 40, 50};
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		boolean flag = true;

		s1.push(a[0]);
		s2.push(a[a.length-1]);
		for(int i = 1;i<a.length;i++){
			
			if(!s1.isEmpty()&&s1.peek()>a[i]){
			while(!s1.isEmpty()&&s1.peek()>a[i]){
				
				s1.pop();
				if(s1.isEmpty())
					break;
			}
			flag = false;
			}
			else if(flag){
				s1.push(a[i]);
			}
		}
		
		flag = true;
		
		for(int i = a.length-2;i>=0;i--){
			
			if(!s2.isEmpty()&&s2.peek()<a[i]){
			while(!s2.isEmpty()&&s2.peek()<a[i]){
				
				s2.pop();
				if(s1.isEmpty())
					break;
			}
			flag = false;
			}
			else if(flag){
				s2.push(a[i]);
			}
			
		}
		
		int s = 0,e = 0;
		
		while(!s1.isEmpty()){
			s1.pop();
			s++;
		}
		while(!s2.isEmpty()){
			System.out.println("s ");
			s2.pop();
			e++;
		}
		
		System.out.println("s "+s+" e "+(a.length-1 - e));
		
	}
}
