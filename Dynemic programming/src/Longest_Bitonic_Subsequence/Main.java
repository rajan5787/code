package Longest_Bitonic_Subsequence;

public class Main {

	public static void main(String argv[]){
		int[] a = {80, 60, 30, 40, 20, 10};
		int n = a.length;
		int[] dp1 = new int[n];
		int[] dp2 = new int[n];

		for(int i = 0;i<n;i++){
			dp1[i] = 1;
			dp2[i] = 1;
		}
		
		for(int i = 1;i<n;i++){
			for(int j = 0;j<i;j++){
				if(a[i]>a[j]&&dp1[i]<dp1[j]+1){
					dp1[i] = dp1[j]+1;
					
				}
			}
		}
		
		for(int i = n-2;i>=0;i--){
			for(int j = n-1;j>i;j--){
				if(a[i]>a[j]&&dp2[i]<dp2[j]+1){
					dp2[i] = dp2[j]+1;
					
				}
			}
		}
		
		int max = dp1[0]+dp2[0]-1;
		for(int i =1;i<n;i++)
			if(max<dp1[i]+dp2[i]-1)
				max = dp1[i]+dp2[i]-1;
	
		System.out.println(max);
	}
}
