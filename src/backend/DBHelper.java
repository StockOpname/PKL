/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Abyan
 */
public class DBHelper {
    private static Connection koneksi;
    public static Connection getKoneksi()     
     {
          if(koneksi == null){ 
              try{
                  String url = "jdbc:mysql://localhost:3306/test_stock";
                  String user = "root";
                  String password = "";
                  DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                  koneksi = (Connection) DriverManager.getConnection(url, user, password);
                  JOptionPane.showMessageDialog(null, "Koneksi Sukses!!");
              }          
              catch (SQLException t){
                  JOptionPane.showMessageDialog(null, "Koneksi Error, hubungkan database");
              }   
          }
        return koneksi;
    }
    
    public static void main(String[] args){
        Connection koneksi = new DBHelper().getKoneksi();
    }
    
    public static ResultSet selectQuery(String query){
          getKoneksi();
          ResultSet rs = null;
          
          try{
              Statement stmt = koneksi.createStatement();
              rs = stmt.executeQuery(query);
          }         
          catch (Exception e){
              e.printStackTrace();
          }
          return rs;
      }
}
