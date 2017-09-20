package Minimum_sum_of_two_numbers_formed_from_digits_of_an_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	public static void main(String argv[]){
		
		int[] a = {5, 3, 0, 7, 4};
		Arrays.sort(a);
		
		int i = 0;
		while(a[i]==0){
			i++;
		}
		
		int sum1 = 0,sum2 = 0,k =0;
		for(int j = a.length-1;j>=i;j = j-2){
			
			sum1 += a[j]*Math.pow(10,k);
			sum2 += a[j-1]*Math.pow(10,k);
			k++;
			//System.out.println(sum1+" "+sum2);
		}
		
		System.out.println(sum1+sum2);
	}
}
