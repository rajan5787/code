package Find_maximum_height_pyramid_from_the_given_array_of_objects;

import java.util.Arrays;

public class Main {

	public static void main(String argv[]){
		
		int[] a = {10, 20, 30, 50, 60, 70};
		Arrays.sort(a);
		
		int level = 1;
		int count = 1;
		int i = 1;
		int sum = 0;
		int max = a[0];
		int curr_count = 0;
		while(i<a.length){
				
				curr_count++;
				if(curr_count>count){
					level++;
					count = curr_count;
					curr_count = 0;
			}
				i++;
		}
		System.out.println(level);
	}
}
