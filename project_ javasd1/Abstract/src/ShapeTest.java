import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ShapeTest {
	public static void main(String [] args) throws FileNotFoundException
	{   
		//String input=sc.nextLine();
		//Scanner s = new Scanner(input).useDelimiter(",");
		ArrayList<Shape> shapes= new ArrayList();
		File f=new File("readfile.txt");
		Scanner reader= new Scanner(f);
	      while (reader.hasNext()) {
	          String line = reader.nextLine();
	          //line.trim();
	          String[] data = line.trim().split(",");
	          System.out.println(line);
	          if(data[0].trim().equals("c"))
	          {
	        	  Circle c=new Circle(Double.parseDouble(data[1].trim()));
	        	  shapes.add(c);
	        	//  System.out.println("circle area " + c.getArea());
	        	//  System.out.println("circle perimeter " + c.getPerimeter());
	          }
	          else if(data[0].trim().equals("r"))
	          {  
	        	  Rectangle r=null;
	        	  if(data.length==3){
	        		  
	        	  
	        	  r = new Rectangle(Double.parseDouble(data[1].trim()),Double.parseDouble(data[2].trim()));
	        	  }
	        	  else if(data.length==2)
	        	  {
	        		   r= new Rectangle(Double.parseDouble(data[1].trim()));
	        	  }
	        	  shapes.add(r);
	        	 // System.out.println("Rectangle area " + r.getArea());
	        	 // System.out.println("Rectangle perimeter " + r.getPerimeter());
	         }
	          else if(data[0].trim().equals("t"))
	          {   Triangle t =null;
	        	  if(data.length==2)
	        	  t = new Triangle(Double.parseDouble(data[1].trim()));
	        	  else if(data.length==3)
	        	  
	        		  t=new Triangle(Double.parseDouble(data[1].trim()),Double.parseDouble(data[2].trim()));
	        	     
	        	  shapes.add(t);
	        	//  System.out.println("Rectangle area " + t.getArea());
	        	//  System.out.println("Rectangle perimeter  " + t.getPerimeter());
	          }
	     }
		 PrintWriter writer =new PrintWriter( new File("output.txt"));
		 int x=0;
		 for(Shape s:shapes)
		 {
			 writer.print(shapes.get(x).getArea() +","+shapes.get(x).getPerimeter());
			 x++;
		 }
		 writer.close();
				 
				
	
		
	}

}
