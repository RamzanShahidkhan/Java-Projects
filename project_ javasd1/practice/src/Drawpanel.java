import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
public class Drawpanel extends JPanel {
	private Random randomnum=new Random();
	private Myline[] lines;
 public Drawpanel()
 {
	 setBackground(Color.white);
	 lines =new Myline[1+ randomnum.nextInt(5)];
 
 for(int i=0; i<lines.length; i++)
 {
	 int x1=randomnum.nextInt(300);
	 int y1=randomnum.nextInt(300);
	 int x2=randomnum.nextInt(300);
	 int y2=randomnum.nextInt(300);
	 Color color=new Color(randomnum.nextInt(256),randomnum.nextInt(256),randomnum.nextInt(256),
			 randomnum.nextInt(256));
	 lines[i]= new Myline(x1,y1,x2,y2,color);
	
 }
 }
 public void paintComponent(Graphics g)
 {
	 super.paintComponent(g);
	 for(Myline line:lines)
	 {
		 line.draw(g);
	 }
 }
 
}
