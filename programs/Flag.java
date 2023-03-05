import java.awt.*;
import java.applet.*;
public class flag extends Applet

{
public void paint(Graphics g)
{
g.setColor(Color.black);
g.fillRect(50,20,5,300);


g.setColor(Color.orange);
g.fillRect(55,20,120,30);


g.setColor(Color.white);
g.fillRect(55,50,120,30);


g.setColor(Color.green);
g.fillRect(55,80,120,30);

g.setColor(Color.black);
g.drawRect(55,20,120,90);

g.setColor(Color.black);
g.drawOval(100,50,30,30);
}
}