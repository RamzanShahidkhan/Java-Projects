
import java.io.IOException;

public class ProcessBuilderDemo {

   public static void main(String[] args) throws IOException {

	// Create ProcessBuilder.
	   for(int i=0; i<9; i++){
       ProcessBuilder p = new ProcessBuilder();
	   
       // Use command "notepad.exe" and open the file.
      // p.command("notepad.exe", "F:\\linax.txt");
      // p.command("notepad.exe", "F:\\linuxcommand.txt");
       p.start();
	   
	   }
//      // create a new list of arguments for our process
//      String[] list = {"t", "ui"};
//
//      // create the process builder
//      ProcessBuilder pb = new ProcessBuilder(list);
//      try {
//         // start the subprocess
//         System.out.println("Starting the process..");
//         pb.start();
//      } catch (IOException ex) {
//         ex.printStackTrace();
//      }
   }
}