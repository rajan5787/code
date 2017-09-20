package Number_of_subsequences_of_the_form_a_i_b_j_c_k;

public class Main {

	public static void main(String argv[]){
		String s = "abcabc";
		int ca = 0,cb =0,cc = 0;
		for(int i = 0;i<s.length();i++){
			if(s.charAt(i)=='a')
				ca = 1+2*ca;
			else if(s.charAt(i)=='b')
				cb = ca+2*cb;
			else
				cc = cb +2*cc;
		}
		
		System.out.println(cc);
	}
}
