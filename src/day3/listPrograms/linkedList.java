package day3.listPrograms;

import java.util.LinkedList;

/* The LinkedList stores its elements in "containers." The list has a link to the first container and each container has a link to the next container in the list.
 * To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.
 * 
 * Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
 * */



public class linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList<String> lst=new LinkedList<String>();
      lst.add("USA");
      lst.add("UK");
      lst.add("Paris");
      lst.add("England");
      System.out.println("Travaled Countries-->"+lst);
	}

}
