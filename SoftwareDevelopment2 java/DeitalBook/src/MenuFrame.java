import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

public class MenuFrame extends JFrame{
	private final Color [] colorValues={Color.black,Color.blue, Color.RED, Color.green};
	private JRadioButtonMenuItem[] colorItems;
	private JRadioButtonMenuItem[] fonts;
	private JCheckBoxMenuItem[] styleItems;
	private JLabel dLabel;
	private ButtonGroup fontbg;
	private ButtonGroup colorbg;
	private int style;
	
	public MenuFrame()
	{
		super("using JMenus");
		JMenu fMenu=new JMenu("File");  //create file menu
		fMenu.setMnemonic('F');  //set Mnemonic to F
		
		JMenuItem aboutItem=new JMenuItem("About....");
		aboutItem.setMnemonic('A');
		fMenu.add(aboutItem);
		aboutItem.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e)
					{
						JOptionPane.showMessageDialog(MenuFrame.this, "This is an example\n of using menus ",
								"About",JOptionPane.PLAIN_MESSAGE);	
					}
				}
				);
		JMenuItem exitItem=new JMenuItem("Exit");
		exitItem.setMnemonic('x');
		fMenu.add(exitItem);
		exitItem.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						System.exit(0);
					}
				}
				);
		JMenuBar bar=new JMenuBar(); //create menubar 
		setJMenuBar(bar);
		bar.add(fMenu);
		
		JMenu formatMenu=new JMenu("Format");
		formatMenu.setMnemonic('r');
         
		String [] colors={"Black","Blue","Red","Green"};
		JMenu colorMenu=new JMenu("Color");
		colorMenu.setMnemonic('C');
		//create radiobutton  items for colors
		colorItems=new JRadioButtonMenuItem[colors.length];
		colorbg=new ButtonGroup(); //to manage colors
		ItemHandler itemHandler=new ItemHandler();
		
		for(int c=0; c<colors.length; c++)
		{
			colorItems[c]=new JRadioButtonMenuItem(colors[c]);
			colorMenu.add(colorItems[c]);
			colorbg.add(colorItems[c]);
			colorItems[c].addActionListener(itemHandler);
			
		}
		colorItems[0].setSelected(true);
		formatMenu.add(colorMenu);//add color to format Menu
		formatMenu.addSeparator(); //add separator in menu
		
		String[] fontNames={"Serif","Monospaced","SanSerif" };
		JMenu fontMenu=new JMenu("Font");
		fontMenu.setMnemonic('n');
		
		fonts=new JRadioButtonMenuItem[fontNames.length];
		fontbg=new ButtonGroup();
		
		for(int c=0; c<fonts.length; c++)
		{
			fonts[c]=new JRadioButtonMenuItem(fontNames[c]);
			fontMenu.add(fonts[c]);
			fontbg.add(fonts[c]);
			fonts[c].addActionListener(itemHandler);
			
		}
		fonts[0].setSelected(true);
		fontMenu.addSeparator();
		
		String [] styleNames={"Bold","Italic"};
		styleItems = new JCheckBoxMenuItem[ styleNames.length ];
		StyleHandler styleHandler=new StyleHandler();
		for(int c=0; c<styleNames.length;  c++)
		{
			styleItems[ c ] =
					new JCheckBoxMenuItem( styleNames[ c ] ); // for style
					fontMenu.add( styleItems[ c ] ); // add t\
					styleItems[c].addActionListener(styleHandler);
		}
			
		
		
	}
	

	public static void main(String[] args) 
	{
		

	}

}
