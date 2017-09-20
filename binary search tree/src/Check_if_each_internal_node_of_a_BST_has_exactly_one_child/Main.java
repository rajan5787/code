package Check_if_each_internal_node_of_a_BST_has_exactly_one_child;

public class Main {
	public static void main(String argv[]){
		int pre[] = new int[]{8, 3, 5, 7, 6};
        System.out.println(find(pre));
	}
	static boolean find(int[] arr){
		int min = 0,max = 0;
		if(arr[arr.length-1]>arr[arr.length-2]){
			max = arr[arr.length-1];
			min = arr[arr.length-2];
		}
		else{
			min = arr[arr.length-1];
			max = arr[arr.length-2];
		}
		
		for(int i = 0;i<arr.length-3;i++){
			
			if(arr[i]<min){
				min = arr[i];
				return true;
			}
			else if(arr[i]>max){
				max = arr[i];
				return true;
			}
			else
				return false;
		}
		return true;
	}
}
