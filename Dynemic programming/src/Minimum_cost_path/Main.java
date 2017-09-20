package Minimum_cost_path;

public class Main {

	public static void main(String argv[]){
		
		int[][] a = {{1,3,5,8},{4,2,1,7},{4,3,2,3}};
		findpath(a);
	}
	
	public static void findpath(int[][] a){
		
		int[] arr = new int[a[0].length];
		
		arr[0] = a[0][0];
		for(int i = 1;i<a[0].length;i++)
			arr[i] =arr[i-1]+ a[0][i];
		
		for(int i = 1;i<a.length;i++){
			
			arr[0] = arr[0]+a[i][0];
			for(int j = 1;j<a[0].length;j++){
				
				if(arr[j-1]>arr[j])
					arr[j] = arr[j]+a[i][j];
				else
					arr[j] = arr[j-1]+a[i][j];
			}
		}
		
		System.out.println(arr[a[0].length-1]);
	}
}
