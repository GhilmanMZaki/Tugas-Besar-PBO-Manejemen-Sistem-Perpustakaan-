
package Model;

public abstract class User {
    private String id, nama;
    
    public User(String id, String nama){
        setId(id);
        setNama(nama);
    }
    public User(){
        
    }
    public void setId(String id){
        this.id = id;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getNama(){
        return this.nama;
    }
    abstract void info();
}
