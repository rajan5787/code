package Find_all_distinct_palindromic_substrings_of_a_given_string;
import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String argv[]){
		String s = "bca";
		char[] arr = s.toCharArray();
		printPalindrom(s,arr,arr.length);
	}
	
	static void printPalindrom(String s,char[] arr,int n){
		
		TreeSet<String> set = new TreeSet<>();
		for(int i = 0;i<n;i++){
			for(int j = i;j<n;j++){
				if(arr[i]==arr[j]&&isPalindrom(arr,i,j)){
					String ss  =s.substring(i,j+1);
					//	System.out.println("dd "+ss);
						set.add(ss);
					
				}
			}
		}
		
		//Iterator<String> ss =set.iterator();
		for(String x : set){
			System.out.println(x);
		}
			
	}
	
	static boolean isPalindrom(char[] arr,int i,int j){
		
		for(int k = i;k<j;k++){
			if(arr[k]!=arr[j])
				return false;
			
			j--;
		}
		
		return true;
	}
}
