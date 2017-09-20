package Arrange_given_numbers_to_form_the_biggest_number;

import java.util.*;

public class Main {

	public static void main(String argv[]){
		
		String[] arr = {"54", "546", "548", "60"};
		
		
		printBiggestNumber(arr);
		
	}
	 static void printBiggestNumber(String [] arr) 
	{
	    int i;
	    Arrays.sort(arr,new Comparator<String>() 
	    {
	        @Override
	        public int compare(String a, String b) 
	        {
	            String s1 = a + b;
	            String s2 = b + a;
	            return s2.compareTo(s1);
	        }
	    });

	    for(i=0 ; i< arr.length ; i++)
	        System.out.print(arr[i]);
	}


}