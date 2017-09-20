package traffic_manegment_system;

import java.util.HashMap;

public class Trafficmanegment {

	HashMap<String,String> userLogin;
	int total_city = 5;
	static String start_location[] = new String[50];;
	static String end_location[] = new String[50];
	static int distance[][] = new int[50][50];
	
	static String past_traffic[] = new String[50];
	static String current_traffic[] = new String[50];
	static String future_traffic[] = new String[50];
	int[][] time =  new int[50][50];

	Trafficmanegment(){
		userLogin = new HashMap<String,String>();
	
		addData();
	}
	
	
	public int getUserType(String username,String password){
		
		
		try{
		if(userLogin.get(username).equals("normaluser"))
		return 1;
		if(userLogin.get(username).equals("ambulancedriver"))
		return 2;
		if(userLogin.get(username).equals("policeofficer"))
		return 3;
		}
		catch(Exception e){
		return 4;
		}
		return 4;
	}
	
	
	public int findSortestPath(int n,int s,int e){
		
		if(n==1)
			return distance[s][e];
		else
			return time[s][e];
	}
	
	public void showTraffic(int n,int l){
		
		
		if(n==1){
			
			System.out.println("Traffic of "+start_location[l]+" on 5 march was "+ past_traffic[l]);
		}
		else if(n==2){
			System.out.println("Traffic of "+start_location[l]+" is  "+ current_traffic[l]);

		}
		else if(n==3){
			System.out.println("Traffic of "+start_location[l]+" on 5 march will be "+ future_traffic[l]);

		}
		else{
			System.out.println("Invalid choise");
		}
	}
	
	public void printCity(){
		
		for(int i= 0;i<=5;i++){
			
			System.out.println(i+". "+start_location[i]);
			
		}
	}
	public void addData(){
		
		userLogin.put("rajan","normaluser");
		userLogin.put("nishit","policeofficer");
		userLogin.put("Harshal","policeofficer");
		userLogin.put("vivek","ambulancedriver");
		userLogin.put("akar","normaluser");
		userLogin.put("maulik","policeofficer");
		userLogin.put("yash","ambulancedriver");
		userLogin.put("raju","normaluser");
		
		start_location[0] = "Gandhinagar";
		start_location[1] = "Ahamdabad";
		start_location[2] = "Baroda";
		start_location[3] = "Anand";
		start_location[4] = "Surat";
		start_location[5] = "Junagath";
		

		end_location[0] = "Gandhinagar";
		end_location[1] = "Ahamdabad";
		end_location[2] = "Baroda";
		end_location[3] = "Anand";
		end_location[4] = "Surat";
		end_location[5] = "Junagath";
		
		distance[0][1] = 50;
		distance[0][2] = 60;
		distance[0][3] = 70;
		distance[0][4] = 80;
		distance[0][5] = 90;
		distance[1][0] = 10;
		distance[1][2] = 20;
		distance[1][3] = 88;
		distance[1][4] = 45;
		distance[1][5] = 100;
		distance[2][0] = 41;
		distance[2][1] = 74;
		distance[2][3] = 84;
		distance[2][4] = 41;
		distance[2][5] = 110;
		distance[3][0] = 147;
		distance[3][1] = 789;
		distance[3][2] = 125;
		distance[3][4] = 746;
		distance[3][5] = 789;
		distance[4][0] = 45;
		distance[4][1] = 789;
		distance[4][2] = 412;
		distance[4][3] = 49;
		distance[4][5] = 78;
		distance[5][0] = 12;
		distance[5][1] = 47;
		distance[4][2] = 79;
		distance[4][3] = 501;
		distance[4][5] = 500;


		time[0][1] = 40;
		time[0][2] = 10;
		time[0][3] = 80;
		time[0][4] = 20;
		time[0][5] = 74;
		time[1][0] = 100;
		time[1][2] = 14;
		time[1][3] = 47;
		time[1][4] = 41;
		time[1][5] = 170;
		time[2][0] = 41;
		time[2][1] = 74;
		time[2][3] = 84;
		time[2][4] = 41;
		time[2][5] = 110;
		time[3][0] = 145;
		time[3][1] = 78;
		time[3][2] = 12;
		time[3][4] = 74;
		time[3][5] = 78;
		time[4][0] = 5;
		time[4][1] = 89;
		time[4][2] = 72;
		time[4][3] = 9;
		time[4][5] = 8;
		time[5][0] = 28;
		time[5][1] = 40;
		time[4][2] = 78;
		time[4][3] = 51;
		time[4][5] = 57;

		past_traffic[0] = "Low";
		past_traffic[0] = "Too High";
		past_traffic[0] = "Too low";
		past_traffic[0] = "High";
		past_traffic[0] = "Midume";
		past_traffic[0] = "High";
		
		current_traffic[0] = "Midume";
		current_traffic[0] = "High";
		current_traffic[0] = "Too high";
		current_traffic[0] = "Midume";
		current_traffic[0] = "Low";
		current_traffic[0] = "Midume";
		
		future_traffic[0] = "Low";
		future_traffic[0] = "Low";
		future_traffic[0] = "Too low";
		future_traffic[0] = "Too High";
		future_traffic[0] = "Midume";
		future_traffic[0] = "Midume";
		
	}
}
