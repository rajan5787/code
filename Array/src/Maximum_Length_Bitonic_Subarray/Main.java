package Maximum_Length_Bitonic_Subarray;

public class Main {

	public static void main(String argv[]){
		
		int[] a = {10, 20, 30, 40};
		int low = 0;
		int high = a.length-1;
		int n  = a.length-1;
		
		for(int i = 1;i<a.length;i++){
			
			if(a[i]<a[low])
				low = i;
			
			if(a[n-i]<a[high])
				high = n-i;
			
			if(n-i<i||i==n-i)
				break;
		}
		
		if(low+1==high)
			System.out.println(a.length);
		else
			System.out.println(high-low+1);
	}
}
