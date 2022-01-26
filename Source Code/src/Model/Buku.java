
package Model;


public class Buku implements Info{
    private String isbn;
    private String judul;
    private String penulis;
    private String jenisbuku;
    private int jmlhal;
    private int stock;
    
    public Buku(){
        
    }
    public Buku(String isbn, String judul, String penulis, String jenisbuku, int jmlhal, int stock){
        this.isbn = isbn;
        this.judul = judul;
        this.penulis = penulis;
        this.jenisbuku = jenisbuku;
        this.jmlhal = jmlhal;
        this.stock = stock;
    }
    
    public void setISBN( String id ){
        this.isbn = id;
    }
    
    public void setJudul( String judul ){
        this.judul = judul;
    }
    
    public void setPenulis( String penulis ){
        this.penulis = penulis;
    }
    
    public void setjumlahhalaman( int jmlhal ){
        this.jmlhal = jmlhal;
    }
    
    public void setJenisBuku(String jenisbuku){
        this.jenisbuku = jenisbuku;
    }
    
    public void setStock( int stock ){
        this.stock = stock;
    }
    
    public String getISBN(){
        return this.isbn;
    }
    
    public String getJudul(){
        return this.judul;
    }
    
    public String getPenulis(){
        return this.penulis;
    }
    
    public int getJumlahHalaman(){
        return this.jmlhal;
    }
    
    public String getJenisBuku(){
        return this.jenisbuku;
    }
    
    public int getStock(){
        return this.stock;
    }

    @Override
    public void info() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
