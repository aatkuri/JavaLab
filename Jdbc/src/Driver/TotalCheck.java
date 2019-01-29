package Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TotalCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@192.168.0.110:1521/orcl";
        String username = "ashok";
        String password = "ashok";
        Statement dbStatement = null;
        ResultSet dbrs = null;
        Connection conn = null;
        
        try {
            conn
                    = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful.");
            System.out.println("*************************************");
        } catch (SQLException ex) {
            System.out.println("Problems with connection" + ex);
        }
    }

}  


