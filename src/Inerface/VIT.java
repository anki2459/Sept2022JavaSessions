package Inerface;

public class VIT extends Education implements US_Education,UK_Education,India_Education {

	@Override
	public void engineering() {
			System.out.println("VIT--- Engineering");		
	}

	@Override
	public void medicine() {
		System.out.println("VIT--- medicine");		
		
	}

	@Override
	public void literature() {
		System.out.println("VIT--- literature");			
	}

	@Override
	public void poems() {
		System.out.println("VIT--- poems");	
		
	}

	@Override
	public void health() {
		System.out.println("VIT--- health");	
		
	}

	@Override
	public void biotech() {
		System.out.println("VIT--- biotech");	
		
	}

	@Override
	public void globalclass() {
		System.out.println("VIT--- globalclass");	
		
	}
	@Override
	public void freeEducation()
	 {
	System.out.println("VIT --Free Education"); 
	 }
	public void lifeScience()
	 {
	System.out.println("VIT --life sciences"); 
	 }
public static void main(String[] args)
{
	VIT v= new VIT();
	v.biotech();
	v.engineering();
	v.freeEducation();
	v.globalclass();
	v.health();
	v.literature();
	v.medicine();
	v.poems();
	v.lifeScience();
	
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	Education e = new Education();
	e.freeEducation();
	
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//	VIT v1 = (VIT) new Education();  //downcasting
//	v1.biotech();
	
	Education e1 = new VIT();  //topcasting 
	e1.freeEducation();
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	
	//US_Education us = new US_Education(); //Cannot instantiate the type US_Education
	
	US_Education us = new VIT(); //top casting
	us.biotech();
	us.health();
	
}
}
