import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Records extends JFrame implements ActionListener {
    JTable table = new JTable();
    JLabel label = new JLabel("Score Card");
    JButton back,home,human,ecomputer,mcomputer,dcomputer;

    public Records() {

        home = new JButton("Main Menu");
        home.setBounds(350, 550, 100, 50);
        home.setBackground(new Color(227, 195, 72, 255));
        home.setOpaque(true);
        home.addActionListener(this);
        home.setFocusable(false);


        ecomputer = new JButton("Easy level Records");
        ecomputer.setBounds(290,250,220,50);
        ecomputer.setBackground(new Color(227, 195, 72, 255));
        ecomputer.setOpaque(true);
        ecomputer.addActionListener(this);
        ecomputer.setFocusable(false);

        mcomputer = new JButton("Medium level Records");
        mcomputer.setBounds(290,350,220,50);
        mcomputer.setBackground(new Color(227, 195, 72, 255));
        mcomputer.setOpaque(true);
        mcomputer.addActionListener(this);
        mcomputer.setFocusable(false);

        dcomputer = new JButton("Difficult level Records");
        dcomputer.setBounds(290,450,220,50);
        dcomputer.setBackground(new Color(227, 195, 72, 255));
        dcomputer.setOpaque(true);
        dcomputer.addActionListener(this);
        dcomputer.setFocusable(false);


        human = new JButton("Play with Human Records");
        human.setBounds(290,150,220,50);
        human.setOpaque(true);
        human.setBackground(new Color(227, 195, 72, 255));
        human.addActionListener(this);
        human.setFocusable(false);

        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        table.setPreferredSize(new Dimension(500, 500));
        JPanel gradientPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                GradientPaint gradient = new GradientPaint(0, 0, new Color(127, 77, 192), getWidth(), getHeight(), new Color(172, 27, 199));
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(),getHeight());
            }
        };
        gradientPanel.setLayout(null);
        gradientPanel.setBounds(0, 0, getWidth(), getHeight());

        label.setBounds(0, 50, getWidth(), 50);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.BOLD, 32));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        gradientPanel.add(label);
        gradientPanel.add(human);
        gradientPanel.add(ecomputer);
        gradientPanel.add(mcomputer);
        gradientPanel.add(dcomputer);
        gradientPanel.add(home);


        getContentPane().add(gradientPanel); // Add the gradient panel to the content pane of the frame

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Records();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource() == human)
    {
        dispose();
        new humanRecords();
    }
    else if(e.getSource() == home)
    {
        dispose();
        new OpeningFrame();
    }
    else if(e.getSource() == ecomputer)
        {
            dispose();
            new compRecords();
        }

    else if(e.getSource() == mcomputer)
    {
        dispose();
        new comp2Records();
    }

    else if(e.getSource() == dcomputer)
            {
            dispose();
            new comp3Records();
            }

    }
}

