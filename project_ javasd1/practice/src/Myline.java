
import java.awt.Color;
import java.awt.Graphics;
 public class Myline{
	 public int x1;
	 public int y1;
	 public int x2;
	 public int y2;
	 public Color mycolor;
	 public Myline(int x1,int y1,int x2,int y2,Color color)
	 {
		 this.x1=x1;
		 this.y1=y1;
		 this.x2=x2;
		 this.y2=y2;
		 mycolor=color;
		 
	 }
	 public void draw(Graphics g)
	 {
		 g.setColor(mycolor);
		 g.drawLine(x1, y1, x2, y2);
	 }
	
}