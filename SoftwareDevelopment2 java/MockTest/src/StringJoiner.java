import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StringJoiner extends JFrame implements ActionListener {
	JTextField input1, input2;		//declare text fields
		
	public StringJoiner() {
	    super("String Joiner");	                //call to JFrame constructor

	    setLayout(new GridLayout(2,3));
		
	    input1 = new JTextField();	//create text field
	    input2 = new JTextField();
	    getContentPane().add(input1);	//add field to frame
	    getContentPane().add(input2);
	    JButton button=new JButton("Join");
	    getContentPane().add(button);
	    button.addActionListener(this);
		
	    setSize(400,100);	            //set frame size
	    setVisible(true);	            //set frame as being visible
	    //set frame to close properly
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//implementation of method in ActionListener interface that
	//handles GUI events from user.
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		System.out.println(input1.getText() + input2.getText());
	}

	//main method for testing that creates instance of this class
	public static void main(String args[]) {
		StringJoiner c = new StringJoiner();
	}

}