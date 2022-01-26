package Model;

import java.util.ArrayList;

public class Member extends User{
    private String gender, jabatan, tgl_bergabung;
    private int umur;
    private ArrayList<Buku> listBuku = new ArrayList<Buku>();
    
    public Member(String id, String nama, String gender, int umur, String jabatan, String tgl_bergabung){
        super(id, nama);
        setGender(gender);
        setUmur(umur);
        setJabatan(jabatan);
        setBergabung(tgl_bergabung);
        
    }
    public Member(){
        
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    public void setBergabung(String tgl_bergabung){
        this.tgl_bergabung = tgl_bergabung;
    }
    public void setListBuku(Buku buku){
        this.listBuku.add(buku);
    }

    public String getGender() {
        return gender;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getTgl_bergabung() {
        return tgl_bergabung;
    }

    public int getUmur() {
        return umur;
    }
    
    public ArrayList<Buku> getListBuku(){
        return listBuku;
    }
    
    @Override
    public void info(){
        
    }
}
