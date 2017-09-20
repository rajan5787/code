package traffic_manegment_system;

import java.util.HashMap;

public class Payment {

	static public HashMap<String,String> user_bank_detail_map = new HashMap<String,String>();
	static public HashMap<String,Integer> user_bank_money = new HashMap<String,Integer>();
	
	Payment(){
		
		user_bank_detail_map.put("rajan","qwerty");
		user_bank_money.put("rajan",100000);
		user_bank_detail_map.put("harshal","qwerty");
		user_bank_money.put("harshal",1478);
		user_bank_detail_map.put("akar","qwerty");
		user_bank_money.put("akar",1145);
		user_bank_detail_map.put("nishit","qwerty");
		user_bank_money.put("nishit",10140);
		user_bank_detail_map.put("vivek","qwerty");
		user_bank_money.put("vivek",5689);

	}
	
	public boolean check_bank_user(String u,String p){
		
		if(p.equals(user_bank_detail_map.get(u))){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean checkTotalMoney(String u,int pay,CriminalActivitySystem c){
		if(user_bank_money.get(u)>pay){
			
			user_bank_money.put(u,user_bank_money.get(u)-pay);
			c.challanDetails.remove(u);
			
			return true;
		}
		else
			return false;
	}
	
}
