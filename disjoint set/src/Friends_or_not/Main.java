package Friends_or_not;

class Pair{
	int a;
	int y;
}
class Friend{
	int parent[];
	int rank[];
	int n;
	Friend(int n ){
		this.n = n;
		rank = new int[n];
		parent = new int[n];
		for(int i = 0;i<n;i++){
			rank[i] = 0;
			parent[i] = i;
		}
	}
	
	int find(int x){
		if(x!=parent[x]){
			parent[x] = find(parent[x]);
		}
		return parent[x];
	}
	void union(int x,int y){
		int x_p = find(x);
		int y_p = find(y);
		if(x_p==y_p)
			return;
		if(x_p>y_p){
			parent[y_p] = x_p;
		}
		else if(y_p>x_p){
			parent[x_p] = y_p;
		}
		else{
			parent[y_p] = x_p;
			rank[x_p]++;
		}
	}
	
	void findFriend(int x,int y){
		
		if(find(x)==find(y))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
public class Main {

	public static void main(String argv[]){
		
		int n = 5;
		Friend g = new Friend(5);
		g.union(0, 2);
		g.union(4, 2);
		g.union(3, 1);
		g.findFriend(4,0);
		g.findFriend(1,0);
	}
}
