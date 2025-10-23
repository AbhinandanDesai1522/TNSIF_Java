package interfaces;

public class PrimeUser implements Amazon {

    @Override
    public void welcome() {
        System.out.println("welcome prime user");
    }

	@Override
	public void thankyou() {
		// TODO Auto-generated method stub
		 System.out.println("Thankyou prime user");
	}
    
}