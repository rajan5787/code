package Shortest_Uncommon_Subsequence;

public class Main {

	static int find(char[] s,char[] t){
		int m = s.length;
		int n = t.length;
		int max = 10005;
		int[][] dp = new int[m+1][n+1];
		
		for(int i = 0;i<=m;i++)
			dp[i][0] = 1;
		for(int i = 0;i<=n;i++)
			dp[0][i] = max;
		
		for(int i = 1;i<=m;i++){
			for(int j = 1;j<=n;j++){
				
				char ch = s[i-1];
				int k;
				for(k = j-1;k>=0;k--){
					if(t[k]==ch)
						break;
				}
				if(k==-1)
					dp[i][j] = 1;
				else
					dp[i][j] = Math.min(dp[i-1][j], dp[i-1][k]+1);
			}
		}
		
		int ans = dp[m][n];
		if(ans>=max)
			return -1;
		else
			return ans;
					
	}
	public static void main(String argv[]){
		String s = "babab";
		String t = "babba";
		
		System.out.println(find(s.toCharArray(),t.toCharArray()));
	}
}
