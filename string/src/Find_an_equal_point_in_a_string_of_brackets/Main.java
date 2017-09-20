package Find_an_equal_point_in_a_string_of_brackets;

public class Main {

	public static void main(String[] argv){
		String s = "((";
		char[] arr = s.toCharArray();
		
		int[] pre = new int[arr.length+1];
		int[] post = new int[arr.length+1];
		pre[0] = 0;
		post[arr.length] = 0;
		int n = arr.length;
		if(arr[0]=='(')
			pre[1] = 1;
		if(arr[arr.length-1]==')')
			post[arr.length-1]=1;
			
		for(int i = 1;i<arr.length;i++){
			if(arr[i]=='(')	
				pre[i+1] = pre[i]+1;
			else
				pre[i+1] = pre[i];
		}
		for(int i = arr.length-2;i>=0;i--){
			if(arr[i]==')')	
				post[i] = post[i+1]+1;
			else
				post[i] = post[i+1];
		}
		
		if(pre[arr.length]==0)
			System.out.println(arr.length);
		else if(post[0]==0)
			System.out.println(0);
		else{
		for(int i = 0;i<=n;i++)
			if(pre[i]==post[i]){
				System.out.println(i);
				break;
			}
		}
	}
}
