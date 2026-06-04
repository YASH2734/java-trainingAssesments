package day3.mapPrograms;
import java.util.*;

/*
 * LinkedHashMap--> stores keys and values, and keeps them in the same order you put them in.
 *  use methods like put() to add key/value pairs, get() to retrieve a value by key, and remove() to delete an entry - all while maintaining insertion order.
 */

public class linkedHashMapEx {
		  public static void main(String[] args) {
		    LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();
		    
		    capitalCities.put("England", "London");
		    capitalCities.put("India", "New Dehli");
		    capitalCities.put("Austria", "Wien");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("Norway", "Oslo"); // Duplicate are ignored here.(key--"Norway")
		    capitalCities.put("USA", "Washington DC");

		    System.out.println(capitalCities);
		  }
		}
