package package2;

import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Print true if the string "cat" and "dog" appear the same number of times
//		in the given string word. 
//	   Scanner scan= new Scanner(System.in);

		boolean exists = false;
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

       int indexOf=word.indexOf("java");
       
		   boolean b=true;

		   if (indexOf==0 || indexOf==1){
		     b=true;
		   }else{
		     b=false;
		   }
		   System.out.println(b);

	}

}
