package OOP_Encapsulation;

public class TestReg {

	public static void main(String[] args)
	{

		RegisterAccount reg = new RegisterAccount("Ankita", "George", "anki@123.com", 1234567890, "@@@@", "@@@@");
		System.out.println("Registered using "+reg.getFname()+ " "+reg.getLname()+ " "+ reg.getEmail()+" "
				+reg.getTelno()+" "+reg.getPass()+" "+reg.getConfpass());
		reg.setEmail("ankig@gmail.com");
		reg.setTelno(123445679);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("Registered using "+reg.getFname()+ " "+reg.getLname()+ " "+ reg.getEmail()+" "
				+reg.getTelno()+" "+reg.getPass()+" "+reg.getConfpass());
	}

}
