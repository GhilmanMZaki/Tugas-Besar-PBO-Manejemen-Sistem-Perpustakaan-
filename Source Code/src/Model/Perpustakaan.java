
package Model;

import java.util.ArrayList;

public class Perpustakaan {
    private String nama;
    private String alamat;
    private PenjagaPerpus penjagaPerpus;
    private ArrayList<Buku> listBuku = new ArrayList<Buku>();
    private ArrayList<Member> listMember = new ArrayList<Member>();
    
    
    public Perpustakaan(String nama, String alamat, String id, String namaP, String username, String password){
        this.nama = nama;
        this.alamat = alamat;
        this.penjagaPerpus = new PenjagaPerpus(id, namaP, username, password);
    }
    
    public void setNama( String nama ){
        this.nama = nama;
    }
    
    public void setAlamat( String alamat ){
        this.alamat = alamat;
    }
    
    public void setlistbuku( Buku buku ){
        this.listBuku.add(buku);
    }
    
    public void setListAnggota( Member member ){
        this.listMember.add(member);
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    public PenjagaPerpus getPenjagaPerpus(){
        return penjagaPerpus;
    }
    
    public ArrayList<Buku> getListBuku(){
        return listBuku;
    }
    
    public ArrayList<Member> getListMember(Member member){
        return listMember;
    }
}
