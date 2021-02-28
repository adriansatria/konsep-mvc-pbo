/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.implement;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import penjualan.entity.Barang;
import penjualan.interfaces.BarangInterface;
import penjualan.koneksi.DatabaseConnection;

/**
 *
 * @author ASUS X455L
 */
public class BarangImplements implements BarangInterface{

    @Override
    public Barang insert(Barang o) throws SQLException {
        PreparedStatement st = DatabaseConnection.getConnection().prepareStatement("INSERT INTO barang VALUES(?, ?, ?, ?)");
        st.setString(1, o.getKode_barang());
        st.setString(2, o.getNama_barang());
        st.setString(3, o.getJumlah() + " ");
        st.setString(4, o.getHarga() + " ");
        st.executeUpdate();
        return o;
    }

    @Override
    public void update(Barang o) throws SQLException {
        PreparedStatement st = DatabaseConnection.getConnection().prepareStatement("UPDATE barang SET nama_barang = ?, stok_barang = ?,"
                + "harga_barang = ? WHERE kode_barang = ?");
        st.setString(1, o.getNama_barang());
        st.setString(2, o.getJumlah());
        st.setString(3, o.getHarga());
        st.setString(4, o.getKode_barang());
        st.executeUpdate();
    }

    @Override
    public void delete(String kode_barang) throws SQLException {
        PreparedStatement st = DatabaseConnection.getConnection().prepareStatement("DELETE FROM barang WHERE kode_barang = ?");
        st.setString(1, kode_barang);
        st.executeUpdate();
    }

    @Override
    public List getAll() throws SQLException {
        Statement st = DatabaseConnection.getConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM barang");
        List<Barang> list = new ArrayList<Barang>();
        while(rs.next()){
            Barang barang = new Barang();
            barang.setKode_barang(rs.getString("kode_barang"));
            barang.setNama_barang(rs.getString("nama_barang"));
            barang.setJumlah(rs.getString("stok_barang"));
            barang.setHarga(rs.getString("harga_barang"));
            list.add(barang);
        }
        return list;
    }
    
}
