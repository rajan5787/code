package Compute_the_integer_absolute_value_abs_without_branching;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String argv[])throws Exception{
		BufferedReader asd = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(asd.readLine().trim());
		
		int p = 1<<31;
		//System.out.println(p);
		if((x&p)==p){
		//	System.out.println("fff");
			x = ~x;
			x = x+1;
		}
		System.out.println(x);
	}
}
