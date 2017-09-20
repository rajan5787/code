package Function_to_find_Number_of_customers_who_could_not_get_a_computer;
import java.util.*;

public class Main {

	public static void main(String argv[]){
		String s  = "ABCBCADEED";
		int num = 1;
		HashSet<Character> set = new HashSet<Character>();
		int n = s.length();
		int count = 0;
		
		for(int i = 0;i<n;){
				if(!set.contains(s.charAt(i))){
					//System.out.println("cc "+count+" "+s.charAt(i));
					count++;
					set.add(s.charAt(i));
					if(count>num)
						System.out.println(s.charAt(i));
				}
				else{
					count--;
				}
				i++;
			
		}
	}
}
