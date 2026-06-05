package day3.IOstreamEx;

import java.io.*;

public class bufferWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedWriter bW = new BufferedWriter(new FileWriter("filename.txt"))) {
		     bW.write("First line");
		     bW.newLine();
		     bW.write("Next Line");
		     System.out.println("Successfuly loaded data !");
		}catch(IOException e) {
			System.out.println("Error occured in writing");
		}
		     
	 }

  }

