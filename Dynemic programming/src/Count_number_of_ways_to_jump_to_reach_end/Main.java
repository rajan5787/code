package Count_number_of_ways_to_jump_to_reach_end;

public class Main {

	public static void main(String argv[]){
		int[] arr = {3, 2, 0, 1};
		int[] dp = new int[arr.length];
		int n = arr.length;
		
		for(int i = n-2;i>=0;i--){
			
			if(arr[i]>=n-i-1)
				dp[i]++;
			if(arr[i]==0)
				dp[i]=-1;
			else{
			for(int j = i+1;j<n-1&&j<=arr[i]+i;j++)
				if(dp[j]!=-1)
				dp[i]+=dp[j];
			}
			
		}
		
		for(int i = 0;i<dp.length;i++)
		System.out.print(dp[i]+" ");
	}
}
