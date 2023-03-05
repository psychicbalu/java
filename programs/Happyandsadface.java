import java.awt.*;
import java.applet.*;

public class face extends Applet
{
    public void paint(Graphics g)
    {
g.drawOval(40, 40, 120, 150);//head
g.drawOval(57, 75, 30, 20);//left eye
g.drawOval(110, 75, 30, 20);//right eye
g.fillOval(68, 81, 10, 10);//left pupil
g.fillOval(121, 81, 10, 10);//right pupil
g.drawOval(85, 100, 30, 30);//nose
//g.fillArc(60, 125, 80, 40, 180, 180);//mouth-smiling
g.fillArc(60, 140, 80, 40, 0, 180);//mouth-sad
g.drawOval(25, 92, 15, 30);//left ear
g.drawOval(160, 92, 15, 30);//right ear
    }
}