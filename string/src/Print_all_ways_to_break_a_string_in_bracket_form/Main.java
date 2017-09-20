package Print_all_ways_to_break_a_string_in_bracket_form;

public class Main {

	public static void main(String argv[]){
		String s = "abc";
		print(s,"");
	}
	
	static void print(String str,String out){
		
		if (str.equals("")){
			System.out.println(out);
			return;
		}

		for(int i = 0;i<str.length();++i){
			StringBuilder sb = new StringBuilder();
			sb.append("(");
			sb.append(str.substring(i,str.length()));
			sb.append(")");
			sb.append(out);
			print(str.substring(0,i),String.valueOf(sb));
		}
	}
	
}


