package Alternate_vowel_and_consonant_string;

public class Main {

	public static void main(String argv[]){
		
		String s = "geeks";
		StringBuffer vowel=new StringBuffer("");
		StringBuffer ss=new StringBuffer("");
		StringBuffer f = new StringBuffer("");
		for(int i = 0;i<s.length();i++){
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				vowel.append(s.charAt(i));
			else
				ss.append(s.charAt(i));
		}
		
		if(Math.abs(vowel.length()-ss.length())>1){
			System.out.println("Not possible");
		}
		else if(vowel.length()>ss.length()){
			for(int i = 0;i<ss.length();i++){
				f.append(vowel.substring(i, i+1));
				f.append(ss.substring(i, i+1));
			}
			f.append(vowel.substring(vowel.length()-1,vowel.length()));
			String q = f.toString();
			System.out.println(q);
		}
		else{
			for(int i = 0;i<vowel.length();i++){
				f.append(ss.substring(i, i+1));
				f.append(vowel.substring(i, i+1));
			}
			f.append(ss.substring(ss.length()-1,ss.length()));
			String q = f.toString();
			System.out.println(q);
		}
	}
}
