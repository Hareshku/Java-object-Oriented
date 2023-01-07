package JavaProject;
//cimport java.awt.Frame;
//import java.awt.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
//import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

public class GUIApp {
    public static void main(String[] args){
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        JButton button=new JButton();
        JLabel label=new JLabel();
        JLabel label2 = new JLabel();
        JTextField TextField=new JTextField();
        frame.setVisible(true);

        frame.setBounds(0,0,600,800);
        frame.setTitle("this is title");
        label.setText("Enter Temperature");
        button.setText("click");
        label2.setText("F");
        TextField.setColumns(30);
        panel.add(label);
        panel.add(TextField);
        panel.add(button);
        panel.add(label2);
        frame.add(panel);
        
        
        

        button.addActionListener(new ActionListener(){
    
        
         //   private AbstractButton label2;

            public void actionPerformed(ActionEvent e) {
                
                try{
                    String temperature=TextField.getText();
                    float celsius=Float.parseFloat(temperature);
                    float fahrenhiet=(celsius*1.8F)+32;
                    String temp=fahrenhiet+"F";
                    label2.setText(temp);

                }
                catch(NumberFormatException nfe)
                {
            JOptionPane.showMessageDialog(frame,"please enter temp");
                }
            }
        });

        

    }
}