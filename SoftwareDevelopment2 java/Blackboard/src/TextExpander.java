import java.io.*;

public class TextExpander {

    public static void main(String args[]) {
        //... Create File objects.
        File source = new File("input.txt");       // set up file to read from
        File destination = new File("output.txt");  // set up file to write into
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(source));         // Stream to read from source file
            BufferedWriter writer = new BufferedWriter(new FileWriter(destination));    // Stream to write to the destination file
            //... Loop as long as there are input lines.
            String line = reader.readLine();    //read first line from source file
            while (line != null) {              //continue until all lines have been read
                writer.write(line); 
                writer.newLine();
                writer.write("XXXX");   //write the text into the destination file
                writer.newLine();               //start a new line in the destination file
                
                line = reader.readLine();       //read next line from source file
            }
            //... Close reader and writer.
            reader.close();  // Close to unlock.
            writer.close();  // Close to unlock and flush to disk.
        }
        catch (IOException e) {
        	
        	
        }
    }
}