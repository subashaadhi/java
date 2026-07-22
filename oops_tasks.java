package javabasics;

class googlePay {
	
	public void payment () {
		
		System.out.println("Features : Making Payments");
		
	}
}

class verifyUsers extends googlePay {
	
	public void verifyUsers () {
		
		System.out.println("Features: verify users using KYC");
		
	}
}

class sendMoney extends verifyUsers {
	
	public void sendMoney () {
		
		System.out.println("Features: sendMoney without UPI pin upto 5K");
		
	}
}

class Whatsapp {
	
	public void sendmsg () {
		
		
		
		System.out.println("Features : Send Messages");
		
	}
}

class Whatsapp_premium extends Whatsapp {
	
	public void send_hd_vedio () {
		
		
		
		System.out.println("Features: Send HD vedios");
		System.out.println();
	}
}

class Swiggy {
	String customerName;
	String hotelName;
	String foodItem;
	int amount;
	
	public Swiggy (String customerName , String hotelName , String foodItem, int amount) {
		
		this.customerName = customerName;
		this.hotelName = hotelName;
		this.foodItem = foodItem;
		this.amount = amount;
	}
	
	public void foodorder () {
		System.out.println("---Food Ordering Details---");
		System.out.println();
		System.out.println("Customer name: "+customerName);
		System.out.println("Hotel name   : "+hotelName);
		System.out.println("Food Item    : "+ foodItem);
		System.out.println("Amount       : "+amount);
		System.out.println();
	}
}
class Amazon {
	
	String productName;
	int price;
	double rating;
	
	public Amazon (String productName, int price, double rating){
		
		this.productName = productName;
		this.price = price;
		this.rating = rating;
	}
	
	public void show () {
		System.out.println("---Amazon Product---"); 
		System.out.println();
		System.out.println("PRODUCT NAME: " + productName);
		System.out.println("PRICE       : " + price);
		System.out.println("RATING      : " +rating + "/10");
		System.out.println();
		
	}
}

class InstaProfile {
	
	String username;
	int followers;
	int following;
	
	public InstaProfile (String un,int flrs, int flng) {
		this.username = un;
		this.followers = flrs;
		this.following = flng;
		
	}
	
	public void display () {
		System.out.println("---Instagram Profile---");
		System.out.println();
		System.out.println("Username : " + username); 
		System.out.println("Followers: " + followers);
		System.out.println("Following: " + following);
		System.out.println();
		
	}
	
}

class Chat {
	
	String sender;
	String receiver;
	String msg;
	
	public Chat (String sd , String rc ,String mesg) {
		this.sender = sd;
		this.receiver = rc;
		this.msg  = mesg;
	}
	
	public void sendMessage () {
		System.out.println("    ---Chat---");
		System.out.println();
		System.out.println("Sender   : " + sender);
		System.out.println("Receiver : " + receiver);
		System.out.println("Message  : " + msg);
		System.out.println();
	}
} 

class WhatsappUser {
	
	String name;
	String phoneNumber;
	String about;
	String lastSeen;
	
	public  WhatsappUser (String n, String  pN, String ab,String ls) {
		
		this.name = n;
		this.phoneNumber = pN;
		this.about = ab;
		this.lastSeen = ls;
	
	}
	
	public void display () {
		 System.out.println("---User Profile---");
		 System.out.println();
		 System.out.println("Name      : " + name);
		 System.out.println("Phone     : " + phoneNumber);
		 System.out.println("About     : " + about);
		 System.out.println("Last Seen : " + lastSeen);
		 System.out.println();
	}
}

public class oops_tasks {

	
	
	public static void main (String [] args ) {
		
		
//		1. WhatsApp User Profile
//		Task: Create class WhatsAppUser with name, phoneNumber, about, lastSeen. Create two objects and display profile

		
		WhatsappUser user = new WhatsappUser ("Subash", "8940403984","available", "justnow");
		WhatsappUser user1 = new WhatsappUser ("Ramesh", "494959330", "busy", "3:00 pm");
		
		user.display();
		user1.display();
		
		
		
//		2. WhatsApp Chat
//		Task: Create Chat class with sender, receiver, message. Method: sendMessage().

		
		Chat chat1 = new Chat("Subash", "Rhamani", "Hi! I'm Subash, how are you?");
		chat1.sendMessage();
		
		
//		3. Instagram Profile
//		Task: Use constructor to initialize username, followers, following.

		
		InstaProfile profile = new InstaProfile ("rawsstoicc.arc", 223, 333);
		profile.display();
		
//		4. Amazon Product
//		Task: Constructor: productName, price, rating.
		
		Amazon product = new Amazon ("Laptop", 49999, 8.5);
		product.show();
		
//		5. Swiggy Food Order
//		Task: Constructor: customerName, hotelName, foodItem, amount.

		Swiggy order1 = new Swiggy ("Subash","Salem VS Biryani", "Biryani with Tandoori", 399);
		order1.foodorder();
		
		
//		6. WhatsApp Premium
//		Task: Single Inheritance: WhatsApp->WhatsAppPremium with sendMessage(), sendHDVideo().

		System.out.println("   ---Whatsapp--- ");
		Whatsapp feature = new Whatsapp ();
		feature.sendmsg();
		System.out.println();
		
		System.out.println("---Whatsapp Premium---");
		Whatsapp_premium feature1 = new Whatsapp_premium();
		feature1.sendmsg();
		feature1.send_hd_vedio();
		
//		7. Google Pay
//		Task: Payment->GooglePay with verifyUser(), sendMoney().

		System.out.println("    ---Google pay---");
		
		googlePay uses = new googlePay ();
		uses.payment();
		System.out.println();
		
		System.out.println("---Gpay with User verify---");
		
		verifyUsers uses1 = new verifyUsers ();
		uses1.payment();
		uses1.verifyUsers();
		System.out.println();
		
		System.out.println("---Gpay without UPI pin");
		sendMoney uses2 = new sendMoney ();
		uses2.payment();
		uses2.verifyUsers();
		uses2.sendMoney();
		System.out.println();
		
		
		
	}
	}


	
	


