import java.awt.*;
import java.applet.*;

public class Bar extends Applet
{	
	int values[]={100,150,250,270};
	
	public void paint(Graphics g)
	{
		for(int i=0;i<4;i++)
		{
			g.setColor(Color.blue);
			g.drawString(Integer.toString(values[i]),20, i*50+30);
			g.setColor(Color.green);
			g.fillRect(50,i*50+10, values[i], 40);

		}
	}
}