package Given_a_number_as_a_string_find_the_number_of_contiguous_subsequences_which_recursively_add_up_to_9;

public class Main {

	public static void main(String argv[]){
		String s = "1809";
		int count = 0;
		
		char[] arr = s.toCharArray();
		for(int i = 0;i<s.length();i++){
			
			int num = arr[i]-'0';
			int sum = num;
			if(num==9)
				count++;
			for(int j = i+1;j<s.length();j++){
				
				sum = (sum+arr[j]-'0')%9;
				//System.out.println("dd "+sum);
				if(sum==0)
					count++;
			}
		}
		
		System.out.println(count);
	}
}
