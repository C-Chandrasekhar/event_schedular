
package event_schedular;

import java.sql.*;
import javax.swing.*;

public class MySql {
    Connection conn=null;
    public static Connection ConnectDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/logintable","root","");
            //JOptionPane.showMessageDialog(null, "connected to database");
            return conn;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
