package Find_the_smallest_window_in_a_string_containing_all_characters_of_another_string;

public class Main {

	public static void main(String argv[]){
		String str = "this is a test string";
		String pat = "tist";
		
		if(pat.length()>str.length())
			System.out.println("Not Possible");
		else{
			
			System.out.println(minlength(str.toCharArray(),pat.toCharArray()));
		}
	}
	
	static int minlength(char[] str,char[] pat){
		
		int[] hash_str = new int[256];
		int[] hash_pat = new int[256];
		
		for(int i = 0;i<pat.length;i++)
			hash_pat[pat[i]]++;
		
		int min = 1000000;
		int start = 0;
		
		for(int i = 0;i<str.length;i++){
			if(hash_pat[str[i]]!=0){
			hash_str[str[i]]++;

			if(containAllChar(hash_str,hash_pat)){
				
				while(containAllChar(hash_str,hash_pat)&&start<i){
					if(hash_pat[str[i]]!=0)
						hash_str[str[i]]--;
					start++;
				}
				
				start--;
				hash_str[str[start]]++;
				if(min>i-start+1)
					min = i-start+1;
			}
		}
		}
		return min;
	}
	
	static boolean containAllChar(int[] hash_str,int[] hash_pat){
		
		for(int i = 0;i<hash_pat.length;i++){
			if(hash_pat[i]>hash_str[i])
				return false;
		}
		return true;
	}
}
