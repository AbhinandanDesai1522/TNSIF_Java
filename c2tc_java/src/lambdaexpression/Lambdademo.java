package lambdaexpression;

public class Lambdademo {
	public static void main(String[] args) {
		Message m=() ->{return "hello";};
		System.out.println(m.Greet());
		
	}

}
