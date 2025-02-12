import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner zs = new Scanner(System.in);
        double tugas, kuis, uts, uas, hasil;
        String nilaiHuruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===========================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = zs.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = zs.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        uts = zs.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        uas = zs.nextDouble();
        System.out.println("===========================");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("===========================");
            System.out.println("Nilai tidak valid.");
            System.out.println("===========================");
            return; 
        }

        hasil = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);

        if (hasil > 80 && hasil <= 100) nilaiHuruf = "A";
        else if (hasil > 73 && hasil <= 80) nilaiHuruf = "B+";
        else if (hasil > 65 && hasil <= 73) nilaiHuruf = "B";
        else if (hasil > 60 && hasil <= 65) nilaiHuruf = "C+";
        else if (hasil > 50 && hasil <= 60) nilaiHuruf = "C";
        else if (hasil > 39 && hasil <= 50) nilaiHuruf = "D";
        else nilaiHuruf = "E";

        System.out.println("===========================");
        System.out.printf("Nilai akhir: %.1f\n", hasil);
        System.out.printf("Nilai huruf: %s\n", nilaiHuruf);
        System.out.println("===========================");

        System.out.println("===========================");
        if (hasil > 50) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("MAAF ANDA TIDAK LULUS");
        }
    }
}