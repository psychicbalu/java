import java.awt.*;
import java.applet.*;
 
public class house extends Applet
{

public void paint(Graphics g)
{ 
int [] x = {150, 300, 225};
int [] y = {150, 150, 25};
g.drawRect(150, 150, 150, 200); //House
g.drawRect(200, 200, 50, 150); // Door
g.drawPolygon(x, y, 3); // Roof
}
}