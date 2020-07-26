/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ashu Jain
 */
public class LocalDatabaseConnection {
     public Connection getConnection()
                {
                    Connection con=null;
                    try{
                
                Class.forName("org.sqlite.JDBC");
                con=DriverManager.getConnection("jdbc:sqlite:carservice.db");
                //System.out.println(con);
                }
                catch (Exception ex)
                {
                ex.printStackTrace();
                }
              
                return con;
                }
    
}
