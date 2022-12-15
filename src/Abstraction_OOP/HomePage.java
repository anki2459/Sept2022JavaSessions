package Abstraction_OOP;

public class HomePage extends Page{

	@Override
	public void title() {
		System.out.println("HP-- Title");
		
	}

	@Override
	public void url() {
		System.out.println("HP-- url ");
	}
	@Override
	public void header()
	{
		System.out.println("HP--header");
	}

}
