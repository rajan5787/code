package oddSum;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String argv[])throws Exception{
		BufferedReader asd = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(asd.readLine().trim());
		int[] arr = new int[n];
		String[] s = asd.readLine().trim().split(" ");
		for(int i = 0;i<n;i++)
			arr[i] = Integer.parseInt(s[i]);
		
		int sum = 0;
		for(int i = 0;i<n;i++){
			if(arr[i]>0)
				sum+=arr[i];
		}
		//System.out.println("sum "+sum);
		
		if(sum%2!=0)
			System.out.println(sum);
		
		else{
		int min = 99999;
		for(int i = 0;i<n;i++)
			if(Math.abs(arr[i])%2!=0)
				if(min>Math.abs(arr[i]))
					min = Math.abs(arr[i]);
		
		//System.out.println("min "+min);
		
			System.out.println(sum-min);
		}
	}
}
