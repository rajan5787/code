package traffic_manegment_system;

import java.util.*;

public class CriminalActivitySystem {
public HashMap<String,Integer> challanDetails;
public HashMap<Integer,ArrayList<String>> crimeDetails;

CriminalActivitySystem(){

	challanDetails = new HashMap<String,Integer>();
	crimeDetails = new HashMap<Integer,ArrayList<String>>();

	addData();
}

public int challandetails(String username){

	try{
	return challanDetails.get(username);
	}
	catch(Exception e){
		return 0;
	}
}

public void findCrime(int city){
	
	
	ArrayList<String> temp = crimeDetails.get(city);
	if(temp==null)
		System.out.println("Please Enter valid number");
	else{
		for(int i = 0;i<temp.size();i++){
			System.out.println(i+". "+temp.get(i));
		}
	}
}

public void addData(){
	challanDetails.put("nishit",1500);
	challanDetails.put("Harshal",10000);
	challanDetails.put("akar",100);
	challanDetails.put("maulik",450);
	challanDetails.put("yash",780);
	challanDetails.put("raju",410);
	
	ArrayList<String> temp = new ArrayList<>();
	temp.add("sector 1");
	temp.add("sector 18");
	temp.add("sector 41");
	temp.add("sector 10");
	temp.add("sector 5");
	crimeDetails.put(0, temp);
	
	temp.clear();
	temp.add("sector 7");
	temp.add("sector 8");
	temp.add("sector 1");
	temp.add("sector 40");
	temp.add("sector 24");
	crimeDetails.put(1, temp);
	
	temp.clear();
	temp.add("sector 17");
	temp.add("sector 45");
	temp.add("sector 19");
	temp.add("sector 45");
	temp.add("sector 12");
	crimeDetails.put(2, temp);
	
	temp.clear();
	temp.add("sector ");
	temp.add("sector 18");
	temp.add("sector 11");
	temp.add("sector 4");
	temp.add("sector 34");
	crimeDetails.put(3, temp);
	
	temp.clear();
	temp.add("sector 15");
	temp.add("sector 20");
	temp.add("sector 16");
	temp.add("sector 6");
	temp.add("sector 34");
	crimeDetails.put(4, temp);
	
	temp.clear();
	temp.add("sector 2");
	temp.add("sector 20");
	temp.add("sector 36");
	temp.add("sector 14");
	temp.add("sector 28");
	crimeDetails.put(5, temp);
	
	
	
}

}
