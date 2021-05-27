
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import java.sql.*;

public class GenrelClass {
    private static Connection con = null;
    public static void setImangeIntoLabel(String path, JLabel picShow)
    {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image newImage = img.getScaledInstance(picShow.getWidth(), picShow.getHeight(), img.SCALE_SMOOTH);
        ImageIcon newImageIcon = new ImageIcon(newImage);
        picShow.setIcon(newImageIcon);
    }
    

   public static void showDataIntoTable(String dbTable, JTable table) {
        con = DBSCon.dataBaseConnection();
           try
           {
               Statement st = con.createStatement();
                       String queery = "select * from  " + dbTable;
                       ResultSet rs = st.executeQuery(queery);
                       table.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception ex)
           {
               
           }
   finally 
           {
           try
           {
               con.close();
           }catch(Exception ex)
           {
               
           }
           }
}
}