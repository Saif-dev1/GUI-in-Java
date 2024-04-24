import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    String url="jdbc:mysql://localhost:3306/projectfinal";
    String username="root";
    String password="Sukkur@786";

public static Connection gc;
Statement stmt;
conn(){
    try {
        gc= DriverManager.getConnection(url,username,password);
        stmt=gc.createStatement();
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage());
    }


}

}
