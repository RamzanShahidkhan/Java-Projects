import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Hello {
	public static void main(String args[] ) throws Exception {
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello Ramzan enter name");
        // read the name from the input 
        String line = br.readLine();
      
        // print the name
        System.out.println("Hello "+ line);
        Scanner input = new Scanner(System.in);
        System.out.println("enter again");
        String name=input.next();
        System.out.println(name);
        
        
        //
        
    }

}
