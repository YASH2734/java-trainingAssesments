package day2;

// Age validation problem
class InvalidAgeException extends Exception {                //constructor
	     
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