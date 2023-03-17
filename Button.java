import javax.swing.*;
import java.awt.event.*;

public class Button
{
    static JFrame frame;
    static JButton b;
    static JTextField tf;
    Button()
    {
        frame=new JFrame("Display Message");
        b=new JButton("Enter");
        tf=new JTextField();
    }
    public static void main(String args[])
    {
        new Button();
        frame.setSize(800,800);
        frame.setVisible(true);
        frame.setLayout(null);
        b.setBounds(300,100,100,40);
        tf.setBounds(300,150,100,40);
        frame.add(tf);
        frame.add(b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String text=tf.getText();
                JLabel label=new JLabel("Entered String : "+text);
                frame.add(label);
                label.setBounds(300,200,200,40);
            }
        });
    }
}