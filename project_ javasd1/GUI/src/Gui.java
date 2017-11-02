import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Gui {
	public Gui()
	{
		constructorGui();
	}

	private void constructorGui()
	{
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("File drawing");
		Mypanel jpCenter=new Mypanel();
		jpCenter.setBackground(Color.YELLOW);
		jpCenter.addMouseListener(new MouseAdapter (){
			private Line currentLine;
		public void mouseClicked(MouseEvent e)
		{
			if(SwingUtilities.isLeftMouseButton(e)){
				if(currentLine==null){
					currentLine=new Line();
					jpCenter.addline(currentLine);
					System.out.println("left click ,for thr 1st time");
				}
				currentLine.addpoint(new Point(e.getX(), e.getY()));
				System.out.println("added point to line " + (jpCenter.getlines().size()));
				jpCenter.repaint();
			}
			if(SwingUtilities.isRightMouseButton(e)){
				if(currentLine != null){
					currentLine = new Line();
					jpCenter.addline(currentLine);
					System.out.println("previous line gone. New line created");
				}
				else
					System.out.println("empty right click, no line yet");
			}
		}
		});
		jf.add(jpCenter, BorderLayout.CENTER); 
		JPanel bottomJPanel = new JPanel();
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				Ignore this try catch statements for the moment. Basically there are only two
//				statements. The one that saves all the lines in the files, and the other which
//				repaints the panel.
				try {
					jpCenter.saveLines(); //
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				jpCenter.repaint();
			}
		});
		JButton loadButton = new JButton("Load");

//		same thing for load button, as explained for the save button above.
		loadButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					jpCenter.loadLines();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				jpCenter.repaint();
			}
		});
		bottomJPanel.add(loadButton);
		bottomJPanel.add(saveButton);
		jf.add(bottomJPanel, BorderLayout.SOUTH);
		jf.setVisible(true);
		jf.setSize(500,300); // Optional to call. It sets the initial display size of the frame
		jf.setResizable(false); // Optional.
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Optional
	}
	public static void main(String[] args){
		new Gui(); // I
	}
}
