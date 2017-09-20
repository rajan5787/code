package Smallest_window_that_contains_all_characters_of_string_itself;
import java.util.*;

public class Main {

	public static void main(String argv[]){
		
		int[] arr = new int[26];
		int count = 0;
		String s = "ababbbcdda";
		
		for(int i = 0;i<s.length();i++){
			if(arr[s.charAt(i)-'a']==0){
				count++;
				arr[s.charAt(i)-'a']=-1;
			}
		}
		
		HashSet<Character> set = new HashSet<Character>();
		int i = 0,j = 0,ans = 1005;
		while(j<s.length()){
			arr[s.charAt(j)-'a']++;
			set.add(s.charAt(j));
			//System.out.println("j "+j+" "+set.size());
			if(count==set.size()){
				while(arr[s.charAt(i)-'a']!=0){
					arr[s.charAt(i)-'a']--;
					i++;
				}
				ans = Math.min(j-i+1, ans);
				//System.out.println("ans "+ans);

			}
			j++;
		}
		
		System.out.println("final "+ans);
	}
}
