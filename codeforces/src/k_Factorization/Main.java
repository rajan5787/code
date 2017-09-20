package k_Factorization;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String argv[]) throws Exception{
		
		BufferedReader asd = new BufferedReader(new InputStreamReader(System.in));
		String[] s = asd.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int count = Integer.parseInt(s[1]);
		int num = n;
		int[] arr = new int[10000];
		//int[] a = new int[n];
		int j = 0;
		boolean flag = false;
		int z = 0;
		for(int i = 2;i*2<=num;i++){
		
			while(n%i==0){
				
				arr[j++] = i;
				n = n/i;
				z++;
			
		}
			}
		if(count==1)
			System.out.println(num);
		
		else if(z<count){
			System.out.println(-1);
		}
		else if(count==z){
			for(int i = 0;i<z;i++)
				System.out.print(arr[i]+" ");
		}
		else{
		for(int i = 0;i<count-1;i++){
			
			System.out.print(arr[i]+" ");
			num/=arr[i];
		}
		System.out.println(num+" ");
		}
	}
}
