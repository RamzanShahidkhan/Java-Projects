import java.util.Scanner;

public class MY_Game {
public static void main(String args []){
	int a=1, b=2, c=3;
//	  String y = "yes";
//	  String n= "No" ;
	
	
	Scanner input =  new Scanner (System.in);
	String answer = input.nextLine();
	
  
  if(input.nextInt()==a){
	  System.out.println("My name is Hassaan");
	  System.out.println("Do u wanna proceed ..");
  }
  if (answer=="yes"){
	  System.out.println("What is second person u wanna ask...");
  }
//   if (input.nextLine()==y){
//	  System.out.println("What is second person u wanna ask...");
 // }
//   else if(input.nextLine()== n){
//	  System.exit(0);
//	 
//  }
  if(input.nextInt()==b){
	  System.out.println("My name is malik");
  }
	  if(input.nextInt()==3){
		  System.exit(0);
	  }
	  
  }
	
}