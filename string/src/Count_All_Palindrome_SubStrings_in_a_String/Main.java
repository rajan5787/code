package Count_All_Palindrome_SubStrings_in_a_String;

public class Main {

	public static void main(String argv[]){
		String s = "abaab";
		int n = s.length();
		int[][] dp = new int[n][n];
		boolean[][] p = new boolean[n][n];
		
		for(int i = 0;i<n;i++){
			p[i][i] = true;
			//dp[i][i] = 1;
		}
		
		for(int i = 0;i<n-1;i++){
			if(s.charAt(i)==s.charAt(i+1)){
				p[i][i+1] =true;
				dp[i][i+1] = 1;
			}
		}
		
		for(int i = 2;i<n;i++){
			for(int j = 0;j<n-i;j++){
				
				int k = i+j;
				if(s.charAt(k)==s.charAt(j)&&p[j+1][k-1])
					p[j][k] = true;
				
				if(p[j][k])
					dp[j][k] = 1+dp[j][k-1]+dp[j+1][k]-dp[j+1][k-1];
				else
					dp[j][k] = dp[j][k-1]+dp[j+1][k]-dp[j+1][k-1];
				//System.out.print(dp[j][k]);
			}
			//System.out.println();
		}
		
		System.out.println(dp[0][n-1]);
	}
}
