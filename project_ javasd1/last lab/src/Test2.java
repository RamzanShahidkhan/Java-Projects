import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2 {
	
		public void readFile() throws FileNotFoundException
		{
				Scanner reader=new Scanner(new File("chachu.txt"));
				String line =null;
				String[] token =null;
				while(reader.hasNextLine())
				{
					reader.nextLine();
					token=line.split(",");
					Triangle1 T=new Triangle1(Double.parseDouble(token[0].trim()),
							Double.parseDouble(token[1].trim()),
							Double.parseDouble(token[2].trim()));
				}
				reader.close();
		
		}
		public static void main(String [] args) throws FileNotFoundException
		{
			Test2 t=new Test2();
			t.readFile();
			
//		Triangle1 T=new Triangle1(4, 12);
//		System.out.println(T.Hypotenuse());
//		System.out.println(T.sum());
//		System.out.println(T.compete());
		}
	

}
