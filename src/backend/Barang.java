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
    private String no_dc,nama_barang, gudang_masuk, gudang_keluar, satuan, keterangan;

    public Barang(){
        
    }
    
    public Barang(String nama_barang, String gudang_masuk, String gudang_keluar, String keterangan, String satuan, int Qty){
        this.nama_barang = nama_barang;
        this.gudang_masuk = gudang_masuk;
        this.gudang_keluar = gudang_keluar;
        this.keterangan = keterangan;
        this.Qty = Qty;
        this.satuan = satuan;
    }
    public int getKodeBarang() {
        return kode_barang;
    }

    public void setKodeBarang(int kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getNamaBarang() {
        return nama_barang;
    }

    public void setNamaBarang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getgudang_masuk() {
        return gudang_masuk;
    }

    public void setgudang_masuk(String gudang_masuk) {
        this.gudang_masuk = gudang_masuk;
    }

    public String getgudang_keluar() {
        return gudang_keluar;
    }

    public void setgudang_keluar(String gudang_keluar) {
        this.gudang_keluar = gudang_keluar;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }
    
    public String getKeterangan(){
        return keterangan;
    }
    
    public void setKeterangan(String keterangan){
        this.keterangan = keterangan;
    }
    
    // get the connection
    public Connection getConnection()
    {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_stock", "root","");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
     public ArrayList<Barang> getBarangsList()
   {
       ArrayList<Barang> barangsList = new ArrayList<Barang>();
       Connection connection = getConnection();
       
       String query = "SELECT * FROM  `inputbarang` ";
       Statement st;
       ResultSet rs;
       
       try {
           st = connection.createStatement();
           rs = st.executeQuery(query);
           Barang barang;
           while(rs.next())
           {
               barang = new Barang(nama_barang, gudang_masuk, gudang_keluar, keterangan, satuan, Qty);
               barangsList.add(barang);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
       return barangsList;
   }
     
    public Barang getById(int kode_barang){
        Barang barang = new Barang();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + " b.kode_barang AS kode_barang, "
                + " b.nama_barang AS nama_barang, "
                + " b.Qty AS Qty, "
                + " b.satuan AS satuan, "
                + " b.gudang_masuk AS gudang_masuk, "
                + " b.gudang_keluar AS gudang_keluar, "
                + " b.keterangan AS keterangan, "
                + " FROM barang b "
                + " WHERE b.kode_barang = '" +kode_barang+ "'");
        
        try{
            while(rs.next()){
                barang = new Barang();
                barang.setKodeBarang(rs.getInt("kode_barang"));
                barang.setNamaBarang(rs.getString("nama_barang"));
                barang.setgudang_masuk(rs.getString("gudang_masuk"));
                barang.setgudang_keluar(rs.getString("gudang_keluar"));
                barang.setQty(rs.getInt("Qty"));
                barang.setSatuan(rs.getString("Satuan"));
                barang.setKeterangan(rs.getString("keterangan"));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return barang;
    }
    
    public void save(){
        if(getById(kode_barang).getKodeBarang() == 0){
            String SQL = "INSERT INTO inputbarang (nama_barang, gudang_masuk, gudang_keluar, Qty, satuan, keterangan) VALUES("
                    +"  '" +this.nama_barang+ "',"
                    +"  '" +this.gudang_masuk+ "',"
                    +"  '" +this.gudang_keluar+ "',"
                    +"  '" +this.Qty+ "',"
                    +"  " +this.satuan+ ","
                    +"  " +this.keterangan+ "'"
                    +"  )";
            this.kode_barang = DBHelper.insertQueryGetId(SQL);
        }
        else{
            String SQL = "UPDATE inputbarang SET"
                    +"  '" +this.nama_barang+ "',"
                    +"  '" +this.gudang_masuk+ "',"
                    +"  '" +this.gudang_keluar+ "',"
                    +"  '" +this.Qty+ "',"
                    +"  " +this.satuan+ ","
                    +"  " +this.keterangan+ "'"
                    +"  WHERE kode_barang = " +this.kode_barang+ "";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete(){
        String SQL = "DELETE FROM inputbarang WHERE kode_barang = '" +this.kode_barang+ "'";
        DBHelper.executeQuery(SQL);
    }    
}
