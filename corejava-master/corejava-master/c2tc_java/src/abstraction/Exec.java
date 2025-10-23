package abstraction;

public class Exec {
     public static void main(String[] args) {
    	// AbstractDemo d=new AbstractDemo();//we cannot create an object
    	AbstractDemo d;
    	d=new Square (0.2f);
    	d.calculate();
    	d.display();
    	d=new Circle(0.1f);
    	d.calculate();
    	d.display();
     }
}
