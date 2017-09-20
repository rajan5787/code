package Print_all_palindrome_permutations_of_a_string;

public class Main {

	public static void main(String argv[]){
		
		String s = "aabcb";
		String ss = s+s;
		for(int i = 0;i<s.length();i++){
			
			String str = ss.substring(i, s.length()+i);
			if(isPalindrom(str))
				System.out.println(str);
		}
	}
	static boolean isPalindrom(String str){
		int n = str.length()-1;
		for(int i = 0;i<n;i++){
			if(str.charAt(i)!=str.charAt(n))
				return false;
			
			n--;
		}
		return true;
	}
}
