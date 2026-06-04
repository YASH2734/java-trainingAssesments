package day3;
import java.util.*;

/*
 * A TreeSet is a collection that stores unique elements in sorted order.
 * Here can not catch or order the "null" value.
 * also Duplicates like "2" will only appear once.
 * */
public class treeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeSet<Integer> treeset=new TreeSet<Integer>();
       treeset.add(23);
       treeset.add(2);
       treeset.add(43);
       treeset.add(3);
       treeset.add(20);
       treeset.add(2);
     /* treeset.add(null);*/
       
       System.out.println("Returns-->"+treeset);
	}

}
