/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan_mvc;

import java.sql.SQLException;
import penjualan.views.HomeView;

/**
 *
 * @author ASUS X455L
 */
public class Penjualan_mvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        HomeView hv = new HomeView();
        hv.setVisible(true);
    }
    
}
