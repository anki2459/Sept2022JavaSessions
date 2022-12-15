package Inerface;

public class NIT extends Education implements US_Education,UK_Education,India_Education {

	@Override
	public void engineering() {
			System.out.println("NIT--- Engineering");		
	}

	@Override
	public void medicine() {
		System.out.println("NIT--- medicine");		
		
	}

	@Override
	public void literature() {
		System.out.println("NIT--- literature");			
	}

	@Override
	public void poems() {
		System.out.println("NIT--- poems");	
		
	}

	@Override
	public void health() {
		System.out.println("NIT--- health");	
		
	}

	@Override
	public void biotech() {
		System.out.println("NIT--- biotech");	
		
	}

	@Override
	public void globalclass() {
		System.out.println("NIT--- globalclass");	
		
	}
	@Override
	public void freeEducation()
	 {
	System.out.println("NIT --Free Education"); 
	 }
public static void main(String[] args)
{
	NIT v= new NIT();
	v.biotech();
	v.engineering();
	v.freeEducation();
	v.globalclass();
	v.health();
	v.literature();
	v.medicine();
	v.poems();
	
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	Education e = new Education();
	e.freeEducation();
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//	NIT v1 = (NIT) new Education();  //downcasting
//	v1.biotech();
	
	Education e1 = new NIT();  //topcasting 
	e1.freeEducation();
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	
	//US_Education us = new US_Education(); //Cannot instantiate the type US_Education
	
	US_Education us = new NIT(); //top casting
	us.biotech();
	us.health();
}
}
