/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.implement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import penjualan.entity.Pelanggan;
import penjualan.interfaces.PelangganInterface;
import penjualan.koneksi.DatabaseConnection;

/**
 *
 * @author ASUS X455L
 */
public class PelangganImplements implements PelangganInterface{

    @Override
    public Pelanggan insert(Pelanggan o) throws SQLException {
        PreparedStatement st = DatabaseConnection.getConnection().prepareStatement("INSERT INTO pelanggan VALUES(?, ?, ?, ?, ?)");
        st.setString(1, o.getId_pel());
        st.setString(2, o.getNama());
        st.setString(3, o.getJenis_kel());
        st.setString(4, o.getAlamat());
        st.setString(5, o.getNo_telp());
        st.executeUpdate();
        return o;
    }

    @Override
    public void update(Pelanggan o) throws SQLException {
        PreparedStatement st = DatabaseConnection.getConnection().prepareStatement("UPDATE pelanggan SET nama_pelanggan = ?, jenkel = ?, alamat = ?, notelp = ? WHERE id_pelanggan = ?");
        st.setString(1, o.getNama());
        st.setString(2, o.getJenis_kel());
        st.setString(3, o.getAlamat());
        st.setString(4, o.getNo_telp());
        st.setString(5, o.getId_pel());
        st.executeUpdate();
    }

    @Override
    public void delete(String id_pelanggan) throws SQLException {
        PreparedStatement st = DatabaseConnection.getConnection().prepareStatement("DELETE FROM pelanggan WHERE id_pelanggan = ?");
        st.setString(1, id_pelanggan);
        st.executeUpdate();
    }

    @Override
    public List getAll() throws SQLException {
        Statement st = DatabaseConnection.getConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM pelanggan");
        List<Pelanggan> list = new ArrayList<Pelanggan>();
        while(rs.next()){
            Pelanggan pelanggan = new Pelanggan();
            pelanggan.setId_pel(rs.getString("id_pelanggan"));
            pelanggan.setNama(rs.getString("nama_pelanggan"));
            pelanggan.setJenis_kel(rs.getString("jenkel"));
            pelanggan.setAlamat(rs.getString("alamat"));
            pelanggan.setNo_telp(rs.getString("notelp"));
            list.add(pelanggan);
        }
        return list;
    }
    
}
