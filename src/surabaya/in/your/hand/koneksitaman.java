/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package surabaya.in.your.hand;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADINDA
 */
public class koneksitaman {
    private static Connection MySQLConfig;

    public static Connection configDB()throws SQLException{
     try {
                String url = "jdbc:mysql://localhost:3306/siyh";
                String user = "root";
                String password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                MySQLConfig = DriverManager.getConnection(url, user, password);
            } catch (SQLException e){
                System.out.println("Error" + e.getMessage());    
            }
     
            return MySQLConfig;
    }
    
}
