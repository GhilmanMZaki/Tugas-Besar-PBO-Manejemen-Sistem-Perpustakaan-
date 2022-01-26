package controller;

import Model.Buku;
import Model.Member;
import Model.Transaksi;
import com.mysql.jdbc.Connection;
import database.database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;

public class transaksiCont {
    public void save(Transaksi transaksi){
        try {
            Connection con =  database.getConnection();
            String sql = "INSERT INTO Transaksi(ISBN,id_member,judul,nama,tgl_peminjaman,tgl_pengembalian,status) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, transaksi.getisbn());
            ps.setString(2, transaksi.getID_member());
            ps.setString(3, transaksi.getJudul());
            ps.setString(4, transaksi.getMember());
            ps.setString(5, transaksi.getPinjam());
            ps.setString(6, transaksi.getKembali());
            ps.setString(7, transaksi.getStatus());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    public List<Transaksi> list() {
        List<Transaksi> list = new ArrayList<Transaksi>();
        try {
            Connection con = database.getConnection();
            String sql = "SELECT * FROM transaksi ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
 
            while(rs.next()){
                Transaksi transaksi = new Transaksi(rs.getString("id_transaksi"),rs.getString("ISBN"), rs.getString("id_member"),rs.getString("judul"), 
                                               rs.getString("nama"), rs.getString("tgl_peminjaman"), rs.getString("tgl_pengembalian"), rs.getString("status"));
                list.add(transaksi);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return list;
    }
    public void Update(Transaksi trans){
        try {
            Connection con =  database.getConnection();
            String sql = "UPDATE transaksi SET tgl_pengembalian=?, status=? WHERE ISBN=? AND id_member=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, trans.getKembali());
            ps.setString(2, trans.getStatus());
            ps.setString(3, trans.getisbn());
            ps.setString(4, trans.getID_member());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    public Transaksi get(String isbn, String id_member) {
        Transaksi trans = new Transaksi();
        try {
            Connection con = database.getConnection();
            String sql = "SELECT * FROM transaksi WHERE isbn=? AND id_member=? AND status=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, isbn);
            ps.setString(2, id_member);
            ps.setString(3, "On Going");
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                trans.setID_transaksi(rs.getString("id_transaksi"));
                trans.setisbn(rs.getString("ISBN"));
                trans.setID_member(rs.getString("id_member"));
                trans.setJudul(rs.getString("judul"));
                trans.setMember(rs.getString("nama"));
                trans.setpinjam(rs.getString("tgl_peminjaman"));
                trans.setkembali(rs.getString("tgl_pengembalian"));
                trans.setStatus(rs.getString("status"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return trans;
    }
}
