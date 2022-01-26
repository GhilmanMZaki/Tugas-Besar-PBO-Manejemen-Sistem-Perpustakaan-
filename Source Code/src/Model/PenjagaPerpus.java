package Model;

public class PenjagaPerpus extends User{
    private String username, password;
    
    public PenjagaPerpus(String id, String nama, String username, String password){
        super(id, nama);
        setUsername(username);
        setPassword(password);
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void tambahBuku(){

    }
            
    public void info(){
        
    }
}
