package controller;

import Model.Member;
import com.mysql.jdbc.Connection;
import database.database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;

public class memberCont {
    public void save(Member member){
        try {
            Connection con =  database.getConnection();
            String sql = "INSERT INTO member(id_member,nama,gender,umur,jabatan,tgl_bergabung) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, member.getId());
            ps.setString(2, member.getNama());
            ps.setString(3, member.getGender());
            ps.setInt(4, member.getUmur());
            ps.setString(5, member.getJabatan());
            ps.setString(6, member.getTgl_bergabung());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    public void del(Member member){
       try {
            Connection con = database.getConnection();
            String sql = "delete from member  WHERE nama=?";
            PreparedStatement ps = con.prepareStatement(sql);  
            ps.setString(1, member.getNama());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        } 
    }
    public List<Member> list() {
        List<Member> list = new ArrayList<Member>();
        try {
            Connection con = database.getConnection();
            String sql = "SELECT * FROM member";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Member member = new Member(rs.getString("id_member"),rs.getString("nama"), rs.getString("gender"), rs.getInt("umur"), rs.getString("jabatan"), rs.getString("tgl_bergabung"));
                list.add(member);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return list;
    }
    
    public Member get(String id_member) {
        Member member = new Member();
        try {
            Connection con = database.getConnection();
            String sql = "SELECT * FROM member WHERE id_member=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id_member);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                member.setId(rs.getString("id_member"));
                member.setNama(rs.getString("nama"));
                member.setGender(rs.getString("gender"));
                member.setUmur(rs.getInt("umur"));
                member.setJabatan(rs.getString("jabatan"));
                member.setBergabung(rs.getString("tgl_bergabung"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return member;
    }
}
