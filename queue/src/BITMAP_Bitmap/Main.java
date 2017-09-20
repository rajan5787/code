package BITMAP_Bitmap;

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
		
		 int arr[][] = { {0,0,0,1},
                 {0,0,1,1},
                 {0,1,1,0}};
		 
		 find(arr);
		 //System.out.println(ans);

	}
	
	static void find(int[][] arr){
		
		int R = arr.length;
		int C = arr[0].length;
		int r = 0;
		int b= 0;
		int[][] ans = new int[R][C];
		Queue<coordinate> q = new LinkedList<coordinate>();
		Queue<coordinate> q1 = new LinkedList<coordinate>();
		int n = 0;
		for(int i = 0 ;i<R;i++){
			for(int j = 0;j<C;j++){
				r++;

				if(arr[i][j]==1){
					n++;
					q.add(new coordinate(i,j));
					q1.add(new coordinate(i,j));
					arr[i][j] = -1;
				}
			}
		}
		while(r>n){
			b++;
			int s = q.size();
			for(int i = 0;i<s;i++){
				coordinate temp = q.poll();
			if(temp.x-1>=0&&arr[temp.x-1][temp.y]==0){
				q.add(new coordinate(temp.x-1,temp.y));
				q1.add(new coordinate(temp.x-1,temp.y));
				arr[temp.x-1][temp.y] = b;
				n++;
			}
			if(temp.y-1>=0&&arr[temp.x][temp.y-1]==0){
				q.add(new coordinate(temp.x,temp.y-1));
				q1.add(new coordinate(temp.x,temp.y-1));
				arr[temp.x][temp.y-1] = b;
				n++;
			}
			if(temp.x+1<R&&arr[temp.x+1][temp.y]==0){
				q.add(new coordinate(temp.x+1,temp.y));
				q1.add(new coordinate(temp.x+1,temp.y));
				arr[temp.x+1][temp.y] = b;
				n++;
			}
			if(temp.y+1<C&&arr[temp.x][temp.y+1]==0){
				q.add(new coordinate(temp.x,temp.y+1));
				q1.add(new coordinate(temp.x,temp.y+1));
				arr[temp.x][temp.y+1] = b;
				n++;
			}
		}
		}

		for(int i = 0;i<R;i++){
			for(int j = 0;j<C;j++){
				if(arr[i][j]==-1)
					System.out.print(0+" ");
				else
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

