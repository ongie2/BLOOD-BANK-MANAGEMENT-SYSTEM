import java.sql.*;
import javax.swing.*;
public class DBSCon {
    private static Connection con = null;
    public static Connection dataBaseConnection()
    {
        try
        {
            
            String url = "jdbc:sqlite:BloodDonationDBMS.sqlite";
         con = DriverManager.getConnection(url);
         return con;
        }catch(Exception ex)
            
            
        {
            return null;
        }
    }
}
