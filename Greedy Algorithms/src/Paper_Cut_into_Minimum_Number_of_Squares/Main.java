package Paper_Cut_into_Minimum_Number_of_Squares;

public class Main {
	
	public static void main(String argv[]){
		
		int a = 4;
		int b = 5;
		while(b-a>=0){
			int count = 0;
			while(b-a>=0){
				b= b-a;
				count++;
			}
			System.out.println("size "+a+" "+"total "+count);
			int temp = b;
			b = a;
			a = temp;
		}
	}

}
