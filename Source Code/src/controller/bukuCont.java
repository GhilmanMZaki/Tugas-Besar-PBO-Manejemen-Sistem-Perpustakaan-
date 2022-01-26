package controller;

import Model.Buku;
import database.database;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class bukuCont {
    public void save(Buku buku){
        try {
            Connection con =  database.getConnection();
            String sql = "INSERT INTO buku(ISBN,judul,penulis,jenis_buku,jml_halaman,stock) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buku.getISBN());
            ps.setString(2, buku.getJudul());
            ps.setString(3, buku.getPenulis());
            ps.setString(4, buku.getJenisBuku());
            ps.setInt(5, buku.getJumlahHalaman());
            ps.setInt(6, buku.getStock());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    public void addStock(Buku buku){
        try {
            Connection con =  database.getConnection();
            String sql = "UPDATE buku SET stock=? WHERE ISBN=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, buku.getStock());
            ps.setString(2, buku.getISBN());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    public void del(Buku buku){
        try {
            Connection con = database.getConnection();
            String sql = "delete from buku  WHERE judul=?";
            PreparedStatement ps = con.prepareStatement(sql);  
            ps.setString(1, buku.getJudul());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    public List<Buku> list() {
        List<Buku> list = new ArrayList<Buku>();
        try {
            Connection con = database.getConnection();
            String sql = "SELECT * FROM buku ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
 
            while(rs.next()){
                Buku buku = new Buku(rs.getString("ISBN"),rs.getString("judul"), rs.getString("penulis"), rs.getString("jenis_buku"), rs.getInt("jml_halaman"), rs.getInt("stock"));
                list.add(buku);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return list;
    }
    public Buku get(String isbn) {
        Buku buku = new Buku();
        try {
            Connection con = database.getConnection();
            String sql = "SELECT * FROM buku WHERE isbn=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, isbn);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                buku.setISBN(rs.getString("ISBN"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setJenisBuku(rs.getString("jenis_buku"));
                buku.setjumlahhalaman(rs.getInt("jml_halaman"));
                buku.setStock(rs.getInt("stock"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return buku;
    }
    public Buku getStock(String judul) {
        Buku buku = new Buku();
        try {
            Connection con = database.getConnection();
            String sql = "SELECT * FROM buku WHERE judul=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, judul);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                buku.setISBN(rs.getString("ISBN"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setJenisBuku(rs.getString("jenis_buku"));
                buku.setjumlahhalaman(rs.getInt("jml_halaman"));
                buku.setStock(rs.getInt("stock"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return buku;
    }
}