import java.util.Scanner;
/**
 * 
 * @author Shahidkhan
 *
 */
public class ff {
	
		public static void main(String[] args) {
			

			
		    Scanner input = new Scanner(System.in);
		    System.out.println("enter no");
		
		    String answer = input.nextLine();
		     String an = "yes";
		     String ab = "no";

		    if(answer.matches(an))
              {
		        System.out.println("Yea I programmed this right!");
		    }
		    else if(answer.matches(ab))
            {
		        System.out.println("Yeanii na yar!");
		    }
		    else{
		        System.out.println("Awww :(");
		    }
		  }
		}


