package Maximum_Sum_Increasing_Subsequence;

public class Main {

	public static void main(String argv[]){
		
		int[] a = {4,6,1,3,8,4,6};
		int[] dp = new int[a.length];
		int[] path = new int[a.length];
	
		for(int i = 0;i<a.length;i++)
			path[i] = -1;
		dp[0] = a[0];
		for(int i=0;i<a.length;i++){
			for(int j = 0;j<i;j++){
				
				if(a[i]>=a[j]&&dp[i]<dp[j]+a[i]){
					
					dp[i] = dp[j]+a[i];
					path[i] = j;
					//System.out.println("i "+i+" j "+j+" "+dp[i]);
				}
			}
		}
		
		int index = 0;
		int max = dp[0];
		for(int i = 1;i<dp.length;i++)
			if(max<dp[i]){
				max = dp[i];
				index = i;
			}
		System.out.println(dp[index]);
		System.out.print(a[index]+" ");
		while(path[index]>=0){
			
			index = path[index];
			System.out.print(a[index]+" ");

			
			
		}
	}
}
