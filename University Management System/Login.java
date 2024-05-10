import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;

public class Login extends JFrame implements ActionListener {
    JLabel lblUser;
    JTextField tfUser;
    JLabel lblPsw;
    JPasswordField pswfield;
    JButton btnLogin;
    JButton btnCancle;

    static class CircularIcon implements Icon {
        private Image image;

        public CircularIcon(Image image) {
            this.image = image;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            // Create circular shape
            Graphics2D g2d = (Graphics2D) g.create();
            Ellipse2D circle = new Ellipse2D.Float(x, y, getIconWidth(), getIconHeight());
            g2d.setClip(circle);
            // Draw image
            g2d.drawImage(image, x, y, getIconWidth(), getIconHeight(), c);
            g2d.dispose();
        }

        @Override
        public int getIconWidth() {
            return image.getWidth(null);
        }

        @Override
        public int getIconHeight() {
            return image.getHeight(null);
        }
    }
    Login() {
        getContentPane().setBackground(Color.darkGray);
        setLayout(null);
        setSize(600, 500);
        setLocation(400, 100);

        lblUser = new JLabel("Username/Email");
        lblUser.setBounds(130, 200, 100, 20);
        lblUser.setForeground(Color.WHITE);
        add(lblUser);

        tfUser = new JTextField();
        tfUser.setBounds(250, 200, 150, 20);
        add(tfUser);

        lblPsw = new JLabel("Password");
        lblPsw.setBounds(130, 270, 100, 20);
        lblPsw.setForeground(Color.WHITE);
        add(lblPsw);

        pswfield = new JPasswordField();
        pswfield.setBounds(250, 270, 150, 20);
        add(pswfield);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(150, 350, 100, 30);
        btnLogin.setBackground(Color.BLACK);
        btnLogin.setForeground(Color.WHITE);
        btnLogin.addActionListener(this);
        add(btnLogin);

        btnCancle = new JButton("Cancel");
        btnCancle.setBounds(280, 350, 100, 30);
        btnCancle.setBackground(Color.BLACK);
        btnCancle.setForeground(Color.WHITE);
        btnCancle.addActionListener(this);
        add(btnCancle);

        ImageIcon img = new ImageIcon(getClass().getResource("images/second.jpg"));
        Image img2 = img.getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        CircularIcon circularIcon = new CircularIcon(img3.getImage());
        JLabel image = new JLabel(circularIcon);
        image.setBounds(200, 10, 180, 180);
        add(image);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnLogin) {
            // Handle login action
        } else if (ae.getSource() == btnCancle) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        Login l = new Login();
    }
}
