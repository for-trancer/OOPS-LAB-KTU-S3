import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class UserInterface
{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setTitle("Hello World!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        ImageIcon image=new ImageIcon("E:\\ACHU\\Photoshop\\2021\\Logo\\dod-red.jpg");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.black);
    }
}