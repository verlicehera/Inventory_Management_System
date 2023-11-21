package inventorymanagementsystem;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class My_CNX {
    
    private static String fullname = "localhost";
    private static String username = "root";
    private static String dbname = "inventory_system";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    
    
    public static Connection getConnection() throws SQLException 
    {
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(fullname);
        datasource.setUser(username);
        datasource.setPassword(password);
        
        
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get Connection ->"+ My_CNX.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        
        return cnx;
    }
}

