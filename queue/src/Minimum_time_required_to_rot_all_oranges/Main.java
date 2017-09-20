package Minimum_time_required_to_rot_all_oranges;
import java.util.*;

class coordinate{
	int x;
	int y;
	coordinate(int x,int y){
		this.x = x;
		this.y = y;
	}
}
public class Main {

	public static void main(String argv[]){
		
		 int arr[][] = { {2, 1, 0, 2, 1},
                 {1, 0, 1, 2, 1},
                 {1, 0, 0, 2, 1}};
		 
		 int ans = find(arr);
		 System.out.println(ans);

	}
	
	static int find(int[][] arr){
		
		int R = arr.length;
		int C = arr[0].length;
		int r = 0;
		int b= 0;
		Queue<coordinate> q = new LinkedList<coordinate>();
		Queue<coordinate> q1 = new LinkedList<coordinate>();

		for(int i = 0 ;i<R;i++){
			for(int j = 0;j<C;j++){
				if(arr[i][j]==1||arr[i][j]==2){
					r++;
					if(arr[i][j]==2){
						q.add(new coordinate(i,j));
						q1.add(new coordinate(i,j));

					}
				}
			}
		}
		while(q1.size()!=r){

			b++;
			int s = q.size();
			if(s==0)
				return -1;
			for(int i = 0;i<s;i++){
				coordinate temp = q.poll();
				arr[temp.x][temp.y] = 0;
			if(temp.x-1>=0&&arr[temp.x-1][temp.y]==1){
				q.add(new coordinate(temp.x-1,temp.y));
				q1.add(new coordinate(temp.x-1,temp.y));
				arr[temp.x-1][temp.y] = 2;
			}
			if(temp.y-1>=0&&arr[temp.x][temp.y-1]==1){
				q.add(new coordinate(temp.x,temp.y-1));
				q1.add(new coordinate(temp.x,temp.y-1));
				arr[temp.x][temp.y-1] = 2;
			}
			if(temp.x+1<R&&arr[temp.x+1][temp.y]==1){
				q.add(new coordinate(temp.x+1,temp.y));
				q1.add(new coordinate(temp.x+1,temp.y));
				arr[temp.x+1][temp.y] = 2;
			}
			if(temp.y+1<C&&arr[temp.x][temp.y+1]==1){
				q.add(new coordinate(temp.x,temp.y+1));
				q1.add(new coordinate(temp.x,temp.y+1));
				arr[temp.x][temp.y+1] = 2;
			}
		}
		}
		return b;
	}
}

