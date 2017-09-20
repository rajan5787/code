package monk_kundan;

import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

	public static void main(String argv[]) throws IOException{
		
		String s = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		HashMap<String, Integer>  mhashmap = new HashMap<>();
		String[] arr = s.split("");
		for(int i = 0;i<arr.length;i++){
			mhashmap.put(arr[i],i);
		}
		
		BufferedReader asd= new BufferedReader(new InputStreamReader(System.in));	
		int n = Integer.parseInt(asd.readLine());
		
		while(n--!=0){
			
			String[] arr1 = asd.readLine().split(" ");
			int sum = 0;

			for(int j = 0;j<arr1.length;j++){
				
				String[] subs = arr1[j].split("");
				
				for(int k =0 ;k<subs.length;k++){
					
					sum += mhashmap.get(subs[k])+k;
					
				}
			}
			System.out.println(sum*arr1.length);
		}
	}
}
