package Chapter18;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WindowaListenerDemo  extends JFrame{
	
	private class CheckOnExit extends WindowAdapter 
	{
		@Override
		public void windowClosing(WindowEvent e) 
		{
			ConfirmWindow ch=new ConfirmWindow();
			ch.setVisible(true);
			
		}
//	@Override
//	public void windowActivated(WindowEvent arg0) 
//	{}
//
//	@Override
//	public void windowClosed(WindowEvent arg0) 
//	{}
//	@Override
//	public void windowDeactivated(WindowEvent arg0)
//	{}
//	@Override
//	public void windowDeiconified(WindowEvent arg0) 
//	{}
//	@Override
//	public void windowIconified(WindowEvent arg0) 
//	{}
//
//	@Override
//	public void windowOpened(WindowEvent arg0) 
//	{ }
}
	private class ConfirmWindow extends JFrame implements ActionListener
	{
		 public ConfirmWindow()
		 {
			 setSize(200,100);
			 getContentPane().setBackground(Color.yellow);
			 setLayout(new BorderLayout());
			 JLabel jl=new JLabel("are you sure you want to exit");
			 add(jl, BorderLayout.CENTER);
			 JPanel butp=new JPanel();
			 butp.setBackground(Color.orange);
			 butp.setLayout(new FlowLayout());
			 JButton exit=new JButton("Yes");
			 exit.addActionListener(this);
			 butp.add(exit);
			 JButton cancel=new JButton("No");
			 cancel.addActionListener(this);
			 butp.add(cancel);
			 
			 add(butp, BorderLayout.SOUTH);
			
		}
		@Override
		public void actionPerformed(ActionEvent a) 
		{
			String s=a.getActionCommand();
			if(s.equals("Yes"))
				System.exit(0);
			else if(s.equals("No"))
				dispose();
			else
				System.out.println("error jani o");
		}
	}
    
	public static void main(String[] args) {
		WindowaListenerDemo w=new WindowaListenerDemo();
		w.setVisible(true);
	}
	public WindowaListenerDemo()
	{
		setSize(300,300);
		setTitle("window listener demo");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new CheckOnExit());
		getContentPane().setBackground(Color.LIGHT_GRAY);
		JLabel l=new JLabel("i like to be sure you are sincere");
		add(l);
	}

}

