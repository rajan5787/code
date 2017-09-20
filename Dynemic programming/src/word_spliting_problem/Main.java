package word_spliting_problem;

import java.util.*;

public class Main {

	public static void main(String argv[]){
		
		 Set<String> dictionary = new HashSet<String>();
	        dictionary.add("I");
	        dictionary.add("like");
	        dictionary.add("had");
	        dictionary.add("play");
	        dictionary.add("to");
	        String str = "Ihadliketoplay";
	        
	        breakDownDp(str,dictionary);
	}
	
	public static void breakDownDp(String str,Set<String> dic){
		
		int[][] dp = new int[str.length()][str.length()];
		
		for(int i = 0;i<str.length();i++){
			for(int j= 0;j<str.length();j++){
				
				dp[i][j] = -1;

			}
		}
		
		for(int i = 1;i<=str.length();i++){
			for(int j= 0;j<str.length()-i+1;j++){
				
				int l = j+i-1;
				
				if(dic.contains(str.substring(j, l+1))){
					
					dp[j][l] = j;
					continue;
					
				}
				
				for(int k = j+1;k<=l;k++){
					
					if(dp[j][k-1]!=-1&&dp[k][l]!=-1){
						
						dp[j][l] = k;
						break;
					}
				}
			}
		}
		
		if(dp[0][str.length()-1]==-1)
			return;
		
		
		StringBuffer b = new StringBuffer();
		int i = 0,j=str.length()-1;
		
		while(i<j){
			
			int k = dp[i][j];
			if(i==k){
				b.append(str.substring(i,j+1));
				break;
			}
			
			b.append(str.substring(i,k)+" ");
			i = k;	
				
		}
		
		System.out.println(b);
				
	}
}
