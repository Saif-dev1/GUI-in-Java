import javax.swing.*;
import java.awt.*;


public class MainInterface extends JFrame {


    MainInterface(){

        setSize(1550,820);

        ImageIcon img = new ImageIcon(getClass().getResource("images/sibau.jpg"));
        Image img2 = img.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image = new JLabel(img3);
        add(image);
        setTitle("Sukkur IBA University");
        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        MainInterface mf=new MainInterface();
    }
    
}
