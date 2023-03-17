import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TrafficLight extends JFrame implements ActionListener
{
    String str="";
    JFrame frame;
    JLabel title,text;
    JRadioButton r1,r2,r3;
    JPanel p;
    public TrafficLight()
    {
        frame=new JFrame("Traffic Light");
        frame.getContentPane().setBackground(Color.BLUE);
        p=new JPanel();
        title=new JLabel("Traffic Light");
        text=new JLabel(str);
        p.setLayout(new GridLayout(0,3));
        frame.setSize(400,400);
        r1=new JRadioButton("R");
        r2=new JRadioButton("Y");
        r3=new JRadioButton("G");
        p.add(r1);p.add(r2);p.add(r3);
        frame.setLayout(new GridLayout(3,1));
        frame.add(title);
        frame.add(text);
        frame.add(p);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        str=e.getActionCommand();
        if(str.equals("R"))
        {
            frame.getContentPane().setBackground(Color.RED);
            text.setText("Red");
        }
        else if(str.equals("Y"))
        {
            frame.getContentPane().setBackground(Color.YELLOW);
            text.setText("Yellow");
        }
        else if(str.equals("G"))
        {
            frame.getContentPane().setBackground(Color.GREEN);
            text.setText("Green");
        }
    }
    public static void main(String[] args) {
        new TrafficLight();
    }
}