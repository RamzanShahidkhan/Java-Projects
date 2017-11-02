package CheckboxStart;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListFrame14 extends JFrame {
	private JList colorList;
	private static final String[] colorNames={"Black","Blue","cyan","Drak Gray",
			"Gray","Green","Light Gray","Magenta","Orange","Pink","Red","White","Yellow"};
	private static final Color[] colors={Color.BLACK, Color.blue,Color.CYAN,Color.DARK_GRAY,
			Color.GRAY,Color.GREEN,Color.LIGHT_GRAY,Color.MAGENTA,Color.ORANGE,
			Color.PINK,Color.RED,Color.WHITE,Color.YELLOW    };
	
	public ListFrame14()
	{
		super("List test,,,,");
		setLayout(new FlowLayout());
		colorList=new JList(colorNames);
		colorList.setVisibleRowCount(5);
		colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(colorList));
		colorList.addListSelectionListener(
				new ListSelectionListener() {
					
					@Override
					public void valueChanged(ListSelectionEvent event) {
						getContentPane().setBackground(colors[colorList.getSelectedIndex()]);
					}
				});
		
	}
	public static void main(String[] args)
	{
		ListFrame14 list=new ListFrame14();
		list.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		list.setSize(400,400);
		list.setVisible(true);
	}

}
