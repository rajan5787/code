package Maximize_sum_of_consecutive_differences_in_a_circular_array;

import java.util.Arrays;

public class Main {

	public static void main(String argv[]){
		
		int[] a = { 4, 2, 1, 8 };
		
		Arrays.sort(a);
		int n = a.length;
		int sum = 0;
		for(int i = 0;i<n/2;i++){
			
			sum-=(2*a[i]);
			sum+=(2*a[n-i-1]);
		}
		System.out.println(sum);
	}
}
