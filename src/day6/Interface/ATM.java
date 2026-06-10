package day6.Interface;

public class ATM {
	private int pin;
	private String Uname;
	private double amount;
	
	
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getPin() {
		return pin;
	}
	public int setPin(int pin) {
		return this.pin = pin;
	}
	
	public static void main(String args[]) {
		ATM mycard=new ATM();
		mycard.setUname("Yash");
		mycard.setAmount(1000);
		mycard.setPin(121);
		
		System.out.println("Account Holder :"+mycard.getUname());
		System.out.println("Amount  :"+mycard.getAmount());
		System.out.println("Accout pin :"+mycard.getPin());
	}

}
