package Print_all_possible_words_from_phone_digits;

public class Main {
	static String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

	public static void main(String argv[]){
		int[] num = {2,3,4};
		char[] s = new char[num.length+1];
		print(num,s,0);
	}
	
	static void print(int[] num,char[] s,int n){
		
		if(n>=num.length){
			System.out.println(s);
			return;
		}

			for(int i = 0;i<arr[num[n]].length();i++){
				s[n] = arr[num[n]].charAt(i); 
				print(num,s,n+1);
				if(num[i]==0||num[i]==1)
					return;
			}
			
		
	}
}
