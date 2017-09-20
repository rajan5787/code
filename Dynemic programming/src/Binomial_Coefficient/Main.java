package Binomial_Coefficient;

public class Main {

	public static void main(String argv[]){
		
		int n = 5;
		int k = 2;
		int[] dp = new int[k+1];
		
		for(int i = 0;i<n+1;i++){
			for(int j = k;j>=0;j--){
				
				if(j==0||i==j)
					dp[j] = 1;
				else
					dp[j] = dp[j-1]+dp[j];
			}
		}
			
		System.out.println(dp[k]);
	}
}
