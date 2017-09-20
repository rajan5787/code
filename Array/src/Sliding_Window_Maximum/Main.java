package Sliding_Window_Maximum;

public class Main {

	public static void main(String argv[]){
		
		int[] a = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
		int x = 4;
		findmax(a,x);
	}
	
	public static void findmax(int[] arr,int x){
		
		int max = arr[0];
		int maxindex = 0;
		for(int i = 0;i<x;i++){
			
			if(max<arr[i]){
				max = arr[i];
				maxindex  =i;
			}
		}
		System.out.println(max+" ");

		for(int i = x;i<arr.length;i++){
			
			if(max<arr[i]){
				max = arr[i];
				maxindex = i;
			}
			if((i-maxindex)!=0&&(i-maxindex)%x==0){
				max = arr[i-x];
				for(int j = 0;j<x;j++){
					
					if(max<arr[j]){
						max = arr[j];
						maxindex  =j;
					}
				}
				
			}
			System.out.println(max+" ");
		}
	}
}

