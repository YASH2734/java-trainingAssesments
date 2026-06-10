
package day2.exceptionHandling;

public class exceptionHandlling {
        // demo example of Try-Catch and finally block
	
	public static void main(String[] args) {
	
     try {                             //risk code
		int a=2;
        int b=0;
        System.out.println(a/b);
	 }catch(ArithmeticException e) {   //Handle exception
		System.out.println("Cann't divided by zero !");  
	 }
      catch(ClassCastException e) {
    	System.out.println("Cast exception !");
     }    
        finally {                     //block that always executes
     
        	System.out.println("finally blockexecuted");
        
        }
     
	}
}

