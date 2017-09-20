package Find_maximum_depth_of_nested_parenthesis_in_a_string;
import java.util.*;

public class Main {

	public static void main(String argv[]){
		
		String s =" ";
		char[] arr = s.toCharArray();
		int count=0;
		boolean flag = true;
		int max = 0;
		for(int i = 0;i<arr.length;i++){
			if(arr[i]=='('){
				count++;
				if(count>max)
					max = count;
			}
			else if(arr[i]==')'){
				if(count>0)
					count--;
				else{
					flag = false;
					break;
				}
			}
			else
				continue;
		}
		
		if(!flag||count>0)
			System.out.println(-1);
		else
			System.out.println(max);
	}
}
