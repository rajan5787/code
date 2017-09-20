package Minimum_steps_to_delete_a_string_after_repeated_deletion_of_palindrome_substrings;

public class Main {

	public static void main(String argv[]){
		String s = "2553432";
		int n = s.length();
		int[][] dp = new int[n+1][n+1];
		
		for(int len = 1;len<=n;len++){
			for(int i=0,j = len-1;j<n;i++,j++){
				
				if(len==1)
					dp[i][j] = 1;
				else{
					dp[i][j] = 1+dp[i+1][j];
					
					if(s.charAt(i)==s.charAt(i+1)){
							dp[i][j] = Math.min(dp[i+2][j]+1,dp[i][j]);
					}
					
					for(int k = i+2;k<=j;k++){
						if(s.charAt(i)==s.charAt(k))
						dp[i][j] = Math.min(dp[i][j],dp[i+1][k-1]+dp[k+1][j]);
					}
				}
			}
		}
		
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++){
				System.out.print(dp[i][j]+" ");

			}
			System.out.println();
		}
		System.out.println(dp[0][n-1]);
	}
}
