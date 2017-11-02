package CheckboxStart;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame {
	private JComboBox images;
	private JLabel label;
	private static final String[] names={"bug1.jpg","bug2.jpg","bug3.jpg","bug4.jpg"};
	private Icon[] icons= { new ImageIcon(names[0]),new ImageIcon(names[1]),
			new ImageIcon(names[2]), new ImageIcon(names[3])};
//constructor
	public ComboBoxFrame()
	{
		super("JCombo Testing..");
		setLayout(new FlowLayout());
		images= new JComboBox(names);
		images.setMaximumRowCount(3);
		images.addItemListener(
				new ItemListener() {
					
					@Override
					public void itemStateChanged(ItemEvent event) {
						if(event.getStateChange()==ItemEvent.SELECTED)
							label.setIcon(icons[images.getSelectedIndex()]);
						
					}
				}
);
		add(images);
		label=new JLabel(icons[0]);
		add(label);
	}
}
