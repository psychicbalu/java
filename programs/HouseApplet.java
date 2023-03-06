import java.awt.*;
import java.applet.*;

public class HouseApplet extends Applet {
    public void paint(Graphics g) {
        
        int[] xPoints = { 50, 100, 150 };
        int[] yPoints = { 100, 50, 100 };
        int nPoints = 3;
        g.drawPolygon(xPoints, yPoints, nPoints);
        
       
        g.drawRect(50, 100, 100, 100);
        
      
        g.drawRect(70, 160, 30, 40);
        
        
        g.drawRect(100, 120, 30, 30);
        g.drawRect(60, 120, 30, 30);
    }
}
