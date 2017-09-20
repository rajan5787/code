package Find_the_first_circular_tour_that_visits_all_petrol_pumps;

class pump{
	int p;
	int d;
	pump(int p,int d){
		this.p  = p;
		this.d = d;
	}
}
public class Main {

	public static void main(String argv[]){
		
		pump[] arr = {new pump(6, 4), new pump(3, 6), new pump(7, 3)};
		findstart(arr);
		
	}
	
	static void findstart(pump[] arr){
		
		int start = 0;
		int end = 1;
		int n = arr.length;
		int curr_petrol = arr[start].p - arr[start].d;
		
		while(curr_petrol<0||end!=start){
			
			while(curr_petrol<0&&end!=start){
				
				curr_petrol -= arr[start].p-arr[start].d; 
				start = (start+1)%n;
				
				if(start==0){
					System.out.println("Not possible");
					return;
				}
			}
			
			curr_petrol += arr[end].p - arr[end].d;
			end = (end+1)%n;
		}
		
		System.out.println(start);
	}
}

