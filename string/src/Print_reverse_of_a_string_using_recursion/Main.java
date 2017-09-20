package Print_reverse_of_a_string_using_recursion;

public class Main {

	public static void main(String argv[]){
		String s = "rajan";
		print(s,0);
	}
	
	static void print(String s,int i){
		if(i==s.length())
			return;
		print(s,i+1);
		System.out.print(s.charAt(i));
	}
}
