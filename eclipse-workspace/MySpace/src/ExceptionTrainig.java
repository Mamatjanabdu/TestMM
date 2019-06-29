import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExceptionTrainig {
    
	Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String word = inp.nextLine();
    //write your code below
    String newWord="";
   
    for(int i=0; i<word.length; i++){
      if ( (word.charAt(i)=='a')||(word.charAt(i)=='e')||(word.charAt(i)=='i')
      ||(word.charAt(i)=='o')||(word.charAt(i)=='u') ){
      newWord+=word.charAt(i);
      System.out.println(newWord);
    }
   
  }

