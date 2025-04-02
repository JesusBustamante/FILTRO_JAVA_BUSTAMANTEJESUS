package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BBDD_Connection {
    
    private static final String URL = "jdbc:mysql://bk8tsrv2l6lsyeqrfhyn-mysql.services.clever-cloud.com:3306/bk8tsrv2l6lsyeqrfhyn";
    private static final String USER = "ub9z1ih67pnqupl9";
    private static final String PASSWORD = "RFNSLk4P9svS9Zpsy0hz";
    
    private static Connection conn = null;
    
    public static Connection conectar() throws SQLException {
        
        if(conn == null || conn.isClosed()) {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return conn;  
        
    }
    
    public  static void closeConnection() {
        try {
            if(conn != null && ! conn.isClosed()) {
                conn.close();
                conn = null;
            } 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
