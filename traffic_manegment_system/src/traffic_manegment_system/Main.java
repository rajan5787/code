package traffic_manegment_system;

import java.util.*;

public class Main {

	static Trafficmanegment t; 
	static CriminalActivitySystem c; 
	static Payment pp;

	static Scanner asd;
	static String flag;

	static int usertype = 4;
	static int challan_money = 0;
	static String username ;
	static String password; 
	
	public static void main(String argv[]){
		
		asd = new Scanner(System.in);
		t = new Trafficmanegment();
		c = new CriminalActivitySystem();
		pp = new Payment();
		
		System.out.println("\n Enter username: ");
		username = asd.nextLine().trim();
		System.out.println("\n Enter password");
		password = asd.nextLine().trim();
		usertype = t.getUserType(username,password);
		
		//int user_type = asd.nextInt();
		int opction = 0;
		
		switch(usertype){
		
		case 1 :
			System.out.println("\nSelect one opction:");
			System.out.println("1. Find shortest path");
			System.out.println("2. Show traffic details");
			System.out.println("3. payment");
			
			opction = asd.nextInt();
			
			if(opction==1){
				
				findSortedPath();
				
			}
			else if(opction==2){
				showTraffic();
			}
			else if(opction==3){
			
				payMoney();
			}
			else{
				System.out.println("Please enter valid number");
			}
			
			
		case 2 :
			System.out.println("\nSelect one opction:");
			System.out.println("1. Find shortest path");
			System.out.println("2. Show traffic details");
			System.out.println("3. payment");
			System.out.println("4. Emergency time");
			
			opction = asd.nextInt();
			
			if(opction==1){
				
				findSortedPath();
			}
			else if(opction==2){
				showTraffic();
			}
			else if(opction==3){
			
				payMoney();
			}
			else if(opction==4){
				t.printCity();

				System.out.println("Enter start location");
				int s = asd.nextInt();
				System.out.println("Enter end location");
				int e = asd.nextInt();

				System.out.println(t.findSortestPath(2, s, e));
				
			}
			else{
				System.out.println("Please enter valid number");
			}
		
		case 3 :
			System.out.println("\nSelect one opction:");
			System.out.println("1. Find shortest path");
			System.out.println("2. Show traffic details");
			System.out.println("3. Show crime");
			
			opction = asd.nextInt();
			
			if(opction==1){
				
				findSortedPath();
			}
			if(opction==2){
				showTraffic();
			}
			if(opction==3){
			
				System.out.println("\n Enter city ");
				t.printCity();
				
				int n = asd.nextInt();
				c.findCrime(n);
			}
			else{
				System.out.println("Please enter valid number");
			}
			
		case 4 :
			System.out.println("You are not valid user");
			
		}
		
	}
	
	
	public static void findSortedPath(){
		
		System.out.println(" By 1. time or 2. path"); 
		int n = asd.nextInt();
		t.printCity();

		System.out.println("Enter start location");
		int s = asd.nextInt();
		System.out.println("Enter end location");
		int e = asd.nextInt();
		
		System.out.println(t.findSortestPath(n,s,e));
	}
	
	public static void showTraffic(){
	
		System.out.println("1. Past Traffic");
		System.out.println("2. Current Traffic");
		System.out.println("3. Future Traffic");
		int n = asd.nextInt();
		t.printCity();
		int  l = asd.nextInt();
		t.showTraffic(n,l);
	}
	
	public static void payMoney(){
		
		challan_money = c.challandetails(username);
		if(challan_money!=0){
		System.out.println("You want to pay money or not");
		flag = asd.next();
		
		if(flag.equals("y")){
			System.out.println("\nEnter Your bank details");
			System.out.println("\n Enter username: ");
			String u = asd.next();
			System.out.println("\n Enter password");
			String pq = asd.next();
			
			if(pp.check_bank_user(username, pq)){
				
				if(pp.checkTotalMoney(username,challan_money,c)){
					System.out.println("You have paid money");
					System.out.println("Chalan is generated");

				}
				else{
					System.out.println("Your account does not have inough money");
				}
			}
			else{
				System.out.println("Wrong Details");
			}
			
		}
		}
		else{
			System.out.println("Threre no crime agest you!!!");
		}
	}
	

	
}
