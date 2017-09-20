package Print_all_possible_strings_that_can_be_made_by_placing_spaces;

public class Main {

	public static void main(String argv[]){
		String s = "abcd";
		char[] arr = new char[s.length()*2];
		arr[0] = s.charAt(0);
		print(s,arr,1,1,s.length());
	}
	static void print(String start,char[] arr,int i,int j,int n){

		if(i>=n){
			arr[j] = '\0';
			for(int k = 0;k<j;k++)
				System.out.print(arr[k]);
			System.out.println();
				return;
		}
		
		arr[j] = start.charAt(i);
		print(start,arr,i+1,j+1,n);
		
		arr[j] = ' ';
		arr[j+1] = start.charAt(i);
		print(start,arr,i+1,j+2,n);
	}
}
