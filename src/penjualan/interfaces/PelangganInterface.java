/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.interfaces;

import java.sql.SQLException;
import java.util.List;
import penjualan.entity.Pelanggan;

/**
 *
 * @author ASUS X455L
 */
public interface PelangganInterface {
    Pelanggan insert(Pelanggan o) throws SQLException;
    void update (Pelanggan o) throws SQLException;
    void delete (String id_pelanggan) throws SQLException;
    List getAll() throws SQLException;
}
