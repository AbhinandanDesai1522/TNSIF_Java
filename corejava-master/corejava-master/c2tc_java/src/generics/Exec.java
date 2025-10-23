package generics;

public class Exec {
	public static void main(String [] args) {
		GenericProgram<String> obj=new GenericProgram();
		obj.setData("hello");
		System.out.println(" the string obj is "+ obj.getData());
		
		GenericProgram<Integer> iobj=new GenericProgram();
		iobj.setData(22);
		System.out.println(" the int obj is "+ iobj.getData());
	
	}
	

}
