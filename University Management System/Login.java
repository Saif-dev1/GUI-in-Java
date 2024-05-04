import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JLabel lblUser;
    JTextField tfUser;
    JLabel lblPsw;
    JPasswordField pswfield;
    JButton btnLogin;
    JButton btnCancle;
    Login(){
        getContentPane().setBackground(Color.darkGray);
        setLayout(null);
        setSize(600,500);
        setLocation(400,100);

        lblUser=new JLabel("Username/Email");
        lblUser.setBounds(130,200,100,20);
        lblUser.setForeground(Color.WHITE);
        add(lblUser);

        tfUser=new JTextField();
        tfUser.setBounds(250,200,150,20);
        add(tfUser);

        lblPsw=new JLabel("Password");
        lblPsw.setBounds(130,270,100,20);
        lblPsw.setForeground(Color.WHITE);
        add(lblPsw);


        pswfield=new JPasswordField();
        pswfield.setBounds(250,270,150,20);
        add(pswfield);

        btnLogin=new JButton("Login");
        btnLogin.setBounds(150,350,100,30);
        btnLogin.setBackground(Color.BLACK);
        btnLogin.setForeground(Color.WHITE);
        btnLogin.addActionListener(this);
        add(btnLogin);

        btnCancle=new JButton("Cancle");
        btnCancle.setBounds(280,350,100,30);
        btnCancle.setBackground(Color.BLACK);
        btnCancle.setForeground(Color.WHITE);
        btnCancle.addActionListener(this);
        add(btnCancle);

        ImageIcon img = new ImageIcon(getClass().getResource("images/second.jpg"));
        Image img2= img.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel image = new JLabel(img3);
        image.setBounds(200,20,180,120);
        add(image);
     
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== btnLogin){

        }
        else if(ae.getSource()== btnCancle){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        Login l =new Login();
    
}
}