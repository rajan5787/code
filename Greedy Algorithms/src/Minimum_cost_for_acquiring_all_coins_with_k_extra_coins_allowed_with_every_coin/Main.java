package Minimum_cost_for_acquiring_all_coins_with_k_extra_coins_allowed_with_every_coin;

import java.util.Arrays;

public class Main {

	public static void main(String argv[]){
		
		int[] a ={8, 5, 3, 10, 2, 1, 15, 25};
		int k = 7;
		
		Arrays.sort(a);
		
		for(int i = 1;i<a.length;i++)
			a[i] += a[i-1];
		
		int coin_needed = (int) Math.ceil((1.0*a.length)/(k+1));
		System.out.println(a[coin_needed-1]);
		
	}
}
