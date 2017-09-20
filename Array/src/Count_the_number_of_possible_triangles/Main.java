package Count_the_number_of_possible_triangles;

import java.util.Arrays;

public class Main {

	public static void main(String argv[]){
		
		int[] a = {4, 6, 3, 7};
		int sum = 0;
		Arrays.sort(a);
		for(int i =1;i<a.length-1;i++){
			int l = i-1;
			int r = a.length-1;
			
			while(i<r&&l>=0){
				
				if(a[i]+a[l]>a[r]){
					System.out.println(a[l]+" "+a[i]+" "+a[r]);
					sum++;
					l--;
				}
				else
					r--;
			}
			
		}
		System.out.println(sum);
	}
}
