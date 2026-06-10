package day1.Interface;

public class Employee implements company{
	double salary() {
		System.out.println("salary is:");	
	    return 10000;
	}
}

public interface company {   
	String cn="Cogni";
	void show();
}
