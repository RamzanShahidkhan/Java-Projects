import javax.swing.JOptionPane;

public class Addition {
	public static void main (String [] args)
	{
		String firstnumber= JOptionPane.showInputDialog("enter firstnumber");
		String secondnumber= JOptionPane.showInputDialog("enter 2nd number");
		int num1=Integer.parseInt(firstnumber);
		int num2=Integer.parseInt(secondnumber);
		int sum=num1+num2;
		JOptionPane.showMessageDialog(null, "sum is " + sum,
				"sum of two integers",JOptionPane.PLAIN_MESSAGE);
		
	}

}
