package day1.oppsConcepts;

abstract class BankEx {
    abstract double rate(); 
}
class SBI extends BankAbstract{
	 double rate(){
		   System.out.println("Rate of Interest: ");
		   return 8;
	}
}
class PLB extends BankAbstract{
	 double rate() {
		System.out.println("Rate of Interest: ");
		return 9;
	}
}
class ICICI extends BankAbstract{
     double rate() {
		System.out.println("Rate of Interest: ");
		return 10;
	}
}
public class BankAbstract{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SBI sbi=new SBI();
       PLB plb=new PLB();
       ICICI icic=new ICICI();
       System.out.println(sbi.rate());
       System.out.println(plb.rate());       
       System.out.print(icic.rate());
	}

}
