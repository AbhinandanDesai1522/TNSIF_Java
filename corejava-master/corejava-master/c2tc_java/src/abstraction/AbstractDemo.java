package abstraction;

public abstract class AbstractDemo {
	protected float area;

	abstract void calculate ();
	
	void display() {
		System.out.println("area of the given polynomial:"+area);
   }
	
}
