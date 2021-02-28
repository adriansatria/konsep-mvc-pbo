/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.entity;

/**
 *
 * @author ASUS X455L
 */
public class Pelanggan {
    private int id_pelanggan;
    private String nama;
    private String jenis_kel;
    private String alamat;
    private String no_telp;
    String id_pel = String.valueOf(id_pelanggan);


    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the jenis_kel
     */
    public String getJenis_kel() {
        return jenis_kel;
    }

    /**
     * @param jenis_kel the jenis_kel to set
     */
    public void setJenis_kel(String jenis_kel) {
        this.jenis_kel = jenis_kel;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the no_telp
     */
    public String getNo_telp() {
        return no_telp;
    }

    /**
     * @param no_telp the no_telp to set
     */
    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    /**
     * @return the id_pel
     */
    public String getId_pel() {
        return id_pel;
    }

    /**
     * @param id_pel the id_pel to set
     */
    public void setId_pel(String id_pel) {
        this.id_pel = id_pel;
    }
}
