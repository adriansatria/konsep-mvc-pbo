/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.interfaces;

import java.sql.SQLException;
import java.util.List;
import penjualan.entity.Barang;

/**
 *
 * @author ASUS X455L
 */
public interface BarangInterface {
    Barang insert(Barang o) throws SQLException;
    void update (Barang o) throws SQLException;
    void delete (String kode_barang) throws SQLException;
    List getAll() throws SQLException;
    
}
