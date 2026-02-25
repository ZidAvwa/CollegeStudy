public class TelevisiModern extends Televisi {
    private String modusTampilan;
    private String dvd;

    public TelevisiModern(String mrk, int jmlChannel) {
        this.merek = mrk;
        this.jumlahChannel = jmlChannel;
        this.modusTampilan = "TV";
        this.dvd = "";
    }

    public void gantiModusTampilan(String modus) {
        this.modusTampilan = modus;
        System.out.println("Modus tampilan diganti ke: " + modusTampilan);
    }

    public void masukkanDVD(String judulDVD) {
        this.dvd = judulDVD;
        System.out.println("DVD \"" + dvd + "\" dimasukkan.");
    }

    public void mainkanDVD() {
        if (!dvd.isEmpty()) {
            System.out.println("Memutar DVD: " + dvd);
        } else {
            System.out.println("Tidak ada DVD yang dimasukkan!");
        }
    }
}
