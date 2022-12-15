package MapConcept;

import java.util.HashMap;

public class TestHash {

	public static String loginInfo(String role)
	{
		HashMap<String,String> credInfo = new HashMap<String,String>();
		credInfo.put("admin", "Admin;Admin@123");
		credInfo.put("baseuser", "baseuser;BaseUs@123");
		credInfo.put("dealer", "Dealer;Deal@123");
		credInfo.put("proprietor", "proprietor;Prop@123");
		
		return credInfo.get(role);
	}
	public static void doLogin(String un,String pwd)
	{
		System.out.println("Logging in using "+un + " : "+pwd);
	}
	public static void main(String[] args)
	{
		String[] cred = loginInfo("baseuser").split(";");
		String un =cred[0];
		String pwd =cred[1];
		
		doLogin(un,pwd);
		
		
	}

}
