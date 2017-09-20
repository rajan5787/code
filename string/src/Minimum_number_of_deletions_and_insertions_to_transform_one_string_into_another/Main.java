package Minimum_number_of_deletions_and_insertions_to_transform_one_string_into_another;

public class Main {

	static int find(char[] s1,char[] s2){
		int m = s1.length;
		int n = s2.length;
		
		int[][] dp = new int[m+1][n+1];
		for(int i = 0;i<=m;i++){
			for(int j = 0;j<=n;j++){
				
				if(i==0||j==0)
					dp[i][j] = 0;
				else if(s1[i-1]==s2[j-1])
					dp[i][j] = dp[i-1][j]+1;
				else
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		
		return dp[m][n];
	}
	public static void main(String argv[]){
		String s1 = "heap";
		String s2 = "pea";
		
		int l = find(s1.toCharArray(),s2.toCharArray());
		
		System.out.println("Minimum deletions "+(s1.length()-l));
		System.out.println("Minimum insertions "+(s2.length()-l));
	}
}