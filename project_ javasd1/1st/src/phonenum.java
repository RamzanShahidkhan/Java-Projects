
import java.util.Scanner;

public class phonenum
 {
 // execute application
 @SuppressWarnings("resource")
public static void main( String[] args )
 {
 // get sentence
 Scanner scanner = new Scanner( System.in ); 
 System.out.println( "Enter a sentence !" );
 String sentence = scanner.nextLine();

 // process user sentence
 String[] tokens= sentence.split( "-" );
 System.out.printf("area code is   ");
 System.out.println(tokens[0]);
 System.out.printf("phone number is  ");
 System.out.println(tokens[1]+tokens[2]);
 
 //for ( String token : tokens )
//System.out.println( token );

 } // end main
 } // end class TokenTest