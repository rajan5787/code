
public class Ceiling_in_sorted_array {

	public static void main(String argv[]){
		
		int[] a = {1, 2, 8, 10, 10, 12, 19};
		
		int x = 5;
		
		System.out.println(findCelling(a,x,0,a.length-1));
		System.out.println(findfloor(a,x,0,a.length-1));

	}
	
	public static int findCelling(int[] arr,int x,int low,int high){
		
		if(x>arr[high])
			return -1;
		
		if(x<=arr[low])
			return arr[low];

		int mid = (low+high)/2;
		
		if(arr[mid]==x)
			return x;
		
		else if(arr[mid]<x){
			if(arr[mid+1]>=x)
				return arr[mid+1];
			else		
				return findCelling(arr,x,mid+1,high);
		}
		
		else{
			if(arr[mid-1]<x)
				return arr[mid];
			else
				return findCelling(arr,x,low,mid-1);
		}
	}
	
public static int findfloor(int[] arr,int x,int low,int high){
		

		if(x<arr[low])
			return -1;
		
		if(x>=arr[high])
			return arr[high];
		

		int mid = (low+high)/2;
		
		if(arr[mid]==x)
			return x;
		
		else if(arr[mid]<x){

			if(arr[mid+1]>x)
				return arr[mid];
			else
				return findfloor(arr,x,mid+1,high);
		
		}
		
		else{
			if(arr[mid-1]<x)
				return arr[mid-1];
			else
				return findfloor(arr,x,low,mid-1);}
		
	}

}
