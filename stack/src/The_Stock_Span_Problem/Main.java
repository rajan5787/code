package The_Stock_Span_Problem;
import java.util.*;

public class Main {

	public static void main(String argv[]){
		
		int price[] = {100,80,60,60,50,75,85};
		Stack<Integer> s = new Stack<Integer>();
		int arr[] = new int[price.length];
		
		s.push(0);
		arr[0] = 1;
		for(int i = 1;i<price.length;i++){
			
			while(!s.isEmpty()&&price[s.peek()]<=price[i])
				s.pop();
			
			arr[i] = s.isEmpty() ? i+1 : i-s.peek(); 
			s.push(i);
		}
		
		for(int i = 0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}
