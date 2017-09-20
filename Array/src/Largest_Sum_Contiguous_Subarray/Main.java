package Largest_Sum_Contiguous_Subarray;


public class Main {

	public static void main(String argv[]){
		
		int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		int s = 0,end = 0,start = 0;
		int max = -100000;
		int sum = 0;
		
		for(int i = 0;i<a.length;i++){
			
			sum+=a[i];
			if(sum>max){
				start = s;
				end = i;
				max = sum;
			}
			
			if(sum<0){
				s = i+1;
				sum = 0;
			}
		}
		System.out.println("s "+s+" e "+end+" sum "+max);
	}
}
