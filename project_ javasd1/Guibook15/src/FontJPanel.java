import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class FontJPanel extends JPanel {
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setFont(new Font("Serif",Font.BOLD,28));
		g.drawString("Serif 22 point bold. " , 30, 30);
		
		g.setFont(new Font("Monospaced",Font.ITALIC,24));
		g.drawString("Monospaced 24 point italic", 20, 60);
		
		g.setFont(new Font ("SansSerif",Font.PLAIN,34));
		g.drawString("SansSpaced 34 point plain", 20, 100);
		
		g.setColor(Color.RED);
		g.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,28));
		g.drawString(g.getFont().getName()+" "+g.getFont().getSize()+" point bold italic.",20,140);
		
	}
	

	public static void main(String[] args) {
		JFrame frame=new JFrame("Font display..");
		FontJPanel panel=new FontJPanel();
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,350);
		frame.setVisible(true);

	}

}
