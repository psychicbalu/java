import java.awt.*;
public class Pie extends Applet
{
    int[] data_values;
    Color[] data_clr;
    int total;
    //Function to create a data set
    public void init()
    {
	setBackground(Color.white);
	//Create a data set to represent in pie-chart
	data_values=new int[]{10,25,12,15,15,18,5};
	data_clr=new Color[]		{Color.red,Color.blue,Color.green,Color.yellow,
                             	Color.orange,Color.black,Color.white};
    	}
    
    //Function to draw the pie chart
    public void paint(Graphics g)
    {
	int i,total=0,start_angle = 0,arc_angle;
	for(i=0;i<data_values.length;i++)
	{
	    total+=data_values[i];
	    arc_angle = (int)(data_values[i]*360 / total);
	    g.drawArc(100,100,300,300,start_angle,arc_angle);
	    g.setColor(data_clr[i]);
	    g.fillArc(100,100,300,300,start_angle,arc_angle);
	    start_angle+=arc_angle;
	}
    }
}
