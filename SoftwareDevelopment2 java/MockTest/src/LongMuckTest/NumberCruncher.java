package LongMuckTest;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NumberCruncher extends JFrame implements ActionListener {
	JTextField text1, text2 ,text3;		//declare text fields
	JButton button1 ,button2, button3;	                //declare button
	
	public NumberCruncher() {
	    super("Let's Crunch some Numbers");	                //call to JFrame constructor
							//with optional frame title

	    setLayout(new GridLayout(3,2));
		
	    text1 = new JTextField();	//create text field
	    text2 = new JTextField();
	    getContentPane().add(text1);	//add field to frame
	    getContentPane().add(text2);
		
	    button1 = new JButton("ADD");	    //create button with label
	    getContentPane().add(button1);	    //add button to frame
	    button1.addActionListener(this);    //set this object to listen for button clicks
	    
	    button2 =new JButton("Subtract");
	    getContentPane().add(button2);
	    button2.addActionListener(this);
	    
	    button3=new JButton("Multiply");
	    getContentPane().add(button3);
	    button3.addActionListener(this);
	    
	    text3=new JTextField();
	    getContentPane().add(text3);
	    
	    
	    setSize(400,100);	            //set frame size
	    setVisible(true);	            //set frame as being visible
	    //set frame to close properly
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	//implementation of method in ActionListener interface that
	//handles GUI events from user.
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == button1) {             //check source of event
		int firstNumber = Integer.parseInt(text1.getText());    //get first number from user
		int secondNumber = Integer.parseInt(text2.getText());   //get second number from user
		System.out.println("addition is "+ firstNumber + secondNumber);
	    }
		else if(e.getSource()==button2)
		{
			int fNum=Integer.parseInt(text1.getText());
			int lNum=Integer.parseInt(text2.getText());
			int sum= fNum-lNum;
			System.out.println("subtraction is " + sum);
			text3.setText(sum+ "");
			
		}
	    else if(e.getSource()==button3)
	    {
	    	int fNum=Integer.parseInt(text1.getText());
			int lNum=Integer.parseInt(text2.getText());
			int sum= fNum*lNum;
			System.out.println("multiplication is " + sum);
			text3.setText(sum+ "");
	    	
	    }
	    
	}

	//main method for testing that creates instance of this class
	public static void main(String args[]) {
		NumberCruncher c = new NumberCruncher();
	}

}