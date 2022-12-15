  package Abstraction_OOP;

public class LoginPage extends Page
{

	@Override
	public void title() {
		System.out.println("LP-- Title");
		
	}

	@Override
	public void url() {
		System.out.println("LP-- url");
		
	}
public void doLogin(String un,String pw)
{
	System.out.println("Logged in with :"+ un + ":"+pw);
	
}

public void doLogin(String un,String pw,String otp)
{
	System.out.println("Logged in with :"+ un + ":"+pw + ":"+otp);
}
}
