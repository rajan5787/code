package Lexicographically_smallest_array_after_atmost_K_consecutive_swaps;

public class Main {


	public static void main(String argv[]){
		
		int[] a = {5,3,10,15,30,1};
		int k = 3;
		int pos = 0;
		for(int i = 0;i<a.length&&k>0;i++){
			
			pos = i;
			for(int j = i+1;j<a.length;j++){
				
				
				if(j-i>k)
					break;
				
				if(a[j]<a[pos]){
					pos = j;
					
				}
				
			}
			
			for(int j = pos;j>i;j--){
				
				int temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
			}
			k-=pos-i;
			
			
		}
		
		for(int i = 0;i<a.length;i++)
		System.out.print(a[i]+" ");
	}
}

