import java.awt.*;
import java.applet.*;

public class App1 extends Applet{

    public void init(){
        setBackground(Color.yellow);
    }

    public void pain(Graphics g){

        g.drawString("Helloo.." , 50, 100);
        g.drawString("Welcome to Applet life cycle" , 50, 100);
        g.drawRect(150,150,100,100);

    }

}