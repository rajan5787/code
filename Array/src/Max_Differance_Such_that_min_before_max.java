
public class Max_Differance_Such_that_min_before_max {

	public static void main(String argv[]){
		
		int[] a = {2, 3, 10, 6, 4, 8, 1};
		
		int min = a[0];
		int max = 0;
		int minIndex = 0;
		int maxIndex = 0;
		int maxTotal = 0;
		
		for(int i = 1;i<a.length;i++){
			if(min<a[i]&&max<a[i]){
				max = a[i];
				maxIndex = i;
			}
			else{		
				maxTotal = (a[maxIndex] - a[minIndex])>maxTotal ? (a[maxIndex] - a[minIndex]) : maxTotal;
			//	System.out.println(a[maxIndex] +" "+ a[minIndex]);
				max = 0;
				maxIndex = i;
				if(min>a[i]){
					max = 0;
					
					minIndex = i;
					min = a[i];
				}
			}
		}
		
		System.out.println(maxTotal);
	}
}
