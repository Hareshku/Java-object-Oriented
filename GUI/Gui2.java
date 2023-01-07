import java.awt.*;
import java.awt.event.*;

import javax.swing.WindowConstants;
class Gui2{
    public Gui2(){
    Frame f=new Frame();
f.setSize(200,300);

f.setVisible(true);
f.addWindowListener( new Windowaddopter() {
    @Override
    public void windowClosing(WindowEvent e){
    f.dispose();
}
});
}

public static void main(String[] args){
Gui2 e=new Gui2();
}

}
