package Longest_Palindromic_Subsequence;

public class Main {

	public static void main(String argv[]){
		
		String s = "GEEKSFORGEEKS";
		int[][] dp = new int[s.length()][s.length()];
		
		for(int i =0;i<dp.length;i++){
			dp[i][i] = 1;
		}
		
		for(int l = 2;l<=dp.length;l++){
			for(int i = 0;i<dp.length-l+1;i++){
				int j = i+l-1;
				if(s.charAt(i)==s.charAt(j)&&l==2)
					dp[i][j] = 2;
				else if(s.charAt(i)==s.charAt(j))
					dp[i][j] = dp[i+1][j-1]+2;
				else
					dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
				
			}
		}
		System.out.println(dp[0][dp.length-1]);
	}
}
