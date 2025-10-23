package c2tc_java;
import java.util.Scanner;

public class UserName 
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name:");
		String n=input.nextLine();
		System.out.println("Hello"+n);
		
		Scanner ob=new Scanner(System.in);
		int rollNo=ob.nextInt();
		System.out.println("the rollno"+" "+rollNo); 
        boolean c=ob.hasNext();
        System.out.println("is it an integer"+" "+c);
		
	}

}
