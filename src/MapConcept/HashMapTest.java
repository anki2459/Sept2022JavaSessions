package MapConcept;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<String,String> empMap = new HashMap<String,String>();
		//Add entries in hashmap
		empMap.put("Ankita", "100");
		empMap.put("Ankush", "200");
		empMap.put("Ankita", "300");
		empMap.put("Chhaya", "1000");
		empMap.put("Suresh", "50");
		empMap.put(null, "600");
		empMap.put(null, "800");
		
		//fetch entries from hashmap
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
	System.out.println(empMap.get("Ankita"));	
	System.out.println(empMap.get("Ankush"));	
	System.out.println(empMap.get("Chhaya"));	
	System.out.println(empMap.get("Suresh"));	
	System.out.println(empMap.get(null));	
	
		    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	//fetch all at once
	empMap.forEach((k,v) -> System.out.println(k +" : "+v));
	
		
		
	}

}
