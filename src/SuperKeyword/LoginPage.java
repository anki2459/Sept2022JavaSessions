package SuperKeyword;

public class LoginPage extends Page {
	int timeout = 200;
	public LoginPage()
	{
		//System.out.println("Hi"); //Constructor call must be the first statement in a constructor
		super(10,20);
	}
	public void loginInfo() {
		System.out.println("Login info");
		//display();
		super.display();
	}
	@Override
	public void display()
	{
		System.out.println("Login Display");
	}
	public void getTimeOut()
	{
		System.out.println(timeout);
		System.out.println(super.timeout);
	}

}
