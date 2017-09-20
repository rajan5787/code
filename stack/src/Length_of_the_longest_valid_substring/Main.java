package Length_of_the_longest_valid_substring;
import java.util.*;

public class Main {

	public static void main(String argv[]){
		String str = "((()()";
		Stack<Integer> s = new Stack<Integer>();
		int max = 0;
		s.push(-1);
		
		for(int i = 0;i<str.length();i++){
			
			if(str.charAt(i)=='(')
				s.push(i);
			else{
				s.pop();
				int n = s.peek();
				if(max<i-n)
					max = i-n;
			}
		}
		
		System.out.println(max);
	}
}
