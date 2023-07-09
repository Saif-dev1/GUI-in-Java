import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpeningFrame extends JFrame implements ActionListener {
    private JLabel titleLabel;
    private JButton playHumanButton;
    private JButton playComputerButton;
    private JButton RecordButton;
    private JButton aboutButton;
    private JButton exitButton;
    private JProgressBar progressBar;
    private Timer timer;

    public OpeningFrame() {
        super("Pindari Coders");
        // Set frame size and layout
        setSize(800, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

        titleLabel = new JLabel("Welcome to Pindari Coders TicTacToe");
        titleLabel.setBounds(0, 50, getWidth(), 100);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 32));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gradientPanel.add(titleLabel);

        playHumanButton = new JButton("Play with Human");
        playHumanButton.setBounds(100, 150, 250, 150);
        playHumanButton.setIcon(new ImageIcon("D:\\Downloads\\ab.png"));
        playHumanButton.setOpaque(true);
        playHumanButton.setBackground(new Color(231, 194, 52, 255));
        playHumanButton.setFocusable(false);
        playHumanButton.addActionListener(this);
        gradientPanel.add(playHumanButton);

        // Create the "Play with Computer" button
        playComputerButton = new JButton("Play with Computer");
        playComputerButton.setBounds(400, 150, 250, 150);
        playComputerButton.setIcon(new ImageIcon("D:\\Downloads\\monitor.png"));
        playComputerButton.setOpaque(true);
        playComputerButton.setBackground(new Color(227, 195, 72, 255));
        playComputerButton.setFocusable(false);
        playComputerButton.addActionListener(this);
        gradientPanel.add(playComputerButton);

        RecordButton = new JButton("Scores");
        RecordButton.setBounds(100, 325, 250, 150);
        RecordButton.setIcon(new ImageIcon("D:\\Downloads\\scoreboard.png"));
        RecordButton.setOpaque(true);
        RecordButton.setBackground(new Color(231, 194, 52, 255));
        RecordButton.setFocusable(false);
        RecordButton.addActionListener(this);
        gradientPanel.add(RecordButton);

        aboutButton = new JButton("About");
        aboutButton.setBounds(400, 325, 250, 150);
        aboutButton.setIcon(new ImageIcon("D:\\Downloads\\info-button.png"));
        aboutButton.setOpaque(true);
        aboutButton.setBackground(new Color(227, 195, 72, 255));
        aboutButton.setFocusable(false);
        aboutButton.addActionListener(this);
        gradientPanel.add(aboutButton);

        exitButton = new JButton("Exit");
        exitButton.setBounds(250, 500, 250, 150);
        exitButton.setIcon(new ImageIcon("D:\\Downloads\\reject.png"));
        exitButton.setOpaque(true);
        exitButton.setBackground(new Color(227, 195, 72, 255));
        exitButton.addActionListener(this);
        exitButton.setFocusable(false);
        gradientPanel.add(exitButton);

        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setBackground(new Color(227, 195, 72)); // Set background color
        progressBar.setForeground(new Color(127, 77, 192));
        progressBar.setBounds((getWidth() - 200) / 2, (getHeight() - 20) / 2, 200, 20);
        progressBar.setVisible(false);
        gradientPanel.add(progressBar);

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new OpeningFrame();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == playComputerButton) {
            dispose();
            new RegisterPlayer();
        } else if (e.getSource() == playHumanButton) {
            titleLabel.setVisible(false);
            playHumanButton.setVisible(false);
            playComputerButton.setVisible(false);
            RecordButton.setVisible(false);
            aboutButton.setVisible(false);
            exitButton.setVisible(false);

            progressBar.setVisible(true);
            progressBar.setValue(0);
            timer = new Timer(50, new ActionListener() {
                int progress = 1;

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (progress >= 100) {
                        timer.stop();
                        progressBar.setVisible(false);

                        titleLabel.setVisible(true);
                        playHumanButton.setVisible(true);
                        playComputerButton.setVisible(true);
                        RecordButton.setVisible(true);
                        aboutButton.setVisible(true);
                        exitButton.setVisible(true);

                        dispose();
                        new RegisterPlayers();
                    } else {
                        progressBar.setValue(progress);
                        progress++;
                    }
                }
            });
            timer.start();
        } else if (e.getSource() == aboutButton) {
            dispose();
            new AboutFrame();
        } else if (e.getSource() == RecordButton) {
            dispose();
            new Records();
        } else if (e.getSource() == exitButton) {
            int res = JOptionPane.showConfirmDialog(this, "Do you want to exit the game?");
            if (res == JOptionPane.YES_OPTION) {
                System.exit(0);
            } else if (res == JOptionPane.NO_OPTION) {
                // Do nothing
            }
        }
    }
}
