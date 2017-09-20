package Maximum_Weight_Difference;

import java.io.*;
import java.util.Arrays;
public class Main {

	public static void main(String argv[])throws Exception{
		
		BufferedReader asd = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(asd.readLine().trim());
		for(int q = 0;q<t;q++){
			
			String[] s = asd.readLine().trim().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int[] arr = new int[a];
			
			s = asd.readLine().trim().split(" ");
			for(int i = 0;i<s.length;i++)
				arr[i] = Integer.parseInt(s[i]);
			
			Arrays.sort(arr);
			int sum1 = 0,sum2 = 0;
			if(a/2>=b){
				
				for(int i = 0;i<b;i++)
				sum1 += arr[i];

				for(int i = b;i<a;i++)
				sum2 += arr[i];
			}
			else{
				
				for(int i = a-b-1;i>=0;i--)
				sum2 += arr[i];

				for(int i = a-1;i>=a-b;i--)
				sum1 += arr[i];
				
				
			}
			
System.out.println(sum2 -sum1>0 ? sum2 -sum1 : sum1 -sum2);
		}
		
		
	}
}
