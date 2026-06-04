package day3;
import java.util.*;

/*
 * The Map interface is part of the Java Collections Framework and is used to store key-value pairs. 
 * Each key must be unique, but values can be duplicated.
 * Map is useful when you want to associate a key (like a name or ID) with a value (like an age or description).
 * 
 * HASHMAP-->A HashMap stores items in key/value pairs, where each key maps to a specific value.
 * A HashMap can store many different combinations, such as:
                                              -String keys and Integer values
                                              -String keys and String values
 */
public class mapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<Integer,String> map=new HashMap<>();       
      map.put(1, " Mincraft");
      map.put(2, " GTA-V");
      map.put(3, " Teris");
      map.put(4, " Fortunit");
      System.out.println("Game Ranking data-->"+map);
	}

}
