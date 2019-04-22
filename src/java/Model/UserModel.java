/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserModel {
    String Kodebarang, Namabarang, Hargajual, Hargabeli, Satuan, Kategori, tanggal, nomor, nama, kode;

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    koneksi db = null;
    
    public UserModel(){
        db = new koneksi();
    }   

    public String getKodebarang() {
        return Kodebarang;
    }

    public void setKodebarang(String Kodebarang) {
        this.Kodebarang = Kodebarang;
    }

    public String getNamabarang() {
        return Namabarang;
    }

    public void setNamabarang(String Namabarang) {
        this.Namabarang = Namabarang;
    }

    public String getHargajual() {
        return Hargajual;
    }

    public void setHargajual(String Hargajual) {
        this.Hargajual = Hargajual;
    }
    
    public String getHargabeli() {
        return Hargabeli;
    }

    public void setHargabeli(String Hargabeli) {
        this.Hargabeli = Hargabeli;
    }
    
    public String getSatuan() {
        return Satuan;
    }

    public void setSatuan(String Satuan) {
        this.Satuan = Satuan;
    }

    public String getKategori() {
        return Kategori;
    }

    public void setKategori(String Kategori) {
        this.Kategori = Kategori;
    }   
    public koneksi getDb() {
        return db;
    }

    public void setDb(koneksi db) {
        this.db = db;
    }
public void simpan(){
    String sql="INSERT INTO tablemasterbarang values(null,'"+Namabarang+"','"+Hargajual+"','"+Hargabeli+"','"+Satuan+"','"+Kategori+"')";
    db.simpanData(sql);
  }

public void update(){
    String sql="UPDATE tablemasterbarang SET Namabarang='"+Namabarang+"',Hargajual='"+Hargajual+"',Hargabeli='"+Hargabeli+"',Satuan='"+Satuan+"',Kategori='"+Kategori+"' WHERE Kodebarang='"+Kodebarang+"'";
    db.simpanData(sql);
}
public void hapus(){
     String sql="DELETE FROM tablemasterbarang WHERE Kodebarang='"+Kodebarang+"'";
     db.simpanData(sql);
     System.out.println("");        
}
    public List tampil(){
        List<UserModel>data = new ArrayList<UserModel>();
        ResultSet rs = null;
        
        try{
            String sql = "Select*from tablemasterbarang order by Kodebarang asc";
            rs=db.ambilData(sql);
            while (rs.next()){
                UserModel um = new UserModel();
                um.setKodebarang(rs.getString("Kodebarang"));
                um.setNamabarang(rs.getString("Namabarang"));
                um.setHargajual(rs.getString("Hargajual"));
                um.setHargabeli(rs.getString("Hargabeli"));
                um.setSatuan(rs.getString("Satuan"));
                um.setKategori(rs.getString("Kategori"));
                data.add(um);
            }
            db.diskoneksi(rs);
        }catch (Exception ex){
            System.out.println("Kesalahan saat menampilkan data input"+ex);
        }
        return data;
    }
    /*public List tampil2(){
        List<UserModel>data = new ArrayList<UserModel>();
        ResultSet rs = null;
        
        try{
            String sql = "Select*from table penjualan order by nomor asc";
            rs=db.ambilData(sql);
            while (rs.next()){
                UserModel um = new UserModel();
                um.settanggal(rs.getString("tanggal"));
                um.setnomor(rs.getString("nomor"));
                um.setnama(rs.getString("nama"));
                um.setkode(rs.getString("kode"));

                data.add(um);
            }
            db.diskoneksi(rs);
        }catch (Exception ex){
            System.out.println("Kesalahan saat menampilkan data input"+ex);
        }
        return data;
    }*/
     public List cariID() {
        List<UserModel> data = new ArrayList<UserModel>();
        ResultSet rs = null;
 
        try {
            String sql = "SELECT * FROM tablemasterbarang WHERE ID='"+Kodebarang+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                UserModel m = new UserModel();
                m.setKodebarang(rs.getString("Kodebarang"));
                m.setNamabarang(rs.getString("Namabarang"));
                m.setHargajual(rs.getString("Hargajual"));
                m.setHargabeli(rs.getString("Hargabeli"));
                m.setSatuan(rs.getString("Satuan"));
                m.setKategori(rs.getString("Kategori"));
                data.add(m);
 
            }
            db.diskoneksi(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari Kodebarang" + ex);
        }
        return data;
 
    }


}
