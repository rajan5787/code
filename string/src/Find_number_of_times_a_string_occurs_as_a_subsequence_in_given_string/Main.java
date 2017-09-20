package Find_number_of_times_a_string_occurs_as_a_subsequence_in_given_string;

public class Main {

	public static void main(String argv[]){
		
		String a = "GeeksforGeeks";
		String b = "Gks";
		
		int[][] dp = new int[a.length()+1][b.length()+1];
		
		for(int i = 0;i<a.length()+1;i++)
			dp[i][0] = 1;
		
		for(int i = 1;i<a.length()+1;i++){
			for(int j = 1;j<b.length()+1;j++){
				
				if(a.charAt(i-1)==b.charAt(j-1)){
					dp[i][j] = dp[i-1][j]+dp[i-1][j-1];
				}
				else
					dp[i][j] = dp[i-1][j];
			}
		}
		
		System.out.println(dp[dp.length-1][dp[0].length-1]);
	}
}
