/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
 import java.sql.Connection;
 import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class koneksi {
    private Connection conn;
    private Statement st;
    
    public static void ambilKoneksi(){
        try{
            String db = "jdbc:mysql://localhost/penjualansparepart";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(db, user, pass);
            
        }catch (Exception x){
            System.out.println("Kesalahan Ambil Koneksi : "+x);
        }
    }
    
    public void koneksi(){
        try{
            String db = "jdbc:mysql://localhost/penjualansparepart";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(db, user, pass);
            st = conn.createStatement();
        }catch (Exception x){
            System.out.println("Kesalahan Koneksi : "+x);
        }
    }
    
    public void diskoneksi(ResultSet rs){
        try{
            if (rs !=null){
                rs.close();
            }
            st.close();
            conn.close();
        }catch (Exception x){
            System.out.println("Kesalahan Diskoneksi : "+x);
        }
    }
    
    public ResultSet ambilData(String sql){
        ResultSet rs = null;
        try{
            koneksi();
            rs = st.executeQuery(sql);
        }catch (Exception x){
            System.out.println("Kesalahan ambil data : "+x);
        }
        return rs;
    }
    public ResultSet ambilData2(String sql){
        ResultSet rg= null; 
        try{
            koneksi();
            rg= st.executeQuery(sql);
        }catch (Exception x){
            System.out.println("Kesalahan ambil data : "+x);
        }
        return rg;
    }
    
    public void simpanData(String sql){
        try{
            koneksi();
            st.executeUpdate(sql);
        }catch (Exception x){
            System.out.println("Kesalahan simpan data : "+x);
        }
    }
        
        public void simpanData2(String sql){
        try{
            koneksi();
            st.executeUpdate(sql);
        }catch (Exception x){
            System.out.println("Kesalahan simpan data : "+x);
        }
        
    }
}
