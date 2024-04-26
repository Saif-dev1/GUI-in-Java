import javax.swing.*;

public class Home extends JFrame {

    Home() {
        
        ImageIcon img = new ImageIcon(getClass().getResource("images/university.jpg"));
        
        JLabel image = new JLabel(img);

        add(image);

        setLocation(300, 200);
        setSize(750, 550);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        Home h = new Home();
    }
}
