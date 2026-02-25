public class Nasabah {
    private String nomorRekening;
    private String nama;
    private int saldo = 0;

    public Nasabah(String norekAwal, String namaAwal, int saldoAwal) {
        nomorRekening = norekAwal;
        nama = namaAwal;
        saldo = saldoAwal;
    }
    
    public void setNomorRekening(String norek) {
        nomorRekening = norek;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public void setNama(String nm) {
        nama = nm;
    }

    public String getNama() {
        return nama;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setor(int nominal) {
        saldo += nominal;
    }

    public void tarik(int nominal) {
        saldo -= nominal;
    }
}
