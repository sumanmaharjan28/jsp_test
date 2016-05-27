package DB_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBHelper {
     private static Connection conn= null;
    Statement stmt= null;
    public DBHelper() throws ClassNotFoundException, SQLException{
        if(conn==null){
            Class.forName("com.mysql.jdbc.Driver");
            conn =DriverManager.getConnection("jdbc:mysql:://localhost:3306/inventorybillingsystem", "root", " ");
        }
        stmt= conn.createStatement();
    }
    public int executeUpdate(String sql) throws SQLException{
        return stmt.executeUpdate(sql);
    }
    public ResultSet executeQuery(String  sql) throws SQLException{
        return stmt.executeQuery(sql);
    }
    public void closeConnection() throws SQLException{
        conn.close();
    }

  
}
