import javax.swing.JFrame;
public class Testdraw {
	public static void main(String [] args)
	{
		

	Drawpanel panel=new Drawpanel();
	JFrame jf= new JFrame();

	jf.add(panel);
	jf.setVisible(true);
	jf.setSize(300,300);
	jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	//jf.setResizeable();
	}

}
