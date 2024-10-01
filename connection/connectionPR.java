/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.*;

/**
 *
 * @author X515JAEJ502TS (8503)
 */
public class connectionPR {
  
    public static Connection getCon()
    
    {
        
    
     try
     {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaP_SE","root","YaRu@002");
      
       
        return con;
     }
    catch(Exception e)
    {
        
    return null;
    }
    }
    
    
    
}
