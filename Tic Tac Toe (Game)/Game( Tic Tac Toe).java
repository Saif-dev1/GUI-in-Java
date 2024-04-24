import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.Random;

public class Game extends JFrame implements ActionListener
{
    static String p1, p2;
    int x = 0 , y = 0 , tie = 0;
    static String pl,pl2;
    public static void moveval2(String st1, String st2)
    {
        pl = st1;
        pl2 = st2;
    }
    public static void moveval(String s1, String s2)
    {
        p1 = s1;
        p2 = s2;
    }
    Random rand = new Random();

    JMenu file;

    JMenuItem home,exit;
    JMenuBar bar;
    JButton buttons[] = new JButton[9];
    JLabel my ;
    JPanel gradientButtonPanel ;
    JPanel ab = new JPanel();

    JButton Restart;
    JPanel scorePanel, playerPnl;
    JLabel scoreLabel;
    JLabel player1, player2, tieLbl;
    JLabel turnLabel;


    boolean player1Turn;
    int counter = 0;

    public void restartGame() {
        player1Turn = true;
        counter = 0;

        for (JButton button : buttons) {
            button.setText("");
            button.setBackground( new Color(172, 27, 199));
            button.setEnabled(true);
        }
        Turn();

    }

    public void check()
    {

        if(buttons[0].getText().equals("X") && buttons[1].getText().equals("X") && buttons[2].getText().equals("X"))
        {
            XWins(0,1,2);
        }
        else draw(0,1,2);

        if(buttons[3].getText().equals("X") && buttons[4].getText().equals("X") && buttons[5].getText().equals("X"))
        {
            XWins(3,4,5);
        }
        else draw(3,4,5);


        if(buttons[6].getText().equals("X") && buttons[7].getText().equals("X") && buttons[8].getText().equals("X"))
        {
            XWins(6,7,8);
        }
        else draw(6,7,8);


        if(buttons[0].getText().equals("X") && buttons[4].getText().equals("X") && buttons[8].getText().equals("X"))
        {
            XWins(0,4,8);
        }
        else draw(0,4,8);


        if(buttons[2].getText().equals("X") && buttons[4].getText().equals("X") && buttons[6].getText().equals("X"))
        {
            XWins(2,4,6);
        }
        else draw(2,4,6);

        if(buttons[0].getText().equals("X") && buttons[3].getText().equals("X") && buttons[6].getText().equals("X"))
        {
            XWins(0,3,6);
        }
        else draw(0,3,6);

        if(buttons[1].getText().equals("X") && buttons[4].getText().equals("X") && buttons[7].getText().equals("X"))
        {
            XWins(1,4,7);
        }
        else draw(1,4,7);


        if(buttons[2].getText().equals("X") && buttons[5].getText().equals("X") && buttons[8].getText().equals("X"))
        {
            XWins(2,5,8);
        }
        else draw(2,5,8);




        if(buttons[0].getText().equals("O") && buttons[1].getText().equals("O") && buttons[2].getText().equals("O"))
        {
            OWins(0,1,2);
        }
        else draw(0,1,2);


        if(buttons[3].getText().equals("O") && buttons[4].getText().equals("O") && buttons[5].getText().equals("O"))
        {
            OWins(3,4,5);
        }
        else draw(3,4,5);

        if((buttons[6].getText().equals("O") && buttons[7].getText().equals("O") && buttons[8].getText().equals("O")))
        {
            OWins(6,7,8);
        }
        else draw(6,7,8);

        if(buttons[0].getText().equals("O") && buttons[4].getText().equals("O") && buttons[8].getText().equals("O"))
        {
            OWins(0,4,8);
        }
        else draw(0,4,8);

        if(buttons[2].getText().equals("O") && buttons[4].getText().equals("O") && buttons[6].getText().equals("O"))
        {
            OWins(2,4,6);
        }
        else draw(2,4,6);

        if(buttons[0].getText().equals("O") && buttons[3].getText().equals("O") && buttons[6].getText().equals("O"))
        {
            OWins(0,3,6);
        }
        else draw(0,3,6);

        if(buttons[1].getText().equals("O") && buttons[4].getText().equals("O") && buttons[7].getText().equals("O"))
        {
            OWins(1,4,7);
        }
        else draw(1,4,7);

        if(buttons[2].getText().equals("O") && buttons[5].getText().equals("O") && buttons[8].getText().equals("O"))
        {
            OWins(2,5,8);
        }
        else draw(2,5,8);






    }
    public void XWins(int x, int y, int z)
    {
        buttons[x].setBackground(Color.PINK);
        buttons[y].setBackground(Color.PINK);
        buttons[z].setBackground(Color.PINK);
        turnLabel.setText(p1 + " Won");
        this.x++;
        for(int i=0; i<9; i++)
        {
            buttons[i].setEnabled(false);
        }
        player1.setText(p1+ " - \t"+ this.x);
    }
    public void OWins(int x, int y, int z)
    {

        buttons[x].setBackground(Color.PINK);
        buttons[y].setBackground(Color.PINK);
        buttons[z].setBackground(Color.PINK);
        turnLabel.setText(p2 + " Won");
        this.y++;
        for(int i=0; i<9; i++)
        {
            buttons[i].setEnabled(false);
        }
        player2.setText(p2+ " - \t"+ this.y);
    }
    public void draw(int x, int y, int z)
    {

        counter+=1;

        if(counter ==144)
        {
            for(int i = 0; i<9; i++)
            {
                buttons[i].setBackground(Color.RED);
                buttons[i].setEnabled(false);
            }
            turnLabel.setText("Draw!");
           this.tie++;
            tieLbl.setText("Tie "+ " - \t"+ this.tie);
        }

    }

