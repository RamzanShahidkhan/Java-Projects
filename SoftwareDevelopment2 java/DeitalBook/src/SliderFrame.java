

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class SliderFrame extends JFrame {
	private JSlider dSlider;
	private OvalPanel myPanel;
	
	public SliderFrame()
	{
		super("JSliderDemo");
		myPanel=new OvalPanel();
		myPanel.setBackground(Color.yellow);
		dSlider=new JSlider(SwingConstants.HORIZONTAL, 0,200,10);
		dSlider.setMajorTickSpacing(10);
		dSlider.setPaintTicks(true);
		dSlider.addChangeListener(
				new ChangeListener() {
					
					@Override
					public void stateChanged(ChangeEvent e) {
						myPanel.setDiameter(dSlider.getValue());
					}
				}
				);
		add(dSlider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		SliderFrame s=new SliderFrame();
		s.setSize(400,400);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setVisible(true);
		

	}

}
