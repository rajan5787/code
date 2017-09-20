package Maximum_circular_subarray_sum;

public class Main {

	public static void main(String argv[]){
		
		int[] a = {11, 10, -20, 5, -3, -5, 8, -13, 10};
		int max= 0;
		max = findmax(a);
		
		int max2 = 0;
		for(int i =0;i<a.length;i++){
			
			max2 += a[i];
			a[i] = -a[i];
		}
		
		max2 = max2+findmax(a);
		
		System.out.println(max>max2 ? max : max2);
	}
	
	static int findmax(int[] a){
		
		int max = 0;
		int sum = 0;
			
		for(int i = 0;i<a.length;i++){
			
			sum+=a[i];
			

			if(sum<0){
				sum = 0;
			}		
			if(sum>max){
				max = sum;
			}		
		}
		
		return max;
	}
}
