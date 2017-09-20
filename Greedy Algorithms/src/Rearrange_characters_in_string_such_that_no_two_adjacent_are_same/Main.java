package Rearrange_characters_in_string_such_that_no_two_adjacent_are_same;

import java.util.*;

public class Main {

	public static void main(String argv[]){
		
		String s = "aaabc";
		String output = "";
		 Map map = new HashMap();
		 for(int i = 0;i<s.length();i++){
			 
			 if(i==0)
				output = String.valueOf(s.charAt(0))+"";
	
			else if(output.charAt(output.length()-1)==s.charAt(i)){
				add(map,s.charAt(i));
			}
			else{
				output += s.charAt(i)+String.valueOf(remove(map,s.charAt(i)));
			}
		 }
		 System.out.println(output);
	}
	
	
	static void add(Map map,char c){
		char x = c;
		
		if(map.containsKey(c)){
			int a = (int)map.get(c);
			map.replace(c, a+1);
		}
		else{
			map.put(c, 1);
		}
		
		
	}
	
	static String remove(Map map,char c){
		
		String a = "";
		Set s = map.keySet();
		Iterator i = s.iterator();
		while(i.hasNext()){
			
			char x =(char)i.next();
			if(c!=x){
				
				int b = (int) map.get(x);
				if(b-1<=0)
					map.remove(x);
				else
					map.replace(x, b-1);
				a = String.valueOf(x);
				break;
			}
			
		}
		return a;
	}
}