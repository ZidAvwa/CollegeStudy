public class Televisi {
    public String merek;
    public int jumlahChannel;
    private int channelAktif;

    public Televisi() {
        this.merek = "Tidak diketahui";
        this.jumlahChannel = 0;
        this.channelAktif = 1;
    }

    public void pindahChannel(int channelBaru) {
        if (channelBaru > 0 && channelBaru <= jumlahChannel) {
            channelAktif = channelBaru;
            System.out.println("Channel berpindah ke: " + channelAktif);
        } else {
            System.out.println("Channel tidak tersedia!");
        }
    }

    public int getChannelAktif() {
        return channelAktif;
    }
}
