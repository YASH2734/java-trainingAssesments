package day1.oppsConcepts;

public abstract class abstract {
    
	// non-abstract or concreate method
	void set() {
    	System.out.println("not Using abstract keyword");
    }
    //abstract method
   abstract void show();       //act as super class.
	
}

public class AbstractEx extends abstract{
	@Override
	void show() {
		System.out.println("ccc");
	}

public static void main(String args[]) {
	AbstractEx tab=new AbstractEx();
	tab.set();
	tab.show();
}
}