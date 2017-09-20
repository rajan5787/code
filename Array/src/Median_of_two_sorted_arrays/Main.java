package Median_of_two_sorted_arrays;

public class Main {

	public static void main(String argv[]){
		
		int[] a1 = {1, 2, 3, 6};
		int[] a2 = {4, 6, 8, 10};
		
		System.out.println(findmedian(a1,a2,a1.length,0,0));
	}
	
	static int findmedian(int[] a1,int[] a2,int n,int s1,int s2){
		
		if(n<=0)
			return -1;
		if(n==1){
			return (a1[s1]+a2[s2])/2;
		}
		if(n==2){
			return((Math.max(a1[s1], a2[s2])+Math.min(a1[s1+1], a2[s2+1]))/2);
		}
		int m1 = median(a1,n,s1);
		int m2 = median(a2,n,s2);
	//	System.out.println(m1+" "+m2);
		
		if(m1==m2){
			//System.out.println(m1+" "+m2);

			return m1;
		}
		if(m1<m2)
			if(n%2==0)
				return findmedian(a1,a2,n-n/2+1,s1+n/2-1,s2);
			else
				return findmedian(a1,a2,n-n/2,s1+n/2,s2);
		else
			if(n%2==0)
				return findmedian(a1,a2,n-n/2+1,s1,s2+n/2-1);
			else
				return findmedian(a1,a2,n-n/2,s1,s2+n/2);
	}
	
	static int median(int[] a,int n,int i){
		
		if(n%2==0){
			return((a[(i+n)/2]+a[(i+n)/2-1])/2);
		}
		else
			return a[(i+n)/2];
	}
}
