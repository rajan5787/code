package Find_the_row_with_maximum_number_of_1s;

public class Main {

	public static void main(String argv[]){
		
		int[][] a = {{0, 1, 1, 1},{0 ,0 ,1 ,1},{1 ,1 ,1 ,1 },{0 ,0 ,0 ,0}};
		
		first : for(int i = 0;i<a[0].length;i++){
			second : for(int j = 0;j<a.length;j++){
				
				if(a[j][i]==1){
					System.out.println(j);
					break first;
				
				}
			}
		}
	}
}
