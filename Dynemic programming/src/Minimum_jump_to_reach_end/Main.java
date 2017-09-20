package Minimum_jump_to_reach_end;

public class Main {

	public static void main(String argv[]){
		
		int[] a = {2,3,1,1,2,4,2,0,1,1};
		
		int[] dp = new int[a.length];
		int[] path = new int[a.length];
		path[0] = -1;
		
		for(int i = 1;i<a.length;i++){
			for(int j = 0;j<i;j++){
				
				if(a[j]+j>=i&&(dp[j]+1<dp[i]||dp[i]==0)){
					dp[i] = dp[j]+1;
					path[i] = j;
				}
			}
		}
		
		System.out.println(dp[dp.length-1]);
		int i = a.length-1;
		while(i>=0){
			System.out.print(i+" ");
			i = path[i];
		}
	}
}
