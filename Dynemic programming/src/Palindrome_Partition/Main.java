package Palindrome_Partition;
import java.util.*;

public class Main {

	public static void main(String argv[]){
		
		String s = "ababbbabbababa";
		
		boolean[][] dp = new boolean[s.length()][s.length()];
		int[] cut = new int[s.length()];
		
		for(int i = 0;i<s.length();i++){
			int min = i;
			for(int j = 0;j<=i;j++){
				if(s.charAt(i)==s.charAt(j)&&(i-j<=1||dp[j+1][i-1])){
					dp[j][i]  =true;
					min = j==0 ? 0 : Math.min(min,1+ cut[j-1]);
					
					
				}
			}
			
			cut[i] = min;
			
		}
		for(int i = 0;i<s.length();i++){
			for(int j = 0;j<=i;j++){
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		//for(int i = 0;i<cut.length;i++)
		System.out.println(cut[cut.length-1]);
		
        	
	}
	
	
	
}
