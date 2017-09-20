package maximum_element_in_array_which_is_first_increasing_and_then_decreasing;

public class Main {

	
	public static void main(String argv[]){
		
		int[] a = {120, 100, 80, 20, 0};
		
		System.out.println(find(a,0,a.length-1));
	}
	
	public static int find(int[] a,int low ,int high){
		
		if(low>high)
			return a[0]>a[a.length-1] ? a[0] : a[a.length-1];
		
		int mid = (low+high)/2;
		
		if(mid>0&&mid+1<a.length&&a[mid]>a[mid-1]&&a[mid]>a[mid+1])
			return a[mid];
		else if(mid>0&&mid+1<a.length&&a[mid]>a[mid-1]&&a[mid]<a[mid+1])
			return find(a,mid+1,high);
		else if(mid>0&&mid+1<a.length&&a[mid]<a[mid-1]&&a[mid]>a[mid+1])
			return find(a,low,mid-1);
		
		return a[0]>a[a.length-1] ? a[0] : a[a.length-1];
	}
}
