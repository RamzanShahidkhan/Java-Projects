package Chapter18;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;

public class SizeApplet extends Applet {
	public void paint(Graphics g) {
	Dimension appletSize = this.getSize();
		int appletHeight = appletSize.height;
		int appletWidth = appletSize.width;
		g.drawString("This applet is " + appletHeight
		+ " pixels high by " + appletWidth + " pixelswide.", 15, appletHeight/2);
	}
}