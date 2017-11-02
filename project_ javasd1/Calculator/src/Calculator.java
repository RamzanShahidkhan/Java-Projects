import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Spliterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculator {
	private JFrame F = new JFrame("Calculatorrr");
	private JPanel panel = new JPanel();
	private JTextField textfield;
	private JButton[] bar;
	private String [] button;
	private JPanel buttonPanel = new JPanel();
	private double a1,a2;
	private double result;
	private String operation;
	
	public Calculator()
	{
		F.setLayout(new GridLayout(1,1));
		textfield = new JTextField(20);
		textfield.setEditable(false);
		panel.setLayout(new BorderLayout());
		panel.add(textfield, BorderLayout.NORTH);
		
		buttonPanel.setLayout(new GridLayout(4,3));
		bar= new JButton[16];
		String [] button={"1","2","3","4","5","6","7","8","9","0",".","/","+","-","*","="};
	
			for(int i=0; i<button.length;i++)
				{
					bar[i]= new JButton(button[i]);
					buttonPanel.add(bar[i]);
					bar[i].addActionListener(new ActionListener(){
						@Override
						public void actionPerformed(ActionEvent e){
							JButton source= (JButton)e.getSource();
							//Object source=e.getSource();
							for(int a=0;a<bar.length-5;a++)
							{
								if(source==bar[a])
								   {
									textfield.setText(button[a]);
									
								    }
							}
							
							if( source.getText()=="+")
							{
								 a1=Double.parseDouble(textfield.getText());			
								    textfield.setText(String.valueOf(a1));
								    textfield.setText("");
								    //textfield.setText("+");
								    operation="+";
									System.out.println(a1);   
							}
							if( source.getText()=="-")
							{
								 a1=Double.parseDouble(textfield.getText());			
								    textfield.setText(String.valueOf(a1));
								    textfield.setText("");
								   // textfield.setText("-");
								    operation="-";
									System.out.println(a1);   
							}
							if( source.getText()=="/")
							{
								 a1=Double.parseDouble(textfield.getText());			
								    textfield.setText(String.valueOf(a1));
								    textfield.setText("");
								   // textfield.setText("/");
								    operation="/";
									System.out.println(a1);   
							}
							if( source.getText()=="*")
							{
								 a1=Double.parseDouble(textfield.getText());			
								    textfield.setText(String.valueOf(a1));
								    textfield.setText("");
								    //textfield.setText("*");
								    operation="*";
									System.out.println(a1);   
							}
							
							
							if(source.getText()=="=")
							 { 
										String answer;
										a2=Double.parseDouble(textfield.getText());
									switch(operation)
									{
									  case "+":
										result=a1+a2;
										answer=String.format("%.1f", result);
										textfield.setText(answer);
										System.out.println(answer);	
										break;
									 case "-":
										result=a1-a2;
										answer=String.format("%.1f", result);
										textfield.setText(answer);
										System.out.println(answer);	
										break;
									 case "/":
										result=a1/a2;
										answer=String.format("%.1f", result);
										textfield.setText(answer);
										System.out.println(answer);	
										break;
									 case "*":
										result=a1*a2;
										answer=String.format("%.1f", result);
										textfield.setText(answer);
										System.out.println(answer);	
										break;
										default :
											System.out.println("you are chabal");
							
							       }
							}
							 }
							
							 
							}
							
					
					
					);
						
				}
			
		panel.add(buttonPanel,BorderLayout.CENTER);
		F.add(panel);
		F.setSize(400,400);
		F.setVisible(true);
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{ 
		Calculator cc=new Calculator();
	}
	
	
	

}

