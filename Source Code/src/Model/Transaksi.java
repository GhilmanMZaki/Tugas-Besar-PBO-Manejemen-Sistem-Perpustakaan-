
package Model;

public class Transaksi implements Info{
    private String pinjam, kembali, status,id_transaksi,id_member,isbn, judul, member;
    
    public Transaksi(){
        
    }
    public Transaksi(String id_transaksi, String id_member, String isbn, String judul, String member, String pinjam, String kembali, String status ){
        this.id_transaksi = id_transaksi;
        this.id_member = id_member;
        this.isbn = isbn;
        this.judul = judul;
        this.member = member;
        this.pinjam = pinjam;
        this.kembali = kembali;
        this.status = status;
    }
    public Transaksi(Buku buku, Member member){
        this.id_member = member.getId();
        this.isbn = buku.getISBN();
        this.judul = buku.getJudul();
        this.member = member.getNama();
    }
    
    public void setID_transaksi( String id_transaksi ){
        this.id_transaksi = id_transaksi;
    }
    
    public void setID_member( String id_member ){
        this.id_member = id_member;
    }
    
    public void setisbn( String isbn ){
        this.isbn = isbn;
    }
    
    public void setpinjam( String pinjam ){
        this.pinjam = pinjam;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    
    public void setMember(String member){
        this.member = member;
    }
    
    public void setkembali( String kembali ){
        this.kembali = kembali;
    }
    
    public void setStatus( String status ){
        this.status = status;
    }
    
    public String getID_transaksi(){
        return id_transaksi;
    }
    
    public String getID_member(){
        return id_member;
    }
    
    public String getisbn(){
        return isbn;
    }

    public String getMember() {
        return member;
    }

    public String getJudul() {
        return judul;
    }
    
    public String getPinjam(){
        return pinjam;
    }
    
    public String getKembali(){
        return kembali;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void info() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

