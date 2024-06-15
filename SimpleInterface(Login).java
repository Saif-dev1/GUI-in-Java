
    import java.awt.*;
    import java.awt.event.*;

import javax.swing.*;


    public class Program implements ActionListener {


        JFrame frame;
        JPanel panel;

        JTextField usertext;

        JTextField passwordtext;

        JLabel userlabel;

        JLabel passwordlabel;
        JLabel success;

        JButton button;


        Program() {

            frame = new JFrame();

            panel = new JPanel();

            frame.setSize(350, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            panel.setLayout(null);

            frame.add(panel);


            userlabel = new JLabel("User");
            userlabel.setBounds(40, 20, 80, 25);

            panel.add(userlabel);


            usertext = new JTextField();

            usertext.setBounds(100, 20, 165, 25);

            panel.add(usertext);


            passwordlabel = new JLabel("Password");
            passwordlabel.setBounds(40, 45, 80, 25);
            panel.add(passwordlabel);


            passwordtext = new JTextField();
            passwordtext.setBounds(100, 45, 165, 25);

            panel.add(passwordtext);

            success = new JLabel();
            success.setBounds(130, 120, 165, 25);
            success.setForeground(Color.BLUE);
            panel.add(success);

            button = new JButton("Login");
            button.setBounds(140, 80, 80, 25);
            button.setFocusable(false);
            button.addActionListener(this);

            panel.add(button);



            frame.setVisible(true);


        }


        public void actionPerformed(ActionEvent e) {

            String user = usertext.getText();

            String password = passwordtext.getText();
            if(e.getSource()==button)
            {

            if (user.equals("Saif") && password.equals("latki123")) {
                success.setText("Login successful!");
            }
            else{
                success.setText("Login failed!");
            }
            }

        }

        
        public static void main(String args[]) {



            new Program();

        }
    }
