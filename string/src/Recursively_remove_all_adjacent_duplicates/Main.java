package Recursively_remove_all_adjacent_duplicates;
import java.util.*;

public class Main {

	public static void main(String argv[]){
		
		String s = "azxxzy";
		Stack<Character> st = new Stack<>();
		st.push(s.charAt(0));
		char prev = s.charAt(0);
		for(int i = 1 ;i<s.length();i++){
		
			char ch = s.charAt(i);
			if(!st.isEmpty()&&ch==st.peek())
				st.pop();
			else if(prev != ch)
				st.push(ch);
			
			prev = ch;
		}
		StringBuilder sb = new StringBuilder("");
		while(!st.isEmpty())
			sb.append(st.pop());
		
		System.out.println(sb.reverse());
			
	}
}
