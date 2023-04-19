import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Sample1 extends Applet implements ItemListener{

    Checkbox c1, c2, c3;
    CheckboxGroup chg = new CheckboxGroup();

    public void init(){

        c1 = new Checkbox("Rectangle",chg, false);
        c2 = new Checkbox("Circle",chg, false);
        c3 = new Checkbox("Line",chg, false);

        add(c1);
        add(c2);
        add(c3);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

    }


    public void itemStateChanged(ItemEvent ie){

        repaint();

    }

    public void paint(Graphics g){

        if(chg.getSelectedCheckBox().getLabel() == "Rectangle"){

            g.drawRect(150, 150 , 100, 100);

        }
   

 

        if(chg.getSelectedCheckBox().getLabel() == "Cicle"){

            g.drawOval(150, 150 , 100, 100);

        }
   
  
        if(chg.getSelectedCheckBox().getLabel() == "Line"){

            g.drawLine(150, 150 , 100, 100);

        }
 


}

}