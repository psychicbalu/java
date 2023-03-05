import java.awt.*;
import java.applet.*;

public class Triangle extends Applet
{	
	int xpoints [] = {60,100,20};
	int ypoints [] = {20,90,90};
	int npoints = 3;
	public void paint(Graphics g)
	{
		g.setColor(Color.cyan);
		g.fillPolygon(xpoints,ypoints,npoints);
	}
}
