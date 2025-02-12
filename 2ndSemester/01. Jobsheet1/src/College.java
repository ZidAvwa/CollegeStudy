import java.util.Scanner;

public class College {
    public static int x = 0;
    public static String[] course;
    public static int[] sks;
    public static int[] semester;
    public static String[] day;
    public static int total;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many course do you want to take: ");
        total = in.nextInt();

        course = new String[total];
        sks = new int[total];
        semester = new int[total];
        day = new String[total];

        for (int i = 0; i < total; i++) {
            input(i);
        }

        do {
            menu();
        } while (x != 4);
    }

    // untuk mengisi course
    public static void input(int i) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan nama mata kuliah: ");
        course[i] = in.nextLine();

        System.out.print("Masukkan sks: ");
        sks[i] = in.nextInt();

        System.out.print("Masukkan semesternya: ");
        semester[i] = in.nextInt();

        in.nextLine();
        System.out.print("Masukkan nama harinya: ");
        day[i] = in.nextLine();
    }

    // Untuk tampilan menu
    public static void menu() {
        Scanner in = new Scanner(System.in);

        System.out.println("Apa yang ingin cari?");
        System.out.println("1. Jadwal Kuliah");
        System.out.println("2. Cari mata kuliah berdasarkan day");
        System.out.println("3. Cari mata kuliah berdasarkan semester");
        System.out.println("4. Keluar");
        System.out.print("Masukkan nomornya: ");
        x = in.nextInt();

        if (x > 4 || x < 1) {
            if (x != 4) System.out.println("Maaf nomor yang anda pilih tidak ada");
        } else {
            if (x < 4 && x > 0) lanjut(x);
        }
    }

    // Untuk menghitung
    public static void lanjut(int i) {
        switch (i) {
            case 1:
                System.out.println();
                jadwal();
                break;
            case 2:
                bHari();
                break;
            case 3:
                bSemester();
                break;
        }
    }

    // Untuk menampilkan jadwal
    public static void jadwal() {
        for (int i = 0; i < total; i++) {
            System.out.printf("Mata Kuliah: %s\nSKS: %d\nSemester: %d\nHari: %s\n", course[i], sks[i], semester[i], day[i]);
            System.out.println();
        }
    }

    // untuk menampilkan berdasarkan day
    public static void bHari() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan day: ");
        String cHari = in.nextLine();

        for (int i = 0; i < total; i++) {
            if (cHari.equals(day[i])) {
                System.out.print(course[i] + " ");
            }
        }
        System.out.println();
    }

    // untuk menampilkan berdasarkan semester
    public static void bSemester() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan semester: ");
        int cSemester = in.nextInt();

        for (int i = 0; i < total; i++) {
            if (cSemester == semester[i]) {
                System.out.print(course[i] + " ");
            }
        }
        System.out.println();
    }
}