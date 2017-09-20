package Left_Rotation_and_Right_Rotation_of_a_String;

public class Main {

	public static void main(String argv[]){
		String s = "GeeksforGeeks";
	    StringBuffer sb = new StringBuffer(s);
	    sb.append(s);
	    
	    leftrotet(sb,2,s.length());
	    System.out.println();
	    rightrotet(sb,2,s.length());
	}
	
	static void leftrotet(StringBuffer sb,int d,int len){
		
		for(int i = d;i<len+d;i++)
			System.out.print(sb.charAt(i));

	}
	static void rightrotet(StringBuffer sb,int d,int len){
		
		for(int i = len-d;i<2*len-d;i++)
			System.out.print(sb.charAt(i));
	}
}
