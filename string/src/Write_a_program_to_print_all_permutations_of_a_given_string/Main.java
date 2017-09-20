package Write_a_program_to_print_all_permutations_of_a_given_string;
import java.util.*;
public class Main {

	static TreeSet<String> set;
	public static void main(String argv[]){
		
		set = new TreeSet<String>();
		String s = "ABC";
		print(s,0,s.length()-1);
		Iterator i = set.iterator();
		while(i.hasNext()){
			String ss = (String) i.next();
			System.out.println(ss);
		}
			
	}
	static void print(String s,int l,int r){
		if(l==r)
			set.add(s);
		else{
			for(int i = l;i<=r;i++){
				s = swap(s,l,i);
				print(s,l+1,r);
				s = swap(s,l,i);
			}
		}		
	}
	static String swap(String s,int x,int y){
		char temp;
		char[] arr = s.toCharArray();
		temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
		return String.valueOf(arr);
	}
}
