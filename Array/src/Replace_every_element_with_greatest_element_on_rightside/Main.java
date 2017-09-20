package Replace_every_element_with_greatest_element_on_rightside;

public class Main {

	public static void main(String argv[]){
		
		int[] a = {16, 17, 4, 3, 5, 2};
		int[] b  = new int[a.length];
		int max = a[a.length-1];
		b[a.length-1] =-1;
		for(int i=a.length-2;i>=0;i--){
			
			if(max>a[i]){
				b[i] = max;
			}
			else{
				b[i] = max;
				max = a[i];
		}
		}
		
		for(int i = 0;i<a.length;i++)
			System.out.println(b[i]+" ");
	}
}
