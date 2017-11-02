package  dildar;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	ArrayList<Shape> shapes = new ArrayList<>();

	public void readFile() throws FileNotFoundException{
		Scanner reader = new Scanner(new File("inputfile.txt"));
		String line = null;
		String[] tokens = null;

		while(reader.hasNextLine()){
			line = reader.nextLine();
			tokens = line.trim().split(",");
			if(tokens[0].trim().equals("c")){
				shapes.add(new Circle(Double.parseDouble(tokens[1].trim())));
			}
			if(tokens[0].trim().equals("r")){
				if(tokens.length == 3)
					shapes.add(new Rectangle(Double.parseDouble(tokens[1].trim()), Double.parseDouble(tokens[2].trim())));
				if(tokens.length == 2)
					shapes.add(new Rectangle(Double.parseDouble(tokens[1].trim())));
			}
			if(tokens[0].trim().equals("t")){
				if(tokens.length == 3)
					shapes.add(new Triangle(Double.parseDouble(tokens[1].trim()), Double.parseDouble(tokens[2].trim())));
				if(tokens.length == 2)
					shapes.add(new Triangle(Double.parseDouble(tokens[1].trim())));
			}
		}
		reader.close();
	}

	public void writeFile() throws FileNotFoundException{

		PrintWriter writer = new PrintWriter(new File("ShapesOutput.csv"));
		writer.println("Shape Type,Length1,Length2,Perimeter,Area");
		for(Shape s : shapes){
			writer.println(s);
		}
		writer.close();
	}

	public static void main(String[] args) throws FileNotFoundException {

		MainClass driver = new MainClass();
		driver.readFile();
		driver.writeFile();
	}
}
