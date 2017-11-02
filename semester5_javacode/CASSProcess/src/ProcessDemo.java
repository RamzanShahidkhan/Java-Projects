//public class ProcessDemo {
//
//   public static void main(String[] args) {
//      try {
//         // create a new process
//         System.out.println("Creating Process...");
//         Process p = Runtime.getRuntime().exec("notepad.exe");
//
//         // cause this process to stop until process p is terminated
//         p.waitFor();
//
//         // when you manually close notepad.exe program will continue here
//         System.out.println("Waiting over.");
//      } catch (Exception ex) {
//         ex.printStackTrace();
//      }
//   }
//}
import java.util.ArrayList;
import java.util.List;

public class ProcessDemo {
         

   public static void main(String[] args) {

      // create a new list of arguments for our process
      //List<String> list = new ArrayList<String>();
	   System.out.println("shuruuuuu");
	   List<Integer> l = new ArrayList<Integer>();
      //list.add("notepad.exe");
      for(int i=1; i< 10; i++)
      {
    	  for(int j=2; j<20; j=+2)
    	  {
    		  Pro pp= new Pro(i, j);
    		  l.add(pp.arriaval_Time);
    		  l.add(pp.service_Time);
    	  }
    	  
      }
      // create the process builder
      ProcessBuilder pb = new ProcessBuilder(l.toString());
      
      // get the command list
      System.out.println(""+pb.command());
   }
}