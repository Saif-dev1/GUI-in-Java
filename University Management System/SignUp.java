import javax.swing.*;
import java.awt.*;

public class SignUp extends JFrame {

    JLabel lblSign;
    Font font;
    JLabel lblFname;
    JTextField fldFname;
    JLabel lblLname;
    JTextField fldLname;
    JLabel lblno;
    JTextField fldNo;
    JLabel lblgender;
    JCheckBox btnMale;
    JCheckBox btnFmale;
    JCheckBox btnOthers;
    JLabel lblEmail;
    JTextField fldEmail;
    JLabel lblpasw;
    JPasswordField fldPasw;
    JLabel lblretype;
    JPasswordField fldRetyp;
    JButton btnSign;
    JButton btnCancle;


    SignUp(){
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);
        setSize(600, 700);
        setLocation(400, 100);
        setTitle("Sign Up");

        lblSign=new JLabel("Basic Information");
        lblSign.setBounds(210,50,300,100);
        font =new Font("Times New Roman",Font.BOLD,28);
        lblSign.setFont(font);
        add(lblSign);

        lblFname =new JLabel("First Name ");
        lblFname.setBounds(140,200,80,20);
        add(lblFname);

        fldFname=new JTextField("enter your first name");
        fldFname.setBounds(230,200,150,20);
        add(fldFname);

        lblLname =new JLabel("Last Name");
        lblLname.setBounds(140,250,80,20);
        add(lblLname);

        fldLname =new JTextField("enter your last name");
        fldLname.setBounds(230,250,150,20);
        add(fldLname);

        lblgender=new JLabel("Gender");
        lblgender.setBounds(140,300,80,20);
        add(lblgender);

        btnMale =new JCheckBox("Male");
        btnMale.setBounds(230,300,60,20);
        add(btnMale);

        btnFmale =new JCheckBox("Female");
        btnFmale.setBounds(270,300,80,20);
        add(btnFmale);

        btnOthers =new JCheckBox("Others");
        btnOthers.setBounds(330,300,80,20);
        add(btnOthers);

        lblno =new JLabel("Mobile No");
        lblno.setBounds(140,350,80,20);
        add(lblno);

        fldNo=new JTextField("enter your mobile number");
        fldNo.setBounds(230,350,150,20);
        add(fldNo);

        lblEmail=new JLabel("Email");
        lblEmail.setBounds(140,400,80,20);
        add(lblEmail);

        fldEmail =new JTextField("enter your email address");
        fldEmail.setBounds(230,400,150,20);
        add(fldEmail);

        lblpasw=new JLabel("Password");
        lblpasw.setBounds(140,450,80,20);
        add(lblpasw);

        fldPasw=new JPasswordField();
        fldPasw.setBounds(230,450,150,20);
        add(fldPasw);

        lblretype=new JLabel("Re-type");
        lblretype.setBounds(140,500,80,20);
        add(lblretype);

        fldRetyp=new JPasswordField();
        fldRetyp.setBounds(230,500,150,20);
        add(fldRetyp);

        btnSign=new JButton("Sign Up");
        btnSign.setBounds(190,570,80,20);
        add(btnSign);

        btnCancle=new JButton("Cancle");
        btnCancle.setBounds(280,570,80,20);
        add(btnCancle);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SignUp s=new SignUp();
    }
}
