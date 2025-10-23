package interfaces;

public interface Amazon {
	
	void welcome();// abstract method
	void thankyou();// abstract method
	
	default void serviceCharge() {
		
	int amt=100;
	System.out.println("the service charge is"+amt);
	
}
	static void about() {
		System.out.println("this is a ecommerce website");
		
	}
	

}
