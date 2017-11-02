import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

public class MyShapeButton extends JToggleButton{

	public MyShapeButton(String imageFileName) {
		setIcon(new ImageIcon(imageFileName));
		setBorderPainted(false);
		setFocusPainted(false);
	}

}
