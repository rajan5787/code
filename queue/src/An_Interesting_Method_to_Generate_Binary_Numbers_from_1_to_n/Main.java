package An_Interesting_Method_to_Generate_Binary_Numbers_from_1_to_n;
import java.util.*;

public class Main {

	public static void main(String argv[]){
		
		int n = 5;
		Queue<String> q = new LinkedList<String>();
		q.add("1");
		
		while(n--!=0){
			
			String s1 = q.poll();
			String s2 = s1;
			System.out.println(s1);
			q.add((s1+"0"));
			q.add(s2+"1");
		}
		
	}
}
