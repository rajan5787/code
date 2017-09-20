package Find_pair_with_given_difference;
import java.util.*;

public class Main {

	public static void main(String argv[]){
		
		int[] a = {5, 20, 3, 2, 50, 80};
		int x = 78;
		int n = a.length;
		int j = 1,i = 0;
		Arrays.sort(a);
		
		while(i<n&&j<n){
			
			if(a[j]-a[i]==x){
				System.out.println(a[j]+" "+a[i]);
				break;
			}
			else if(a[j]-a[i]>x){
				i++;
			}
			else
				j++;
		}
	}
}
