package day2.exceptionHandling;

// Age validation problem
class InvalidAgeException extends Exception {                //constructor
	     
	private static final long serialVersionUID = -7661373170619697078L;

		InvalidAgeException(String msg) {
	
			super(msg);                         //calling super class constructor in exception class
		}
	}
	public class exceptionHandleUseThrows {

		static void validate(int age) throws InvalidAgeException {

			if (age < 18)
				throw new InvalidAgeException("Age must be 18 or above");
		}

		public static void main(String[] args) {

			try {
				validate(15);
			} catch (InvalidAgeException e) {
				System.out.println(e.getMessage());
			}
		}
	}