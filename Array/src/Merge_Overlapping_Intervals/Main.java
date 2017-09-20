package Merge_Overlapping_Intervals;
import java.util.*;
class Pair{
	int s,e;
	Pair(int s,int e){
		this.s = s;
		this.e = e;

	}
	public int compareTo(Pair o){
		int x = o.s;
		return this.s-x;
	}
}
public class Main {

	public static void main(String argv[]){
		
		int[][] a =  {{6,8}, {1,9}, {2,4}, {4,7} };
		Pair[] arr = new Pair[a.length];
		for(int i = 0;i<a.length;i++)
			arr[i] = new Pair(a[i][0],a[i][1]);
		
		Arrays.sort(arr, new Comparator<Pair>() {
	        @Override
	        public int compare(Pair o1, Pair o2) {
	            return o1.compareTo(o2);
	        }
	    });
		
		Pair[] temp = new Pair[arr.length];
		temp[0] = arr[0];
		//System.out.println(temp[0].s+" "+temp[0].e);
		int len = 0;
		for(int i = 0;i<arr.length;i++){
			
			
			if(len!=0&&temp[len-1].e>arr[i].s){
				
				while(len!=0&&temp[len-1].e>arr[i].s){
			
					//System.out.println(len);
					temp[len-1].s = Math.min(temp[len-1].s, arr[i].s);
					temp[len-1].e = Math.max(temp[len-1].e, arr[i].e);
					len--;
					//System.out.println(len);
				}
			}
			else{
				temp[len] = arr[i];
				//System.out.println(len+" "+temp[len].s+" "+temp[len].e);
			}
			len++;

			
		}
		
		for(int i = 0;i<len;i++)
			System.out.println("s "+temp[i].s+" e "+temp[i].e);
	}


}
