/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.implement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import penjualan.koneksi.DatabaseConnection;

/**
 *
 * @author ASUS X455L
 */
public class TransaksiImplements {
     public int urutanDb(){
        Connection con = DatabaseConnection.getConnection();
        int jumlah = 0;
        try{
            String sql = "SELECT count(*) AS urutan FROM penjualan";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                jumlah = rs.getInt("urutan");
            }
            st.close();
            rs.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return ++jumlah;
    }
    
    public ArrayList<String> viewKd_barang() throws SQLException{
        ArrayList<String> viewNamaBarang = new ArrayList<String>();
        try{
            Statement st = DatabaseConnection.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT kode_barang, nama_barang FROM barang");
            while(rs.next()){
                viewNamaBarang.add(rs.getString("kode_barang") + "-" + rs.getString("nama_barang"));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return viewNamaBarang;
    }
    
    public ArrayList<String> viewId_pelanggan() throws SQLException{
        ArrayList<String> viewNamaPelanggan = new ArrayList<String>();
        try{
            Statement st = DatabaseConnection.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT id_pelanggan, nama_pelanggan FROM pelanggan");
            while(rs.next()){
                viewNamaPelanggan.add(rs.getString("id_pelanggan") + "-" + (rs.getString("nama_pelanggan")));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return viewNamaPelanggan;
    }
}
