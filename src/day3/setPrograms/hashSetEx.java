package day3.setPrograms;

import java.util.*;
/* 
 * SET--> 1.Is used to store a collection of unique elements.
 *        2.Set does not allow duplicates, and it does not preserve the order of elements.(unless you're using TreeSet or LinkedHashSet).
 * A HashSet is a collection of elements where every element is unique. 
 */

public class hashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<>();
 	   set.add("Delhi");
 	   set.add("Delhi");
 	   set.add("Mumbai");
 	   set.add("Kolhapur");
 	   set.add("Delhi");
 	   set.add("kanss");
 	   set.add(null);
  	 System.out.println(set);
	}

}
