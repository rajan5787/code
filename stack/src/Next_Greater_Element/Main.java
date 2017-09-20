package Next_Greater_Element;
import java.util.*;

public class Main {

	public static void main(String argv[]){
		
		int[] arr = {13,7,6,12};
		int[] a = new int[arr.length];
		Stack<Integer> s = new Stack<>();
		
		for(int i = 0;i<arr.length;i++){
			
			while(!s.isEmpty()&&arr[s.peek()]<arr[i])
				a[s.pop()] = arr[i]; 
			
			s.push(i);
			
		}
		
		while(!s.isEmpty()){
			a[s.pop()] = -1;
		}
		
		for(int i = 0;i<arr.length;i++)
			System.out.print(a[i]+" ");
	}
}
