/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS X455L
 */
public class DatabaseConnection {
    private static Connection con;
    public static Connection getConnection(){ 
        if(con == null){
            try{
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection("jdbc:mysql://localhost/db_penjualan", "root", "");
                
                System.out.println("Koneksi database berhasil!");
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada database!");
            }
        }
        return con;
    }
}
