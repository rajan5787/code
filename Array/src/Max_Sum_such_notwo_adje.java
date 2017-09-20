
public class Max_Sum_such_notwo_adje {

	public static void main(String argv[]){
		
		int[] arr = {90,-1,5,-10,-100,10,-5};
		int inc = arr[0];
		int exc = 0;
		int n_exc = 0;
		
		for(int i = 1;i<arr.length;i++){
			
			n_exc = (inc>exc) ? inc : exc;
			inc = exc+arr[i];
			exc = n_exc;
			
		}
		
		System.out.println((exc>inc) ? exc : inc);
		
	}
}
