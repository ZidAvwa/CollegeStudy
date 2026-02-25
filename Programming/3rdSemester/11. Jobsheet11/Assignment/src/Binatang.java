public abstract class Binatang {
    protected String nama;
    protected int jmlKaki;

    public Binatang(String nama, int jmlKaki) {
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }

    public void setNama(String nama) { this.nama = nama; }
    public String getNama() { return nama; }
    public int getKaki() { return jmlKaki; }
    
    public abstract void displayBinatang(); 
}