import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JPanel;

public class Mypanel extends JPanel
{
	ArrayList<Line> lines=new ArrayList<>();
public void addline(Line line)
{
	lines.add(line);
}
 public ArrayList<Line> getlines()
 {
	return lines;
 }
 public void PaintComponent(Graphics g)
 {
	super.paintComponent(g);
	Point p1;
	for(Line l:lines)
	{
		p1=l.getPoints().get(0);
		for(Point p2:l.getPoints())
		{
			g.drawLine(p1.getx(),p1.gety(),p2.getx(), p2.gety());
			p1=p2;
		}
		
	}
		
	
 }
 public void saveLines() throws FileNotFoundException 
 {
	String line=""; 
	PrintWriter writer=new PrintWriter(new File("lines.txt"));
	for(Line l:lines)
	{
		for(Point p:l.getPoints()){
			line=line +p.getx()+ " ,"+p.gety()+",";
		}
		if(line.length()>0)
			line=line.substring(0, line.length()-1);
			System.out.println("writing:" + line);
			writer.println(line);
			line="";
		
	}
	writer.close();
	lines.clear();
	
 }
 public void loadLines() throws FileNotFoundException
  {
	 lines.clear();
	 Scanner reader=new Scanner (new File("lines.txt"));
	 while(reader.hasNextLine())
	 {
		 String linedata=reader.nextLine();
		 Line line= new Line();
		 String[] coords=linedata.split(",");
		 for(int i=0; i<coords.length;i=+2)
		 {
			 line.addpoint(new Point(Integer.parseInt(coords[i]),Integer.parseInt(coords[i+1])));
		 }
		 lines.add(line);
	 }
	 reader.close();
  }
	 
	 
	 
 }


