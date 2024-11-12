import java.util.Scanner;
public class SIAKAD25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, kualifikasi, nilaiAkhirHuruf;
        char kelas;
        byte absen;
        int nim, nilaiKuis, nilaiTugas, nilaiUjian;
        double nilaiAkhir = 0;
        
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextInt();
        System.out.print("Masukkan kelas: ");
        kelas = sc.next().charAt(0);
        System.out.print("Masukkan absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextInt();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextInt();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextInt();
        
        nilaiAkhir = (nilaiKuis+nilaiTugas+nilaiAkhir)/3;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            kualifikasi = "Sangat Baik";
            nilaiAkhirHuruf = "A";
        }
        else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            kualifikasi = "Lebih dari Baik";
            nilaiAkhirHuruf = "B+";
        }
        else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            kualifikasi = "Baik";
            nilaiAkhirHuruf = "B";
        }
        else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            kualifikasi = "Lebih dari Cukup";
            nilaiAkhirHuruf = "C+";
        }
        else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            kualifikasi = "Cukup";
            nilaiAkhirHuruf = "C";
        }
        else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            kualifikasi = "Kurang";
            nilaiAkhirHuruf = "D";
        }
        else {
            kualifikasi = "gagal";
            nilaiAkhirHuruf = "E";
        }
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim+") kelas "+kelas+" nomor absen "+absen);
        System.out.println("Nilai Akhir: "+nilaiAkhir);
        System.out.println("Nilai Akhir Huruf: "+nilaiAkhirHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}