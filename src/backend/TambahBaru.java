/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author Abyan
 */
public class TambahBaru {

    private String kode_barang, nama_barang, satuan, gudang_masuk, gudang_keluar;

    public TambahBaru(){
        
    }
    public TambahBaru(String kode_barang, String nama_barang, String satuan, String gudang_masuk, String gudang_keluar) {
        this.kode_barang = kode_barang;
        this.nama_barang = nama_barang;
        this.satuan = satuan;
        this.gudang_masuk = gudang_masuk;
        this.gudang_keluar = gudang_keluar;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getGudang_masuk() {
        return gudang_masuk;
    }

    public void setGudang_masuk(String gudang_masuk) {
        this.gudang_masuk = gudang_masuk;
    }

    public String getGudang_keluar() {
        return gudang_keluar;
    }

    public void setGudang_keluar(String gudang_keluar) {
        this.gudang_keluar = gudang_keluar;
    }

    
     public TambahBaru getByString(String id){
        TambahBaru tb = new TambahBaru();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM i"
                + " WHERE kode_barang = '" +id+ "'");
        
        try{
            while(rs.next()){
                tb = new TambahBaru();
                tb.setKode_barang(rs.getString("kode_barang"));
                tb.setSatuan(rs.getString("satuan"));
                tb.setGudang_masuk(rs.getString("gudang_masuk"));
                tb.setGudang_keluar(rs.getString("gudang_keluar"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return tb;
    }
    
    public ArrayList<TambahBaru> getAll(){
        ArrayList<TambahBaru> ListTambahBaru = new ArrayList();
        String keyword = null;
        
        String sql = "SELECT * FROM inputbarang";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try{
            while(rs.next()){
                TambahBaru tb = new TambahBaru();
                tb.setKode_barang(rs.getString("kode_barang"));
                tb.setSatuan(rs.getString("satuan"));
                tb.setGudang_masuk(rs.getString("gudang_masuk"));
                tb.setGudang_keluar(rs.getString("gudang_keluar"));
                
                ListTambahBaru.add(tb);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListTambahBaru;
    }
}
//    public void setVisible(boolean b) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//  
//    public void save(){
//        String SQL = "INSERT INTO inputbarang`(kode_barang, nama_barang, satuan, gudang_masuk, gudang_keluar) VALUES("
//                    +"  '" +this.kode_barang+ "',"
//                    +"  '" +this.nama_barang+ "',"
//                    +"  '" +this.satuan+ "',"
//                    +"  '" +this.gudang_masuk+ "',"
//                    +"  '" +this.gudang_keluar+ "'"
//                    +"  )";
//                DBHelper.executeQuery(SQL);
//        }
//    }

    
//    public void delete(){
//        String SQL = "DELETE FROM inputbarang WHERE kode_barang = '" +this.kode_barang+ "'";
//        DBHelper.executeQuery(SQL);
//    }
//}
