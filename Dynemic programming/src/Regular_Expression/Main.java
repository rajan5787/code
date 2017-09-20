package Regular_Expression;

public class Main {
public static void main(String argv[]){
		
		String p = "xa*b.c.**";
		String s = "xaabycaa";
		boolean[][] dp = new boolean[s.length()+1][p.length()+1];
		
		dp[0][0] = true;
		int i = 1;
		while(p.charAt(i-1)=='*'){
			dp[0][i] = true;
			i++;
			
		}
		for(i = 1;i<=s.length();i++){
			for(int j = 1;j<=p.length();j++){
				//System.out.println(j+" "+p.charAt(j));
				if(s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='.'){
					dp[i][j] = dp[i-1][j-1];
					//System.out.println(i+" "+j+" "+dp[i][j]);
				}
				else if(p.charAt(j-1)=='*'&&(dp[i][j-2]||dp[i-1][j])){
					dp[i][j] = true;

					//System.out.println(i+" "+j+" "+dp[i][j]);
				}
				else
					dp[i][j] = false;
				
			}
		}
		
		System.out.println(dp[s.length()][p.length()]);
	}

}
