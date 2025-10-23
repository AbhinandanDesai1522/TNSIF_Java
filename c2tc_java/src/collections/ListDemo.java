package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListDemo {
	public static void main(String[] args) {
		List  ob=new ArrayList<>();
		ob.add(4);
		ob.add(6);
		ob.add("abc");
		ob.add(null);
		
		System.out.println(ob);
	
		boolean c=ob.contains(4);
		System.out.println(c);
		boolean d=ob.isEmpty();
		System.out.println(d);
		
		List<String>s=new ArrayList<>();
		s.add("bang");
		s.add("mysore");
		s.add("delhi");
		System.out.println(s);
		Collections.sort(s);
		System.out.println(s);
		
		Iterator<String> li=s.iterator();
		   while(li.hasNext()) {
			   String nm=li.next();
			   System.out.println(nm);
			   
		   }
		
		
		
		
	}

}
