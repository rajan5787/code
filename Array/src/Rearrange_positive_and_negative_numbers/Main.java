package Rearrange_positive_and_negative_numbers;

public class Main {

	public static void main(String[] argv){
		
		int[] arr = {-1, 2, -3, -4, -5, 6, -7, 8, 9};
		
		int n = arr.length;
		int index = -1;
		for(int i = 0;i<n;i++){
			
			if(arr[i]<0){
				index++;
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
		
		index++;
		int neg = 0;
		
		while(neg<index&&arr[neg]<0&&index<n){
			
			int temp = arr[neg];
			arr[neg] = arr[index];
			arr[index]  = temp;
			neg += 2;
			index++;
		}
		
		for(int i = 0;i<n;i++)
		System.out.print(arr[i]+" ");
	}
}