   public void Turn() {
       try {
           Thread.sleep(2000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       if (rand.nextInt(2) == 0) {
           player1Turn = true;
           turnLabel.setText(p1 + "'s Turn");
       } else {
           player1Turn = false;
           turnLabel.setText(p2 + "'s Turn");
       }
   }
    public Game()
    {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 700);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(50, 50, 50));
        this.setLayout(new BorderLayout());


        Restart = new JButton("Restart Game");
        Restart.setBackground(  new Color(164, 140, 55, 255));
        Restart.setFocusable(false);

        playerPnl = new JPanel();
        playerPnl.setBackground(new Color(50, 50, 50));
        playerPnl.setLayout(new GridLayout(4,1));
        scorePanel = new JPanel();
        scorePanel.setPreferredSize(new Dimension(270,700));
        scorePanel.setLayout(new BorderLayout());
        scorePanel.setBackground(new Color(50, 50, 50));
        player1 = new JLabel(p1+ " - \t"+ 0);
        player1.setFont(new Font("Arial", Font.BOLD,18));
        player1.setForeground(Color.WHITE);
        player2 = new JLabel(p2+" - \t"+0);
        player2.setFont(new Font("Arial", Font.BOLD,18));
        player2.setForeground(Color.WHITE);
        tieLbl = new JLabel("Tie - \t"+0);
        tieLbl.setFont(new Font("Arial", Font.BOLD,18));
        tieLbl.setForeground(Color.WHITE);

        scoreLabel = new JLabel("Scores");
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 20));
        scoreLabel.setForeground(Color.GREEN);
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playerPnl.add(scoreLabel);
        playerPnl.add(player1);
        playerPnl.add(player2);
        playerPnl.add(tieLbl);
        playerPnl.setPreferredSize(new Dimension(200,100));
        scorePanel.add(playerPnl, BorderLayout.NORTH);
        scorePanel.add(Restart, BorderLayout.SOUTH);
        Restart.addActionListener(this);

        turnLabel = new JLabel(p1 + "'s Turn");
        turnLabel.setFont(new Font("Arial", Font.BOLD, 30));
        turnLabel.setForeground(Color.WHITE);
        turnLabel.setHorizontalAlignment(SwingConstants.CENTER);
        scorePanel.add(turnLabel, BorderLayout.CENTER);

        this.add(scorePanel, BorderLayout.WEST);



        file = new JMenu("File");
        file.setIcon(new ImageIcon("D:\\Downloads\\burger.png"));
        home = new JMenuItem("Main Menu");
        home.setIcon(new ImageIcon("D:\\Downloads\\hm.png"));
        exit = new JMenuItem("Exit");
        exit.setIcon(new ImageIcon("D:\\Downloads\\switch.png"));

        file.add(home);
        file.add(exit);
        bar = new JMenuBar();
        bar.add(file);
        this.setJMenuBar(bar);
        home.addActionListener(this);
        exit.addActionListener(this);

        my = new JLabel("Copyright Claims: Pindari Coders");
        my.setFont(new Font("Arial", Font.BOLD, 15));
        my.setHorizontalAlignment(SwingConstants.CENTER);
        my.setBackground(  new Color(72, 206, 181, 255));
        my.setForeground(Color.WHITE);
        my.setSize(30, 40);
        my.setOpaque(true);

        gradientButtonPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                GradientPaint gradient = new GradientPaint(0, 0, new Color(127, 77, 192), getWidth(), getHeight(), new Color(172, 27, 199));
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        gradientButtonPanel.setLayout(new GridLayout(3, 3));
        gradientButtonPanel.setBackground(Color.darkGray);

        // Creating buttons and registering in ActionListener
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].setFocusable(false);
            buttons[i].setBackground( new Color(172, 27, 199));
            gradientButtonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 120));
            buttons[i].addActionListener(this);
        }

        this.add(my, BorderLayout.SOUTH);
        this.add(gradientButtonPanel, BorderLayout.CENTER);

        // Calling turn method
        Turn();

        this.setTitle("Pindari Coders");
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        for (int i = 0; i < 9; i++)
        {
            if(e.getSource()== buttons[i])
            {
                if(player1Turn)
                {
                    if(buttons[i].getText() == "")
                    {
                        buttons[i].setForeground(Color.PINK);
                        buttons[i].setText("X");
                        player1Turn = false;
                        turnLabel.setText(p2+"'s Turn");
                        check();



                    }

                }
                else
                {

                    if(buttons[i].getText() == "")
                    {
                        buttons[i].setForeground(Color.BLUE);
                        buttons[i].setText("O");
                        player1Turn = true;
                        turnLabel.setText(p1+"'s Turn");
                        check();


                    }

                }
            }

        }

        if(e.getSource() == Restart)
        {
            restartGame();
        }
        if(e.getSource() == exit)
        {

            int res = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit the game");
            if(res == JOptionPane.YES_OPTION)
            {

                try
                {
                    conn con = new conn();
                    String sql = "INSERT INTO phuman(p1,p11,p2,p22,Tie) VALUES (?,?,?,?,?)";
                    PreparedStatement ps = con.gc.prepareStatement(sql);
                    ps.setString(1, pl);
                    ps.setInt(2,x);
                    ps.setString(3, pl2);
                    ps.setInt(4,y);
                    ps.setInt(5,tie);
                    ps.executeUpdate();



                }
                catch(Exception ae)
                {
                    JOptionPane.showMessageDialog(null, ae.getMessage());
                }


                System.exit(0);
            }
            else if(res == JOptionPane.NO_OPTION )
            {

            }
        }
        if(e.getSource() == home)
        {


            try
            {
                conn con = new conn();
                System.out.println("Connection Success");
                String sql = "INSERT INTO phuman(p1,p11,p2,p22,Tie) VALUES (?,?,?,?,?)";
                PreparedStatement ps = con.gc.prepareStatement(sql);
                System.out.println("Statement completed");
                ps.setString(1, this.pl);
                ps.setInt(2,this.x);
                ps.setString(3, this.pl2);
                ps.setInt(4,this.y);
                ps.setInt(5,this.tie);
                ps.executeUpdate();



            }
            catch(Exception ae)
            {
                JOptionPane.showMessageDialog(null, ae.getMessage());
            }

            dispose();
            new OpeningFrame();
        }
    }
}
