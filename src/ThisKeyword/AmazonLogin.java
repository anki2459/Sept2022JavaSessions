package ThisKeyword;

public class AmazonLogin {
	
	public AmazonLogin doLogin()
	{
		System.out.println("Logged in to Amazon");
		return this;
	}
	public AmazonLogin doLogin(String un,String pwd)
	{
		System.out.println("Logged in to Amazon: "+un +":"+pwd);
		return this;
	}
	public AmazonLogin doSearch(String productName) {
		System.out.println("Searching for Product: "+productName);
		return this;
	}
	public AmazonLogin doSearch(String productName,int rating) {
		System.out.println("Searching for Product: "+productName + ":"+rating);
		return this;
	}
	public AmazonLogin addToCart(String productName) {
		System.out.println("Add to cart Product: "+productName);
		return this;
	}
	public AmazonLogin doPayment(String upi) {
		System.out.println("PAyemnt done using: "+upi);
		return this;
	}
	public AmazonLogin doPayment(String cc,int cvv) {
		System.out.println("PAyemnt done using: "+cc +":"+cvv);
		return this;
	}
	public AmazonLogin getOrderID(){
		System.out.println("The OrderID is: "+123456);
		return this;
	}
	public AmazonLogin logOut() {
		System.out.println("You have logged out");
		return this;
	}

}
