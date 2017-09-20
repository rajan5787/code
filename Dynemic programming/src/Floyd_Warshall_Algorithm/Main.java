package Floyd_Warshall_Algorithm;

public class Main {

	static int INF = 99999;
	public static void main(String argv[]){
		int[][] a = { {0,   5,  INF, 10},
                	{INF,  0,  3,  INF},
                	{INF, INF, 0,   1},
                	{INF, INF, INF, 0} };
		
		int[][] dp = new int[a.length][a.length];
		for(int i =0;i<a.length;i++){
			for(int j = 0;j<a.length;j++){
				dp[i][j] = a[i][j];
				//System.out.print(dp[i][j]+" ");
			}
			//System.out.println();
		}
		for(int k = 0;k<a.length;k++){
			for(int i =0;i<a.length;i++){
				for(int j = 0;j<a.length;j++){
					
					if(dp[i][k]+dp[k][j]<dp[i][j]){
						dp[i][j] = dp[i][k]+dp[k][j];
					}
				}
			}
		}
		
		for(int i =0;i<a.length;i++){
			for(int j = 0;j<a.length;j++){
				if(dp[i][j]==99999)
					System.out.print("INF ");
				else
					System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
