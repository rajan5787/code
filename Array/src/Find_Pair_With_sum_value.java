
public class Find_Pair_With_sum_value {

	public static void main(String argv[]){
		
		int[] arr = {5,7,4,1,8,9};
		
		findpair(arr,1);
		
	}
	
	public static void findpair(int[] arr,int value){
		
		boolean check[] = new boolean[100000];
		boolean flag = false;
		for(int i = 0;i<arr.length;i++){
			int temp = value - arr[i];
			
			if(temp>=0 && check[temp]){
				flag = true;
				System.out.println("pair is "+ temp +" "+ arr[i]);
			}
		
		check[arr[i]] = true;
		}
		
		if(!flag){
			System.out.println("Pair is not found");
		}
	}
}
