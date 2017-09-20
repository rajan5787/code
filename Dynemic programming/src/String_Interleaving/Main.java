package String_Interleaving;

public class Main {

	public static void main(String argv[]){
		
		String s1 = "aab";
		String s2 = "axy";
		String s3 = "aaxaby";
		
		boolean[][] dp = new boolean[s1.length()+1][s2.length()+1];
		dp[0][0] = true;
		for(int i = 1;i<=s1.length();i++)
			if(s1.charAt(i-1)==s3.charAt(i-1))
				dp[0][i] = dp[0][i-1];
		

		for(int i = 1;i<=s1.length();i++)
			if(s2.charAt(i-1)==s3.charAt(i-1))
				dp[i][0] = dp[i-1][0];
		
		for(int i= 1;i<=s2.length();i++){
			for(int j = 1;j<=s1.length();j++){
				
				if(s3.charAt(i+j-1)==s2.charAt(i-1))
					dp[i][j] = dp[i-1][j];
				else if(s3.charAt(i+j-1)==s1.charAt(j-1))
					dp[i][j] = dp[i][j-1];
				else
					dp[i][j] = false;
				
			}
		}
		
		System.out.println(dp[s1.length()][s2.length()]);
	}
}
