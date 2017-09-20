package Find_the_largest_multiple_of_3_Set1;
import java.util.*;

public class Main {

	public static void main(String arrgv[]){
		
		int[] arr=  {8, 1, 7, 6, 0};
		Arrays.sort(arr);
		int sum = 0;
		for(int i = 0;i<arr.length;i++)
			sum+=arr[i];
	
		if(sum%3==0){
			for(int i = arr.length-1;i>=0;i--)
				System.out.print(arr[i]+" ");
		}
		else{
			Queue<Integer> q1 = new LinkedList<Integer>();
			Queue<Integer> q2 = new LinkedList<Integer>();
			Queue<Integer> q3 = new LinkedList<Integer>();
			for(int i= 0;i<arr.length;i++){
				if(arr[i]%3==0)
					q3.add(arr[i]);
				else if(arr[i]%3==1)
					q1.add(arr[i]);
				else 
					q2.add(arr[i]);
			}
			
			if(sum%3==1){
				
				if(!q1.isEmpty()){
					q1.poll();
				}
				else{
					if(!q2.isEmpty())
						q2.poll();
					else
						System.out.println("Not possible");
					
					if(!q2.isEmpty())
						q2.poll();
					else
						System.out.println("Not possible");

				}
			}
			else{
				if(!q2.isEmpty()){
					q2.poll();
				}
				else{
					if(!q1.isEmpty())
						q1.poll();
					else
						System.out.println("Not possible");
					
					if(!q1.isEmpty())
						q1.poll();
					else
						System.out.println("Not possible");

				}
			}
			
			int index = 0;
			while(!q1.isEmpty())
				arr[index++] = q1.poll();
			while(!q2.isEmpty())
				arr[index++] = q2.poll();
			while(!q3.isEmpty())
				arr[index++] = q3.poll();
			
			Arrays.sort(arr,0,index);
			
			for(int i = index-1;i>=0;i--){
				System.out.print(arr[i]+" ");
			}
		}
	}
}
