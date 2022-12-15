package Abstraction_OOP;

public abstract class Page 
{
public abstract void title();
public abstract void url();
public void header()
{
	System.out.println("Page--header");
}
public final void logo()
{
	System.out.println("Page--Logo");
}
}
