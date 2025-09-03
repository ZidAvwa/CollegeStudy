import java.util.ArrayList; //UAS
import java.util.Scanner;

public class TransaksiLayanan {
    private static LinkedList.PasienLinkedList antrianPasien = new LinkedList.PasienLinkedList();
    private static QueueTransaksi riwayatTransaksi = new QueueTransaksi();

    private static ArrayList<Pasien> subAntrianList = new ArrayList<>(); //UAS

    Pasien pasien;
    Dokter dokter;
    int durasiLayanan;
    int biaya;

    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = hitungBiaya();
    }

    public int hitungBiaya() {
        return durasiLayanan * 50000;
    }

    public void tampilkanTransaksi() {
        System.out.println(
            "-- Riwayat Transaksi -- \n Daftar Transaksi: \n" +
            pasien.nama + "(" + durasiLayanan + " Jam): Rp" + biaya
        );
    }

    public static void tambahPasien(Scanner scanner) {
        System.out.print("Nama Pasien: ");
        String nama = scanner.nextLine();
        System.out.print("NIK: ");
        String nik = scanner.nextLine();
        System.out.print("Keluhan: ");
        String keluhan = scanner.nextLine();

        Pasien pasien = new Pasien(nama, nik, keluhan);
        antrianPasien.enqueue(pasien);
        System.out.println(">> Pasien berhasil ditambahkan ke antrian.");
    }

    public static void lihatAntrian() {
        if (antrianPasien.isEmpty()) {
            System.out.println(">> Antrian kosong.");
        } else {
            antrianPasien.printQueue();
        }
    }

    public static void layaniPasien(Scanner scanner) {
        if (antrianPasien.isEmpty()) {
            System.out.println(">> Tidak ada pasien dalam antrian.");
            return;
        }

        System.out.println("Pasien " + antrianPasien.head.data.nama + " dipanggil.");
        Pasien pasien = antrianPasien.dequeue();
        System.out.print("Masukkan ID Dokter: ");
        String idDokter = scanner.nextLine();
        System.out.print("Masukkan Nama Dokter: ");
        String namaDokter = scanner.nextLine();
        System.out.print("Masukkan Durasi Layanan (jam): ");
        int durasi = scanner.nextInt();
        scanner.nextLine();

        Dokter dokter = new Dokter(idDokter, namaDokter);
        TransaksiLayanan transaksi = new TransaksiLayanan(pasien, dokter, durasi);
        riwayatTransaksi.addTransaction(transaksi);

        System.out.println(">> Pasien berhasil dilayani dan transaksi dicatat.");
    }

    public static void cekSisaAntrian() {
        System.out.println(">> Sisa pasien dalam antrian: " + antrianPasien.size());
    }

    public static void lihatRiwayat() {
        riwayatTransaksi.printTransactions();
    }

    public static void tampilkanAntrian(Scanner scanner) { // UAS
        System.out.print("Masukkan indeks awal: ");
        int awal = scanner.nextInt();
        System.out.print("Masukkan indeks akhir: ");
        int akhir = scanner.nextInt();
        scanner.nextLine();

        if (awal < 1 || akhir > antrianPasien.size() || awal > akhir) {
            System.out.println("Indeks tidak valid.");
            return;
        }
        for (int i = awal - 1; i < akhir; i++) {
            if (i < antrianPasien.size()) {
                subAntrianList.add(antrianPasien.get(i));
            }
        }

        if (subAntrianList.isEmpty()) {
            System.out.println("Tidak ada pasien dalam rentang indeks tersebut.");
        } else {
            System.out.println("-- Antrian Pasien dari Indeks " + awal + " hingga " + akhir + " --");
            for (Pasien pasien : subAntrianList) {
                pasien.tampilkanInformasi();
            }
        }
    }

    
}
