/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
      public static Connection getCon()
     {
         try
         {
             //Step no 1
             Class.forName("com.mysql.jdbc.Driver");
            //Step no 2
            
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmcode","root","gagan");
             //Step no 3
             return con;
         }
         catch(ClassNotFoundException | SQLException e)
         { 
            System.out.println(e);
            return null;
         }
    }
  
    
}
