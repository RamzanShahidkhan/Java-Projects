import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonChange extends JFrame implements ActionListener {
	JButton jb1;
	JButton jb2;
	public ButtonChange()
	{
        super("button exchange");
       // setLayout(new BorderLayout());
        JPanel p=new JPanel();
        p.setLayout(new GridLayout(1,2));
         jb1=new JButton("1");
         jb2=new JButton("");
         jb2.setEnabled(false);
         jb1.addActionListener(this);
         jb2.addActionListener(this);
         p.add(jb1);
         p.add(jb2);
         add(p);        
		setSize(320, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args)
	{
		ButtonChange b=new ButtonChange();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source=(JButton)e.getSource();
		if(jb1==source)
		{   jb2.setEnabled(true);
			jb2.setText(jb1.getText());
			jb1.setText("");
			jb1.setEnabled(false);
		}
		if(jb2==source)
		{
			jb1.setEnabled(true);
			jb1.setText(jb2.getText());
			jb2.setText("");
			jb2.setEnabled(false);		  
		}
	}

}
