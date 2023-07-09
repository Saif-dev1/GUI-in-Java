import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPlayer extends JFrame implements ActionListener {
    private JLabel l1;
    private JTextField tf1;
    private JButton easyButton, mediumButton, difficultButton;
    private JMenu menu;
    private JMenuItem exit,home;
    private JMenuBar menuBar;
    public RegisterPlayer() {
        super("Pindari Coders");
        setSize(800, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menu = new JMenu("Menu");
        menu.setIcon(new ImageIcon("D:\\Downloads\\burger.png"));
        exit = new JMenuItem("Exit");
        exit.setIcon(new ImageIcon("D:\\Downloads\\switch.png"));
        home = new JMenuItem("Main Menu");
        home.setIcon(new ImageIcon("D:\\Downloads\\hm.png"));

        menuBar = new JMenuBar();
        menu.add(home);
        menu.add(exit);
        home.addActionListener(this);
        exit.addActionListener(this);
        menuBar.add(menu);

        setJMenuBar(menuBar);

        JPanel gradientPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                GradientPaint gradient = new GradientPaint(0, 0,new Color(127, 77, 192) , getWidth(), getHeight(), new Color(172, 27, 199));
                g2d.setPaint(gradient);

                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        gradientPanel.setBounds(0, 0, getWidth(), getHeight());
        gradientPanel.setLayout(null);
        add(gradientPanel);

        l1 = new JLabel("Player Name");
        l1.setBounds(300, 140, 200, 50);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Arial", Font.BOLD, 32));
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        gradientPanel.add(l1);

        tf1 = new JTextField();
        tf1.setRequestFocusEnabled(true);
        tf1.setBounds(250, 190, 300, 40);
        tf1.setFont(new Font("Arial", Font.BOLD, 24));
        tf1.setBackground(Color.BLACK);
        tf1.setForeground(Color.GREEN);
        gradientPanel.add(tf1);

        easyButton = new JButton("Easy");
        easyButton.setFocusable(false);
        easyButton.addActionListener(this);
        easyButton.setFont(new Font("Arial", Font.BOLD, 24));
        easyButton.setBounds(300, 250, 200, 50);
        easyButton.setIcon(new ImageIcon("D:\\Downloads\\easy.png"));
        easyButton.setBackground(new Color(227, 195, 72, 255));
        gradientPanel.add(easyButton);

        mediumButton = new JButton("Medium");
        mediumButton.setFocusable(false);
        mediumButton.addActionListener(this);
        mediumButton.setFont(new Font("Arial", Font.BOLD, 24));
        mediumButton.setBounds(300, 310, 200, 50);
        mediumButton.setIcon(new ImageIcon("D:\\Downloads\\medium.png"));
        mediumButton.setBackground(new Color(227, 195, 72, 255));
        gradientPanel.add(mediumButton);

        difficultButton = new JButton("Difficult");
        difficultButton.setFocusable(false);
        difficultButton.addActionListener(this);
        difficultButton.setFont(new Font("Arial", Font.BOLD, 24));
        difficultButton.setBounds(300, 370, 200, 50);
        difficultButton.setIcon(new ImageIcon("D:\\Downloads\\challenge.png"));
        difficultButton.setBackground(new Color(227, 195, 72, 255));
        gradientPanel.add(difficultButton);

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        String pname = tf1.getText();

        String[] words = pname.split(" ");

        String initials = "";
        for (String word : words) {
            if (!word.isEmpty()) {
                initials += word.charAt(0);
            }
        }
        initials = initials.toUpperCase();
        pname = initials;

        if(e.getSource() == easyButton) {
            if (pname.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the name");
            }
            else
            {
                dispose();
                Computer2.moveval(tf1.getText());
                Computer2.moveval2(pname);
                new Computer2();
            }
        }
         if (e.getSource() == mediumButton) {
             if (pname.isEmpty()) {
                 JOptionPane.showMessageDialog(null, "Please enter the name");
             }
             else
             {
                 dispose();
                 Computer.moveval(tf1.getText());
                 Computer.moveval2(pname);
                 new Computer();
             }
        }
         if(e.getSource() == difficultButton)
        {
            if (pname.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the name");
            }
            else
            {
                dispose();
                Computer3.moveval(tf1.getText());
                Computer3.moveval2(pname);
                new Computer3();
            }
        }

        if(e.getSource() == home)
        {
            dispose();
            new OpeningFrame();
        }


            if(e.getSource() == exit)
            {
                int res = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit the game");
                if(res == JOptionPane.YES_OPTION)
                {
                    System.exit(0);
                }
                else if(res == JOptionPane.NO_OPTION )
                {

                }

            }

    }

    }

