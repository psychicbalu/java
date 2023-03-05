import java.awt.*;
import java.applet.*;


public class Star extends Applet
{	
	
	int [] starX = { 100,40,190,10,160};
	int [] starY = { 10,198,78,78,198 };
	int npoints = 5;
	public void paint(Graphics g)
	{
		g.setColor(Color.cyan);
		g.fillPolygon(starX,starY,npoints);
	}
}
