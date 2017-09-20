package Optimal_Strategy_Game_Pick;

class Pair{
	
	int first,second;
	int pick = 0;
	
}

public class Main {

	
	
	public static void main(String[] argv){
	
		 int pots[] = {3,1,5,6,2,9,3};

	        
	        Pair[][] moves = new Pair[pots.length][pots.length];
	        
	        for(int i=0; i < moves.length; i++){
	            for(int j=0; j < moves[i].length; j++){
	                moves[i][j] = new Pair();
	            }
	        }
	        
	        for(int i=0; i < pots.length; i++){
	            moves[i][i].first = pots[i];
	            //to track the sequence of moves
	            moves[i][i].pick = i;
	        }
	        
	        for(int l = 2; l <= pots.length; l++){
	            for(int i=0; i <= pots.length - l; i++){
	                int j = i + l -1;
	                if(pots[i] + moves[i+1][j].second > moves[i][j-1].second + pots[j]){
	                    moves[i][j].first = pots[i] + moves[i+1][j].second;
	                    moves[i][j].second = moves[i+1][j].first;
	                    moves[i][j].pick = i;
	                }else{
	                    moves[i][j].first = pots[j] + moves[i][j-1].second;
	                    moves[i][j].second = moves[i][j-1].first;
	                    moves[i][j].pick =j;
	                }
	            }
	        }
		 int i = 0;
		 int j = pots.length-1;
		 int a = 0;
		 for(int k = 0;k<pots.length;k++){
			 a = moves[i][j].pick;
			 System.out.println(pots[a]+" "+a);
			 if(a<=i){
				 i++;
			 }
			 else{
				 j--;
			 }
		 }
	}
}
