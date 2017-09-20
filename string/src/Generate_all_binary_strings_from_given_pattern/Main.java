package Generate_all_binary_strings_from_given_pattern;
import java.util.*;

public class Main {

	public static void main(String argv[]){
		String s = "1??0?101";
		
		print(s);
	}
	
/*	static void print(String s,int index){
		
		if(s.length()==index){
			System.out.println(s);
			return;
		}
		
		if(s.charAt(index)=='?'){
			print(s.substring(0,index)+"0"+s.substring(index+1,s.length()),index+1);
			print(s.substring(0,index)+"1"+s.substring(index+1,s.length()),index+1);
		}
		else{
			print(s,index+1);
		}
		
	}*/
	
	static void print(String s){
		Queue<String> q = new LinkedList<String>();
		q.add(s);
		
		while(!q.isEmpty()){
		
			String ss = q.poll();
			int index=-1;
			for(int i = 0;i<ss.length();i++){
				if(ss.charAt(i)=='?'){
					index = i;
					break;
				}
			}
			
			if(index!=-1){
				
				q.add(ss.substring(0, index)+"0"+ss.substring(index+1,ss.length()));
				q.add(ss.substring(0, index)+"1"+ss.substring(index+1,ss.length()));

			}
			else
				System.out.println(ss);
		}
		
	}
}
