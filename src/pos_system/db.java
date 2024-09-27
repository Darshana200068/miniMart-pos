/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 94760
 */
public class db {
    
    public static Connection myCon(){
        
        Connection con=null ;
        final String url="jdbc:mysql://localhost:3306/db_pos";
        final String uName="root";
        final String pWord="";
        try {
            //create connection
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url,uName,pWord);
            return con;
            
        } catch (ClassNotFoundException | SQLException e) {
            //error handling
            
            System.out.println(e);
            return null;
        }

    }
}
