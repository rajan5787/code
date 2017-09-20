package Lexicographically_first_palindromic_string;

public class Main {

	public static void main(String argv[]){
		String s = "malayalam";
		int[] arr = new int[26];
		for(int i = 0;i<s.length();i++){
			char c = s.charAt(i);
			arr[c-97]++;
		}
		int count = 0;
		int index = 0;
		for(int i = 0;i<26;i++)
			if(arr[i]%2!=0){
				count++;
				index = i;
			}
		if(count>1){
			System.out.println("Not Possible");
		}
		else{
			if(count==1)
				arr[index]--;
			String ss = "";
			
			for(int i = 0;i<26;i++){
				for(int j = 0;j<arr[i]/2;j++){
					ss+=String.valueOf((char)(i+97));
				}
			}
			
			String sss = "";
			for(int i = ss.length()-1;i>=0;i--)
				sss += ss.charAt(i); 
			
			if(count==1)
				ss+=String.valueOf((char)(index+97));
			ss+=sss;
			System.out.println(ss);
		}
	}
}
