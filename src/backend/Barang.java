/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Abyan
 */
public class Barang {
    private int kode_barang,Qty;
    private String no_dc,nama_barang, gudang_masuk, gudang_keluar, satuan, keterangan,tanggal;
    
    public Barang(){
        
    }
    
    public Barang(String nama_barang, String gudang_masuk, String gudang_keluar, String keterangan, String satuan, int Qty,int kode_barang,String tanggal){
        this.kode_barang = kode_barang;
        this.nama_barang = nama_barang;
        this.gudang_masuk = gudang_masuk;
        this.gudang_keluar = gudang_keluar;
        this.keterangan = keterangan;
        this.Qty = Qty;
        this.satuan = satuan;
        this.tanggal = tanggal;
    }

    public int getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(int kode_barang) {
        this.kode_barang = kode_barang;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public String getNo_dc() {
        return no_dc;
    }

    public void setNo_dc(String no_dc) {
        this.no_dc = no_dc;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
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

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    public Barang getByString(String id){
        Barang b = new Barang();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM inputbarang"
                + " WHERE no_dc = '" +id+ "'");
        
        try{
            while(rs.next()){
                b = new Barang();
                b.setNo_dc(rs.getString("no_dc"));
                b.setKode_barang(rs.getInt("kode_barang"));
                b.setNama_barang(rs.getString("nama_barang"));
                b.setQty(rs.getInt("Qty"));
                b.setSatuan(rs.getString("satuan"));
                b.setGudang_masuk(rs.getString("gudang_masuk"));
                b.setGudang_keluar(rs.getString("gudang_keluar"));
                b.setKeterangan(rs.getString("keterangan"));
                b.setTanggal(rs.getString("tanggal"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return b;
    }
    
    public ArrayList<Barang> getAll(){
        ArrayList<Barang> ListBarang = new ArrayList();
        String keyword = null;
        
        String sql = "SELECT * FROM inputbarang";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try{
            while(rs.next()){
                Barang b = new Barang();
                b.setNo_dc(rs.getString("no_dc"));
                b.setKode_barang(rs.getInt("kode_barang"));
                b.setNama_barang(rs.getString("nama_barang"));
                b.setQty(rs.getInt("Qty"));
                b.setSatuan(rs.getString("satuan"));
                b.setGudang_masuk(rs.getString("gudang_masuk"));
                b.setGudang_keluar(rs.getString("gudang_keluar"));
                b.setKeterangan(rs.getString("keterangan"));
                b.setTanggal(rs.getString("tanggal"));
                
                ListBarang.add(b);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListBarang;
    }
//    public Barang getById(String id){
//        Barang barang = new Barang();
//        ResultSet rs = DBHelper.selectQuery("SELECT "
//                + " b.no_dc AS no_dc, "
//                + " b.kode_barang AS kode_barang, "
//                + " b.nama_barang AS nama_barang, "
//                + " b.Qty AS Qty, "
//                + " b.satuan AS satuan, "
//                + " b.gudang_masuk AS gudang_masuk, "
//                + " b.gudang_keluar AS gudang_keluar, "
//                + " b.keterangan AS keterangan, "
//                + " b.tanggal AS tanggal, "
//                + " FROM barang b "
//                + " WHERE b.no_dc = '" +id+ "'");
//        
//        try{
//            while(rs.next()){
//                barang = new Barang();
//                barang.setNoDocument(rs.getString("no_dc"));
//                barang.setKodeBarang(rs.getInt("kode_barang"));
//                barang.setNamaBarang(rs.getString("nama_barang"));
//                barang.setQty(rs.getInt("Qty"));
//                barang.setSatuan(rs.getString("Satuan"));
//                barang.setgudang_masuk(rs.getString("gudang_masuk"));
//                barang.setgudang_keluar(rs.getString("gudang_keluar"));
//                barang.setKeterangan(rs.getString("keterangan"));
//                barang.setTanggal(rs.getString("tanggal"));
//            }
//        } catch(Exception e){
//            e.printStackTrace();
//        }
//        return barang;
//    }
//    
//    public ArrayList<Barang> getAll(){
//        ArrayList<Barang> ListBarang = new ArrayList();
//        ResultSet rs = DBHelper.selectQuery("Select "
//                + " b.no_dc AS no_dc, "
//                + " b.kode_barang AS kode_barang, "
//                + " b.nama_barang AS nama_barang, "
//                + " b.Qty AS Qty, "
//                + " b.satuan AS satuan, "
//                + " b.gudang_masuk AS gudang_masuk, "
//                + " b.gudang_keluar AS gudang_keluar, "
//                + " b.keterangan AS keterangan, "
//                + " b.tanggal AS tanggal, "
//                + " FROM barang b "
//                + " WHERE b.kode_barang = '" +kode_barang+ "'");
//        try{
//            while(rs.next()){
//                Barang barang = new Barang();
//                barang.setNoDocument(rs.getString("no_dc"));
//                barang.setKodeBarang(rs.getInt("kode_barang"));
//                barang.setNamaBarang(rs.getString("nama_barang"));
//                barang.setQty(rs.getInt("Qty"));
//                barang.setSatuan(rs.getString("Satuan"));
//                barang.setgudang_masuk(rs.getString("gudang_masuk"));
//                barang.setgudang_keluar(rs.getString("gudang_keluar"));
//                barang.setKeterangan(rs.getString("keterangan"));
//                barang.setTanggal(rs.getString("tanggal"));
//                
//                ListBarang.add(barang);
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        return ListBarang;
//    }
    
//    public void save(){
//        if(getById(no_dc)() == 0){
//            String SQL = "INSERT INTO inputbarang (kode_barang, nama_barang, Qty, satuan, gudang_masuk, gudang_keluar, keterangan, tanggal) VALUES("
//                    +"  '" +this.kode_barang+ "',"
//                    +"  '" +this.nama_barang+ "',"
//                    +"  '" +this.Qty+ "',"
//                    +"  '" +this.satuan+ ","
//                    +"  '" +this.gudang_masuk+ "',"
//                    +"  '" +this.gudang_keluar+ "',"
//                    +"  '" +this.keterangan+ "',"
//                    +"  " +this.tanggal+ "',"
//                    +"  )";
//            this.no_dc = DBHelper.insertQueryGetId(SQL);
//        }
//        else{
//            String SQL = "UPDATE inputbarang SET"
//                    +"  '" +this.no_dc+ "',"
//                    +"  '" +this.kode_barang+ "',"
//                    +"  '" +this.nama_barang+ "',"
//                    +"  '" +this.Qty+ "',"
//                    +"  '" +this.satuan+ ","
//                    +"  '" +this.gudang_masuk+ "',"
//                    +"  '" +this.gudang_keluar+ "',"
//                    +"  '" +this.keterangan+ "',"
//                    +"  " +this.tanggal+ "'"
//                    +"  WHERE no_dc = " +this.no_dc+ "";
//            DBHelper.executeQuery(SQL);
//        }
//    }
//
//    public void delete(){
//        String SQL = "DELETE FROM inputbarang WHERE kode_barang = '" +this.kode_barang+ "'";
//        DBHelper.executeQuery(SQL);
//    }    

}
