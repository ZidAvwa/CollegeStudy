public class TestNasabah {
    public static void main(String[] args) {
        // Nasabah anton = new Nasabah();
        Nasabah nas = new Nasabah("11556677", "Nikiloe Tesla", 900000);
        System.out.println("Nomor rekening: " + nas.getNomorRekening());
        System.out.println("Nama: " + nas.getNama());
        System.out.println("Saldo: " + nas.getSaldo());

        // anton.setNomorRekening("1123123");
        // anton.setNama("Anton Kemang");
        // anton.setor(10000);

        // System.out.println("Saldo " + anton.getNama() + " saat ini: Rp " + anton.getSaldo());

        // anton.tarik(5000);

        // System.out.println("Saldo " + anton.getNama() + " saat ini: Rp " + anton.getSaldo());
    }
}
