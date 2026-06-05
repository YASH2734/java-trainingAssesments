package day3.IOstreamEx;

import java.io.*;

public class bufferReaderEx {
	  public static void main(String[] args) {
		    // try-with-resources: FileInputStream will be closed automatically
		   try (BufferedReader br = new BufferedReader(new FileReader("filename.txt"))) {
			     String line;
			      while ((line = br.readLine())!= null) {
			        System.out.println(line);
			      }
			    } catch (IOException e) {
			      System.out.println("Error in reading file.");
			    }
			  }
			}