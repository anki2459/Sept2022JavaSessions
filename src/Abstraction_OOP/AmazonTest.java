package Abstraction_OOP;

public class AmazonTest {

	public static void main(String[] args) {

		LoginPage lp =new LoginPage();
		lp.doLogin("anita", "123456");
		lp.doLogin("ankita", "123456","456788");
		lp.header();
		lp.logo();
		lp.title();
		lp.url();
		
		//LoginPage lp = new Page(); //downcasting
		
		Page p = new LoginPage();
		p.header();
		p.logo();
		p.title();
		p.url();
	}

}
