import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class humanRecords extends JFrame implements ActionListener {
    JButton menu,delete;
    String dlt ;
    JTable table;
    JScrollPane sc;
    DefaultTableModel model;
    JPanel pnl;
    humanRecords()
    {
        menu = new JButton("Go back");
        menu.addActionListener(this);
        menu.setFocusable(false);
        menu.setOpaque(true);
        menu.setBackground(new Color(231, 194, 52, 255));

        delete = new JButton("Delete Record");
        delete.setFocusable(false);
        delete.setOpaque(true);
        delete.setBackground(new Color(231, 194, 52, 255));

        delete.addActionListener(this);
        pnl  = new JPanel();
        pnl.setBackground((new Color(127, 77, 192)));
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"S.NO","Player1","Score1","Player2","Score2","Tie"});
        pnl.add(menu);
        pnl.add(delete);
        try
        {
            conn con = new conn();
            Statement statement = con.gc.createStatement();


            ResultSet resultSet = statement.executeQuery("SELECT  *FROM phuman");


            while (resultSet.next()) {
                Object[] rowData = new Object[]{resultSet.getInt("id"),resultSet.getString("p1"), resultSet.getInt("p11"),resultSet.getString("p2"), resultSet.getInt("p22"),resultSet.getInt("Tie")};
                model.addRow(rowData);
            }

            // Close the result set, statement, and connection
            resultSet.close();
            statement.close();
            con.gc.close();




        }
        catch(Exception ae)
        {
            JOptionPane.showMessageDialog(null, ae.getMessage());
        }



        table = new JTable(model);
        table.setDefaultEditor(Object.class, null);
        table.setFont(new Font("Arial", Font.BOLD, 14));
        table.setSelectionBackground(Color.RED);

        table.setBackground(Color.GRAY);
        sc = new JScrollPane(table);

        sc.setPreferredSize(new Dimension(500, 500));

        setSize(800, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
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
        gradientPanel.setLayout(new BorderLayout());
        gradientPanel.add(pnl, BorderLayout.SOUTH);
        gradientPanel.add(sc, BorderLayout.NORTH);
        add(gradientPanel);




        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == menu)
        {
            dispose();
            new Records();
        }
        if(e.getSource() == delete) {
            int selectedRow = table.getSelectedRow();
            Object id = null;
            if (selectedRow != -1) {
                id = table.getValueAt(selectedRow, 0);

            }
            int getid = (int) id;
            try {

                conn con = new conn();
                String sql = "DELETE FROM phuman WHERE id =  " + getid;
                Statement statement = con.gc.createStatement();

                statement.executeUpdate(sql);

                model.removeRow(selectedRow);
                table.setFocusable(false);
                table.revalidate();
                table.repaint();

                statement.close();
                conn.gc.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }
}
