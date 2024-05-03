import java.awt.*;
import javax.swing.*;

public class Home extends JFrame implements Runnable {
    Thread th;
    Home() {
        
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
        }
        catch (Exception e){

        }
    }

    public static void main(String[] args) {
        
        Home h = new Home();
    }

}
