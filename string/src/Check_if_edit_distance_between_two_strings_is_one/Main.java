package Check_if_edit_distance_between_two_strings_is_one;

public class Main {

	public static void main(String argv[]){
		
		String s1 = "geeks";
		String s2 = "geakss";
		
		int m = s1.length();
		int n = s2.length();
		if(Math.abs(m-n)>1)
			System.out.println("NO");
		else{
			int i = 0,j = 0;
			int count = 0;
			while(i<m&&j<n){
				
				if(s1.charAt(i)!=s2.charAt(j)){
					
					if(count==1){
						count++;
						break;
					}
					if(m>n)
						i++;
					else if(n>m)
						j++;
					else{
						i++;
						j++;
					}
					count++;
				}
				else{
					i++;
					j++;
				}
			}
			
			if(i<m||j<n)
				count++;
			
			if(count==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
