
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.accessibility.AccessibleText;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JavaS{
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setSize(400,400);
        f.setLayout(null);
        f.setBackground(Color.yellow);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel p=new JPanel();
        p.setSize(400,400);
        p.setLayout(null);
        p.setBackground(Color.red);
        
          JTextField tf=new JTextField();
        tf.setBounds(30, 100, 250, 30);
        tf.setBackground(Color.YELLOW);
        
         JTextArea ta=new JTextArea();
        ta.setBounds(30,  70, 250, 20);
        
          JLabel L=new JLabel("to continue");
        L.setBounds(150, 200, 250, 30);
        
        JPasswordField ps=new JPasswordField();
        ps.setBounds(30, 200, 250, 30);
        
        JButton b= new JButton("click");
        b.setBounds(30, 20, 100, 30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ps.setBackground(Color.PINK);
                p.setBackground(Color.BLUE);
                //ps.setText("password");
                ta.setText(ps.getText());
                
         String s=ta.getText();
         String w[]=s.split(" ");
        tf.setText("total char  "+s.length()+"  Total world  "+w.length);
                       
            }
        });
                
          
        f.add(ps);
      
        JRadioButton r=new JRadioButton();
        r.setBounds(100, 300, 50, 20);
        
        
        
       
        p.add(r);
        p.add(ta);
        p.add(tf);
        p.add(L);
        p.add(b);
        f.add(p);
        p.setVisible(true);
        
        f.setVisible(true);
    }
}