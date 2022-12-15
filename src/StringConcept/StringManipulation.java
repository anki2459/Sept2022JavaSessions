package StringConcept;

public class StringManipulation {

	public static void main(String[] args)
	{
		String s = "This is my java code.I aim happy to be here in thsi";
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length()-1));
		System.out.println(s.indexOf("i"));
		System.out.println(s.indexOf("i",(s.indexOf("i")+1)));
		System.out.println(s.length());
		int val =s.indexOf("i",(s.indexOf("i")+1));
		int newval = s.indexOf("i", (val+1));
		int lastval = s.indexOf("i", (newval+1));
		System.out.println(val + ":"+newval);
		System.out.println(s.indexOf("i", (val+1)));
		System.out.println(s.indexOf("i",(s.indexOf("i",(s.indexOf("i")+1))+1)));
		
		System.out.println(s.indexOf("i", (newval+1)));
		System.out.println(s.indexOf("i", (lastval+1)));
		
		
		
	}

}
