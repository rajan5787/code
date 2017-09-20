package Shuffle_a_given_array;
import java.util.*;
public class Main {

	public static void main(String argv[]){
		int[]  a= {1, 2, 3, 4, 5, 6, 7, 8};
		Random r = new Random();
		for(int i=a.length-1;i>=0;i--){
			int j= r.nextInt(i+1);
			int temp = a[j];
			a[j] = a[i];
			a[i] = temp;
		}
		for(int i = 0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
