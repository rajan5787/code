package Infix_to_Postfix;
import java.util.*;

public class Main {

	public static boolean check(char c){
		
		if(c=='+'||c=='-'||c=='*'||c=='/'||c=='%'||c=='^')
			return true;
		
		return false;
	}
	static int findValue(char ch)
    {
        switch (ch)
        {
        case '+':
        case '-':
            return 1;
      
        case '*':
        case '/':
            return 2;
      
        case '^':
            return 3;
        }
        return -1;
    }
	public static void main(String argv[]){
		String exp = "a+b*(c^d-e)^(f+g*h)-i";
		Stack<Character> s = new Stack<>();
		String result = "";
		
		for(int i = 0;i<exp.length();i++){
			
			char c = exp.charAt(i);
			if(check(c)){
				
				int val = findValue(c);
				while(!s.isEmpty()&&val<=findValue(s.peek())){
					result += s.pop(); 
					//System.out.println("result "+result);
				}
				
				s.push(c);
			}
			else if(c=='(')
				s.push('(');
			else if(c==')'){
				
				while(!s.isEmpty()&&s.peek()!='('){
					result+=s.pop();
					//System.out.println("resultt "+result);
				}
				
				if(s.isEmpty()){
					System.out.println("Invalid ");
					break;
				}
				
				s.pop();
				
			}
			else{
				result+=c;
			}
		}
		
		while(!s.isEmpty())
			result+=s.pop();
		System.out.println(result);

	}
}
