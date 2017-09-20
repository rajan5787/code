package Maximum_Length_Chain_of_Pairs;

public class Main {

	public static void main(String argv[]){
		
		int[][] a = {{5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90} };
		int[] dp = new int[a.length];
		
		for(int i = 0;i<a.length;i++)
			dp[i] = 1;
		
		for(int i =1 ;i<a.length;i++){
			for(int j = 0;j<i;j++){
				
				if(a[j][1]<a[i][0]&&dp[i]<dp[j]+1){
					dp[i] = dp[j]+1;
				}
				
			}
		}
		
		int max = dp[0];
		for(int i = 1;i<dp.length;i++)
			if(max<dp[i])
				max = dp[i];
		
		System.out.println(max);
	}
}
