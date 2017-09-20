package Gold_Mine_Problem;

public class Main {

	public static void main(String argv[]){
		int[][] arr = { {1, 3, 1, 5},
		        {2, 2, 4, 1},
		        {5, 0, 2, 3},
		        {0, 6, 1, 2}};
		int[][] dp = new int[arr.length][arr[0].length];
		for(int j =arr[0].length-1;j>=0;j--){
			for(int i = 0;i<arr.length;i++){
				
				int right = j==arr[0].length-1 ? 0 : dp[i][j+1];
				int right_top = j==arr[0].length-1||i==0 ? 0 : dp[i-1][j+1];
				int right_down = j==arr[0].length-1||i==arr.length-1 ? 0 : dp[i+1][j+1];
				
				dp[i][j] += arr[i][j] + Math.max(right,Math.max(right_top, right_down));
				
			}
		}
		

		int max = dp[0][0];
		int index = 0;
		for(int i = 0;i<dp.length;i++){
			if(max<dp[i][0]){
			max = dp[i][0];
			index = i;
			}
		}
		System.out.println("index "+index+" max "+max);
	}
}
