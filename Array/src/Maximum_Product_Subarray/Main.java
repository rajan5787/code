package Maximum_Product_Subarray;

public class Main {

	public static void main(String argv[]){
		
		int[] a = {1, -2, -3, 0, 7, -8, -2};
		
		int max = 1, min = 1;
		int max_far = 1;
		
		for(int i = 0;i<a.length;i++){
			
			if(a[i]>0){
				
				max = max*a[i];
				min = Math.min(min*a[i],1);
				
			}
			else if(a[i]==0){
				max = 1;
				min = 1;
			}
			else{
				int t = max;
				max = Math.max(a[i]*min, 1);
				min = t*a[i];

			}
			
			if(max>max_far)
				max_far = max;
		}
		
		System.out.println(max_far);
	}
}
