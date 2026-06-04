package day3;
import java.util.*;

/*
 * A LinkedHashSet-->stores unique elements and remembers the order they were added.
 */

public class linkedHashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new LinkedHashSet<>();
	 	   set.add(2);
	 	   set.add(3);
	 	   set.add(4);
	 	   set.add(1);
	 	   set.add(2);
	 	   set.add(null);
	  	 System.out.println(set);
	}

}
