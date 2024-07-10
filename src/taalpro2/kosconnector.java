/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taalpro2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class kosconnector {
    private static Connection mysqlconfig;
public static Connection configDB()throws SQLException{ 
    try {
            String url="jdbc:mysql://localhost/kos"; 
            String user="root";
            String pass=""; 
            Class.forName("com.mysql.cj.jdbc.Driver");
            mysqlconfig = DriverManager.getConnection(url, user, pass);

    } catch (Exception e) {
System.err.println("koneksi gagal "+e.getMessage());
    }
return mysqlconfig;
    }   
}

