import java.io.*;

public class SampleWriter {

    public static void main(String args[]) {
        
        File source = new File("Q1.txt");       // set up file to read from
        
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(source));         // Stream to read from source file
           
	    writer.write("This is the first line");
	    writer.newLine();
	    writer.write("Second line");
	    writer.newLine(); 
	    writer.write("Needs one more");
	    writer.newLine();
	    writer.write("Hello World");
	    writer.newLine();

	    writer.close();
        }
        catch (IOException e) {}
    }
}