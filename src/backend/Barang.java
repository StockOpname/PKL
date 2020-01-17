/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Abyan
 */
public class Barang {
    private int idBarang;
    private String namaBarang, gudangMasuk, gudangKeluar, keterangan;
    private int quantity, satuan;

    public Barang(){
        
    }
    
    public Barang(String namaBarang, String gudangMasuk, String gudangKeluar, String keterangan, int satuan, int quantity){
        this.namaBarang = namaBarang;
        this.gudangMasuk = gudangMasuk;
        this.gudangKeluar = gudangKeluar;
        this.keterangan = keterangan;
        this.quantity = quantity;
        this.satuan = satuan;
    }
    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarangl() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getGudangMasuk() {
        return gudangMasuk;
    }

    public void setGudangMasuk(String gudangMasuk) {
        this.gudangMasuk = gudangMasuk;
    }

    public String getGudangKeluar() {
        return gudangKeluar;
    }

    public void setGudangKeluar(String gudangKeluar) {
        this.gudangKeluar = gudangKeluar;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSatuan() {
        return satuan;
    }

    public void setSatuan(int satuan) {
        this.satuan = satuan;
    }
    
    public String getKeterangan(){
        return keterangan;
    }
    
    public void setKeterangan(String keterangan){
        this.keterangan = keterangan;
    }

    public void save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
