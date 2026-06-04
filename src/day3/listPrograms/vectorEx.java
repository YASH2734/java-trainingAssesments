package day3.listPrograms;

import java.util.List;
import java.util.Vector;

/*
 * Maintains Insertion order and allows Duplicates and Null values. 
 * Thread Safe-->All methods are Synchronized for safe Multi-threaded access. 
 */
public class vectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> list=new Vector<>();
        list.add("USA");
        list.add("UK");
        list.add("Paris");
        list.add("England");
        list.add("UK");
        list.add(null);
        System.out.println("Travaled Countries-->"+list);
  	}
        
	}

