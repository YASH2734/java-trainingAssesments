package day6.Interface;

public class Person implements School ,Collage{
     public void set(String u,String s) {
    	 
    	 System.out.println("Person Name: "+u);
    	 System.out.println("Year of Collage: "+s);
     } void show() {
    	 System.out.println("City : "+city);
     }
     
	public static void main(String[] args) {

    	 Person p1=new Person();
    	 p1.set("Yash", "Fourth");
    	 p1.show();
	}

}
