import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPlayers extends JFrame implements ActionListener {
    private JLabel l1;
    private JLabel l2;
    private JTextField tf1;
    private JTextField tf2;
    private JButton playButton;
    private JMenu menu;
    private JMenuItem exit,home;
    private JMenuBar menuBar;

    public RegisterPlayers() {
        super("Pindari Coders");

        setSize(800, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //creating instances of menu and menuitems

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
                GradientPaint gradient = new GradientPaint(0, 0, new Color(127, 77, 192), getWidth(), getHeight(), new Color(172, 27, 199));
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        gradientPanel.setBounds(0, 0, getWidth(), getHeight());
        gradientPanel.setLayout(null);
        add(gradientPanel);



        l1 = new JLabel("Player 1");
        l1.setBounds(300, 100, 200, 50);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Arial", Font.BOLD, 32));
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        gradientPanel.add(l1);


        tf1 = new JTextField();
        tf1.setRequestFocusEnabled(true);
        tf1.setBounds(250, 160, 300, 40);
        tf1.setFont(new Font("Arial", Font.BOLD,24));
        tf1.setBackground(Color.BLACK);
        tf1.setForeground(Color.GREEN);
        gradientPanel.add(tf1);



        l2 = new JLabel("Player 2");
        l2.setBounds(300, 220, 200, 50);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Arial", Font.BOLD, 32));
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        gradientPanel.add(l2);


        tf2 = new JTextField();
        tf2.setBounds(250, 280, 300, 40);
        tf2.setFont(new Font("Arial", Font.BOLD,24));
        tf2.setBackground(Color.BLACK);
        tf2.setForeground(Color.GREEN);
        gradientPanel.add(tf2);


        playButton = new JButton("Play");
        playButton.addActionListener(this);
        playButton.setFont(new Font("Arial", Font.BOLD,24));
        playButton.setBounds(300, 340, 200, 50);
        playButton.setIcon(new ImageIcon("D:\\Downloads\\play-button.png"));
        playButton.setOpaque(true);
        playButton.setBackground(new Color(227, 195, 72, 255));
        playButton.setFocusable(false);
        gradientPanel.add(playButton);

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String t1,t2;
        if(e.getSource() == playButton)
        {


            t1 = tf1.getText();

            String[] words = t1.split(" ");

            String initials = "";
            for (String word : words) {
                if (!word.isEmpty()) {
                    initials += word.charAt(0);
                }
            }
            initials = initials.toUpperCase();
            t1 = initials;

            t2 = tf2.getText();

            String[] wordss = t2.split(" ");

             initials = "";
            for (String word : wordss) {
                if (!word.isEmpty()) {
                    initials += word.charAt(0);
                }
            }
            initials = initials.toUpperCase();

            t2 = initials;

            if(t1.isEmpty() && t2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Players names");
            }
            else if(t1.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Enter First Player name");
            }
            else if(t2.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Enter Second Player name");
            }
            else{

                Game.moveval(t1,t2);
                Game.moveval2(tf1.getText(),tf2.getText());
                dispose();
            new Game();
        }
        }
        if(e.getSource() == home)
        {
            dispose();
            new OpeningFrame();
        }
        if(e.getSource() == exit)
        {

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
}
