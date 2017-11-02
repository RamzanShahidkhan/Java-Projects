import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EventHandler extends JFrame implements ActionListener {
	
	
	public EventHandler(){
		JPanel P1 = new JPanel();
		
		JButton B1 = new JButton("OK");
		
		JButton B2 = new JButton("Cancle");
		
		B1.addActionListener(this);
		B2.addActionListener(this);
		
		
		P1.add(B1);
		P1.add(B2);
		add(P1);
		
		setSize(300,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	
	

	public static void main(String[] args) {
		EventHandler EH = new EventHandler();
	}


	@Override
	public void actionPerformed(ActionEvent a) {
		JButton JB = (JButton)a.getSource();
		System.out.println(JB.getText());
	}

}
