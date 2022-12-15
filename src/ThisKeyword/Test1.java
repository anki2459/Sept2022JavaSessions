package ThisKeyword;

public class Test1 {

	public static void main(String[] args) {

		//Usual method
		AmazonLogin user =new AmazonLogin();
		user.doLogin("anki@gmail.com", "anki123");
		user.doSearch("Macbook Pro");
		user.addToCart("Macbook Pro");
		user.doPayment("anki@icici");
		user.getOrderID();
		user.logOut();
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
		//using this and method chaining
		user.doLogin("anku123@gmail.com", "ank!@3")
			 	.doSearch("Samsung S22 Ultra", 4)
			 		.addToCart("Samsung S22 Ultra")
			 			.doPayment("1234 2345 4567", 456)
			 				.logOut();
	}

}
