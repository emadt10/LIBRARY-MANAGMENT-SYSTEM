/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

 import java.sql.*;
import javax.swing.JOptionPane;


public class Connectiontodb {
    java.sql.Connection con=null;
    public java.sql.Connection Establishcon()
    {
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Seema\\Desktop\\Library.accdb");
            //JOptionPane.showMessageDialog(null,"connected");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        return con;
    }
}


