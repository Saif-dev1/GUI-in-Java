import java.awt.*;
import javax.swing.*;

public class Home extends JFrame implements Runnable {
    Thread th;
    JLabel lbl1;
    JLabel lbl2;

    Home() {

        lbl1 =new JLabel("SUKKUR IBA");
        lbl1.setBounds(450,100,250,200);
        lbl1.setFont(new Font("Times For Roman",Font.BOLD,30));
        lbl1.setForeground(Color.white);
        add(lbl1);
      //  lbl1.setHorizontalAlignment();
        
        lbl2 =new JLabel("UNIVERSITY");
        lbl2.setBounds(450,200,250,200);
        lbl2.setFont(new Font("Times For Roman",Font.BOLD,30));
        lbl2.setForeground(Color.white);
        add(lbl2);

        ImageIcon im = new ImageIcon(getClass().getResource("images/logo.jpg"));
        Image im2 = im.getImage().getScaledInstance(150, 100, Image.SCALE_DEFAULT);
        ImageIcon im3 = new ImageIcon(im2);
        JLabel ig = new JLabel(im3);
        ig.setBounds(40, 20, 150, 100);
        add(ig);


        ImageIcon img = new ImageIcon(getClass().getResource("images/university.jpg"));
        Image img2= img.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel image = new JLabel(img3);
        add(image);
        th= new Thread(this);
        th.start();
        setVisible(true);


        int x=1;
        for(int i=0; i<=600; i+=4, x+=1){
            setLocation(600-((i+x)/2), 350-(i/2));
            setSize(i+3*x,i+ x/2);

            try{
                Thread.sleep(10);

            }
            catch(Exception e){

            }
        }
    
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
            new Login();
        }
        catch (Exception e){

        }
    }

    public static void main(String[] args) {
        
        Home h = new Home();
    }

}
