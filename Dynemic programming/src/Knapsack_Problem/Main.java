package Knapsack_Problem;

public class Main {

	public static void main(String argv[]){
		
		int val[] ={60, 100, 120} ;
		int wt[] ={10, 20, 30};
		int w = 50;
		
		int[][] dp = new int[wt.length+1][w+1];
		
		for(int i = 0;i<=wt.length;i++){
			for(int j = 0;j<=w;j++){
				
				if(i==0||j==0)
					dp[i][j] = 0;
				else if(wt[i-1]<=j){
					dp[i][j] = Math.max(dp[i-1][j-wt[i-1]]+val[i-1],dp[i-1][j]);
				//	System.out.println(dp[i][j]);
				}
				else
					dp[i][j] = dp[i-1][j];
			}
		}
		
		System.out.println(dp[dp.length-1][dp[0].length-1]);
	}
}
