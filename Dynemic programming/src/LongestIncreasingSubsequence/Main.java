package LongestIncreasingSubsequence;

public class Main {

	public static void main(String argv[]){
		
		int[] a = {10, 22, 9, 33, 21, 50, 41, 60};
		
		int[] dp = new int[a.length];
		for(int i = 0;i<dp.length;i++)
			dp[i] = 1;
		
		for(int i =1 ;i<a.length;i++){
			for(int j = 0;j<i;j++){
				if(a[i]>a[j]&&dp[i]<dp[j]+1){
					dp[i] = dp[j]+1;
				}
			}
		}
		int max = 0;
		for(int i = 0;i<dp.length;i++)
			if(max<dp[i])
				max = dp[i];
	
		System.out.println(max);
	}
}
