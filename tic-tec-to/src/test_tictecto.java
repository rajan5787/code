import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class test_tictecto {

	
	public static boolean hasWon(int[][] board){
		
		for(int i = 0;i<3;i++){
				if((board[i][0]==1&&board[i][1]==1&&board[i][2]==1)||
						(board[i][0]==2&&board[i][1]==2&&board[i][2]==2)){
					return true;
				}
			}
		

		for(int i = 0;i<3;i++){
				if((board[0][i]==1&&board[1][i]==1&&board[2][i]==1)||
						(board[0][i]==2&&board[1][i]==2&&board[2][i]==2)){
					return true;
				}
			}
		if((board[0][0]==1&&board[1][1]==1&&board[2][2]==1) ||
			(board[0][2]==1&&board[1][1]==1&&board[2][0]==1) ||
			(board[0][0]==2&&board[1][1]==2&&board[2][2]==2) ||
			(board[0][2]==2&&board[1][1]==2&&board[2][0]==2) )
				return true;
		
		return false;
	}

	@Test
	public void test() {

	
		int[][] testBord = {{0,0,0},{0,0,0},{0,0,0}};
		assertEquals(hasWon(testBord),false);
		int[][] testBord2 = {{1,0,0},{1,1,0},{1,1,0}};
		assertEquals(hasWon(testBord2),true);
		int[][] testBord3 = {{1,2,1},{2,1,2},{2,1,2 }};
		assertEquals(hasWon(testBord3),false);
	}

}
