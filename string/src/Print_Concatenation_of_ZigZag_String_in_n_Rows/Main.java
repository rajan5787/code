package Print_Concatenation_of_ZigZag_String_in_n_Rows;

public class Main {

	public static void main(String argv[]){
		String s = "ABCDEFGH";
		int n = 3;
		
		print(s,n);
	}
	
	static void print(String s,int n){
		String[] arr = new String[n];
		for(int i = 0;i<arr.length;i++)
			arr[i] = "";
		int row = 0;
		boolean flag = true;
		for(int i=0;i<s.length();i++){
		//	System.out.print(row);
			arr[row]+=s.charAt(i);
			//System.out.println(" "+arr[row]);

			if(row+1==n)
				flag=false;
			if(row==0)
				flag=true;
			
			if(flag)
				row++;
			else
				row--;
			
		}
		
		for(int i = 0;i<n;i++)
			System.out.print(arr[i]);
	}
}
