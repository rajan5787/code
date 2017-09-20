package Coin_Change;

public class Main {

	public static void main(String[] argv){
		
		int[] a = {1,2,3};
		int n = 4;
		int[] dp = new int[n+1];
		
		dp[0] = 1;
		for(int i=0;i<a.length;i++){
			for(int j = 1;j<n+1;j++){
				
				if(j>=a[i]){
					
					dp[j] += dp[j-a[i]];
					System.out.print(dp[j]);
				}
				
			}
			System.out.println();

		}
		System.out.println(dp[n]);
	}
}
