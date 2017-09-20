package Check_if_a_given_sequence_of_moves_for_a_robot_is_circular_or_not;

public class Main {

	public static void main(String argv[]){
		
		int x = 0;
		int y = 0;
		int d = 0;
		String s = "GLGLGLG";
		for(int i = 0;i<s.length();i++){
			
			if(s.charAt(i)=='R')
				d = (d+1)%4;
			else if(s.charAt(i)=='L')
				d = (4+d-1)%4;
			else{
				if(d == 0)
					x++;
				else if(d==1)
					y++;
				else if(d==2)
					x--;
				else
					y--;
			}
				
		}
		if(x==0&&y==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
