import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan No KTP: ");
        String noKtp = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Limit Pinjaman: ");
        int limitPinjaman = scanner.nextInt();

        Anggota donny = new Anggota(noKtp, nama, limitPinjaman);

        while (true) {
            System.out.println("=== Menu Koperasi ===");
            System.out.println("1. Pinjam");
            System.out.println("2. Angsur");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 3:
                    break;
                case 1:
                    System.out.print("Masukkan Jumlah Pinjaman: ");
                    int jumlahPinjam = scanner.nextInt();
                    donny.pinjam(jumlahPinjam);
                    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                    break;
                case 2:
                    System.out.print("Masukkan Jumlah Angsuran: ");
                    int jumlahAngsur = scanner.nextInt();
                    donny.angsur(jumlahAngsur);
                    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }   
        }
    }
}
