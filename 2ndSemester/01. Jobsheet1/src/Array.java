import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner zs = new Scanner(System.in);

        String courseName[] = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        double numberGrade[]= new double[courseName.length];
        double bobotSKS[]  = new double[courseName.length];

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester ");
        System.out.println("==============================");

        for (int i = 0; i < courseName.length; i++) {
            System.out.printf("Masukkan Nilai Angka untuk MK %s: ", courseName[i]);
            numberGrade[i] = zs.nextDouble();
            bobotSKS[i] = toBobot(numberGrade[i]);
        }

        System.out.println("\n==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-40s %-12s %-12s %-12s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobot = 0;
        for (int i = 0; i < courseName.length; i++) {
            String letterGrade = toLetterGrade(numberGrade[i]);
            totalBobot += bobotSKS[i];
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n", courseName[i], numberGrade[i], letterGrade, bobotSKS[i]);
        }

        double ip = totalBobot / courseName.length;
        System.out.println("==============================");
        System.out.printf("IP: %.2f\n", ip);
    }

    public static String toLetterGrade(double n) {
        if (n > 80 && n <= 100) return "A";
        else if (n > 73 && n <= 80) return "B+";
        else if (n > 65 && n <= 73) return "B";
        else if (n > 60 && n <= 65) return "C+";
        else if (n > 50 && n <= 60) return "C";
        else if (n > 39 && n <= 50) return "D";
        else return "E";
    }

    public static double toBobot(double n) {
        if (n > 80 && n <= 100) return 4.00;
        else if (n > 73 && n <= 80) return 3.50;
        else if (n > 65 && n <= 73) return 3.00;
        else if (n > 60 && n <= 65) return 2.50;
        else if (n > 50 && n <= 60) return 2.00;
        else if (n > 39 && n <= 50) return 1.00;
        else return 0.00;
    }
}