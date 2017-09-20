package Find_Fixed_Point_in_given_array;

public class Main {

	public static void main(String argv[]){
	
		int[] a = {1, 2, 5, 8, 17};
		
		find(a,0,a.length-1);
	}
	
	public static void find(int[] a,int low,int high){
		
	
		if(low>high){
			System.out.println(-1);
			return;
		}
		
		int mid = (low+high)/2;
		if(mid==a[mid]){
			System.out.println(mid);
		}
		else if(a[mid]>mid)
			find(a,low,mid-1);
		else
			find(a,mid+1,high);
		
	}
}
