package Maximum_Sub_Square_Matrix;

public class Main {

	public static void main(String argv[]){
		
		 int arr[][] = {{0,1,1,0,1},{1,1,1,0,0},{1,1,1,1,0},{1,1,1,0,1}};
		 int[][] dp = new int[arr.length+1][arr[0].length+1];
		 int max = 0;
		 for(int i=1;i<=arr.length;i++){
			 for(int j = 1;j<=arr[0].length;j++){
				 
				 if(arr[i-1][j-1]==1)
					 dp[i][j] = Math.min(dp[i][j-1],Math.min(dp[i-1][j-1],dp[i-1][j]))+1;
				 
				 if(max<dp[i][j])
					 max = dp[i][j];
			 }
		 }
		 
		 System.out.println(max);
	}
}
