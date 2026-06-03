package day1;

import java.util.Scanner;

public class evenAndOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
        int a=sc.nextInt();
        
        if(a%2==0) {
        	System.out.println("a is even");
        }else {
        	System.out.println("a is odd");
        }
	}

}
