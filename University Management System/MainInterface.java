import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainInterface extends JFrame {
    JToolBar taskBar;
    JPanel taskPanel;

    MainInterface() {
       
        setSize(1550, 820);
        setTitle("Sukkur IBA University");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

     
        ImageIcon img = new ImageIcon(getClass().getResource("images/sibau.jpg"));
        Image img2 = img.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image = new JLabel(img3);

     
        taskBar = new JToolBar();
        taskBar.setFloatable(false); 
        add(taskBar, BorderLayout.NORTH);

    
        JButton btn1 = new JButton("Home");
        JButton btn2 = new JButton("Login");
        JButton btn3 = new JButton("Sign up");

        taskBar.add(btn1);
        taskBar.add(Box.createHorizontalStrut(1150));
        taskBar.add(btn2);
        taskBar.add(Box.createHorizontalStrut(20));
        taskBar.add(btn3);

    
        taskPanel = new JPanel(new CardLayout());
        
    
        add(taskPanel, BorderLayout.CENTER);
        add(image, BorderLayout.SOUTH);

      
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==btn1) {
                    new Home();
                }
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btn2){
                    new Login();
                }
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(e.getSource()==btn3){
                new SignUp();
               }
            }
        });


        setVisible(true);
    }


    public static void main(String[] args) {
        MainInterface mf = new MainInterface();
    }
}
