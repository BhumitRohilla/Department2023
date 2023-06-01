import java.awt.*;
import java.applet.Applet;
public class app extends Applet{
    public void paint(Graphics g){
        g.drawString("Welcome to app", 100,100);
        g.drawRect(100, 200, 245, 345);
    }
    /* <applet code="app",width ="400",height="600"> </applet> */
}