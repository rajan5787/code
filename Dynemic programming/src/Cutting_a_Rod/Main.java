package Cutting_a_Rod;

public class Main {

	public static void main(String argv[]){
		int[] arr = {1, 5, 8, 9, 10, 17, 17, 20};
		int n = arr.length;
		
		int[] dp =new int[n+1];
		dp[0] = 0;
		for(int i = 1;i<=arr.length;i++){
			//System.out.println("x "+arr[i-1]);
			for(int j = 1;j<=n;j++){
				
				if(i<=j){
				//	System.out.println(j+" "+dp[j]+" "+dp[j-i]);
					dp[j] = Math.max(dp[j],arr[i-1]+dp[j-i]);
					//System.out.println(j+" "+dp[j]);
				}
			}
		}
		System.out.println(dp[n]);
	}
}
