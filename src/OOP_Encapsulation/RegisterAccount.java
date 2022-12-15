package OOP_Encapsulation;

public class RegisterAccount 
{
	private String fname;
	private String lname;
	private String email;
	private long telno;
	private String pass;
	private String confpass;
	public RegisterAccount(String fname, String lname, String email, long telno, String pass, String confpass) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.telno = telno;
		this.pass = pass;
		this.confpass = confpass;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getTelno() {
		return telno;
	}
	public void setTelno(long telno) {
		this.telno = telno;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getConfpass() {
		return confpass;
	}
	public void setConfpass(String confpass) {
		this.confpass = confpass;
	}

	
}
