package Binary_representation_of_next_number;

public class Main {

	public static void main(String[] argv){
		String s = "1111";
		String ss = "";
		int i ;
		boolean flag = true;
		for(i = s.length()-1;i>=0;i--){
			if(s.charAt(i)=='1')
				ss+="0";
			else{
				flag = false;
				ss+="1";
				break;
			}
		
		}
	if(flag){
		ss+="1";
		//System.out.println(ss);
	}
	else
		//System.out.println("ee "+i);
		for(int j =s.length()-i-2;j>=0;j--){
			ss+=s.charAt(j);
			//System.out.println("sss "+ss);
		}
	
	//String ans = "";
	for(int j = ss.length()-1;j>=0;j--)
		System.out.print(ss.charAt(j));
	
	}
}
