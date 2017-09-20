package Sum_of_all_substrings_of_a_string_representing_a_number;

public class Main {

	public static void main(String argv[]){
		String s = "1234";
		int num = s.length();
		int[] sum = new int[s.length()];
		sum[0] = s.charAt(0)-48;
		int ans = sum[0];
		for(int i = 1;i<s.length();i++){
		//	System.out.print(s.charAt(i)+" "+sum[i-1]+" ");

			sum[i] = (i+1)*(s.charAt(i)-48)+10*sum[i-1];
		//	System.out.println(s.charAt(i)+" "+sum[i]+" ");
			ans+=sum[i];
		}
		
		System.out.println(ans);
	}
}
