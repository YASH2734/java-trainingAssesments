package day2.listPrograms;

import java.util.ArrayList;
import java.util.List;

public class retriveElementsByindex {
	 public static void main(String args[]) {
  	   List<Integer> list=new ArrayList<>();
  	   list.add(11);
  	   list.add(12);
  	   list.add(13);
  	   list.add(14);
  	   list.add(15);
  	   System.out.println("Second postion Num:"+list.get(1));
  	 System.out.println("last postion Num:"+list.get(4));
   }
}
