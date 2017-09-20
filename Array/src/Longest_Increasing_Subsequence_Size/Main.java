package Longest_Increasing_Subsequence_Size;

public class Main {

	public static void main(String argv[]){
		
		int[] a = { 2, 5, 3, 7, 11, 8, 10, 13, 6 };
		int[] temp = new int[a.length];
		
		temp[0] = a[0];
		int len = 1;
		for(int i = 1;i<a.length;i++){
			
			if(a[i]<temp[0])
				temp[0] = a[i];
			else if(a[i]>temp[len-1])
				temp[len++] = a[i];
			else
				temp[find(temp,-1,len-1,a[i])] = a[i];
		}
		
		System.out.println(len);
	}
	
	static int find(int[] temp,int l,int r,int x){
		
		while(r-l>1){
			
			int m = l+(r-l)/2;
			if(temp[m]>=x)
				r = m;
			else
				l = m;
			
		}
		return r;
	}
}
