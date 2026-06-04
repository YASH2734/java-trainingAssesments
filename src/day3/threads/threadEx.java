package day3.threads;

/*class democlass extends Thread{          //Thread-->in built class.
	public void run() {
		System.out.println("Thread is running...");
	}
}*/

class runableEx implements Runnable{          //Runnable-->Interface
	public void run() {
		System.out.println("Thread is running...");
	}
}

public class threadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runableEx runn= new runableEx();
		Thread t1 =new Thread(runn);
        t1.start();
	}

}
