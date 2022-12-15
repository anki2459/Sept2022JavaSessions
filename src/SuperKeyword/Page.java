package SuperKeyword;

public class Page {
	int timeout = 100;
	public Page()
	{
		System.out.println("Page default constructor");
	}
	public Page(int a)
	{
		System.out.println("Page 1 arg constructor "+a);
	}
	public Page(int a,int b)
	{
		System.out.println("Page 2 arg constructor "+(a+b));
	}
	public void display()
	{
		System.out.println("Page Display");
	}

}
