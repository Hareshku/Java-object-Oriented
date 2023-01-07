import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DialogExample{
    private static JDialog d;
    DialogExample(){
        JFrame f=new JFrame();
        d=new Dialog(f,"Dialog Example",true);
        d.setLayout(new FlowLayout());
        JButton b=new Jbutton("ok");
        b.addActionListener (new ActionListener(){

        
        public void actionPerformed(ActionEvent e)
        {
        DialogExample.d.setVisible(false);
      
    }
});
d.add(new JLabel ("click Button to continue"));
d.add(b);
d.setSize(300,300);
d.setVisible(true);
    }
    public static void main(String[] args) {
        new DialogExample();
    }
    
}
