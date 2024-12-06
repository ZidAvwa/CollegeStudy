import java.util.Scanner;

public class KRSGroup06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] studentNameArr = new String[10];
        String[] nimArr = new String[10];
        int[] sksHourArr = new int[10];
        String[] matkulCodeArr = new String[10];
        String[] matkulNameArr = new String[10];
        
        String matkulCode = "";
        String matkulName = "";
        String nim = "";
        String name = "";
        
        int sks = 0;
        int counter = 0;
        int sksLimit = 24;
        int menu;
        
        while (true) {
            System.out.println("=== Sistem Pemantauan KRS Mahasiswa ===");
            System.out.println("1. Tambah Data KRS");
            System.out.println("2. Tampilan Daftar KRS Mahasiswa");
            System.out.println("3. Analisis Data KRS");
            System.out.println("4. Keluar");
            System.out.print("Choose option: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    counter = sksIdentity(sc, studentNameArr, nimArr, sksHourArr, matkulCodeArr, matkulNameArr, sksLimit, nim, matkulCode, matkulName, sks, counter, name);
                    break;
                case 2:
                    studentsSKSList(studentNameArr, nimArr, matkulCodeArr, matkulNameArr, sksHourArr);
                    break;
                case 3:
                    analyzeKRS(studentNameArr, nimArr, sksHourArr, counter);
                    break;
                case 4:
                    System.out.println("Thank you!");
                    return;
            }
        }
    }

    public static int sksIdentity(Scanner sc, String[] studentNameArr, String[] nimArr, int[] sksHourArr,
            String[] matkulCodeArr, String[] matkulNameArr, int sksLimit, String nim, String matkulCode,
            String matkulName, int sks, int counter, String name) {
        int totSks = 0;
        System.out.print("Student Name: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("NIM: ");
        nim = sc.nextLine();

        for (int i = 0; i < counter; i++) {
            if (nimArr[i].equals(nim)) {
                totSks += sksHourArr[i];
            }
        }

        while (totSks < sksLimit) {
            System.out.print("Mata Kuliah code: ");
            matkulCode = sc.nextLine();
            System.out.print("Mata Kuliah Name: ");
            matkulName = sc.nextLine();
            System.out.print("SKS total (1 - 3): ");
            sks = sc.nextInt();
            sc.nextLine();

            if (sks > 3 || sks < 1) {
                System.out.println("Invalid input. SKS must between 1 - 3.");
                continue;
            }

            if (totSks + sks > sksLimit) {
                System.out.println("The total of SKS exceeds the limit of 24.");
                break;
            }
            studentNameArr[counter] = name;
            nimArr[counter] = nim;
            matkulCodeArr[counter] = matkulCode;
            matkulNameArr[counter] = matkulName;
            sksHourArr[counter] = sks;

            counter++;
            totSks += sks;

            System.out.println("Mata kuliah data added successfully.");
            System.out.print("Add another mata kuliah? (y/n): ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("n")) {
                System.out.println("Total SKS: " + totSks);
                break;
            }
        }
        System.out.println();
        return counter;
    }

    public static void studentsSKSList(String[] studentNameArr, String[] nimArr, String[] matkulCodeArr,
            String[] matkulNameArr, int[] sksHourArr) {
        Scanner sc = new Scanner(System.in);
        String nim = "";
        int totalSks = 0;

        System.out.println("--- Tampilkan Daftar KRS Masiswa ---");
        System.out.print("Input NIM: ");
        nim = sc.nextLine();

        System.out.println(String.format("%-15s%-20s%-10s%-30s%-10s", "NIM", "Name", "Kode MK", "Mata Kuliah Name", "SKS"));
        boolean found = false;
        for (int i = 0; i < nimArr.length; i++) {
            if (nimArr[i] != null && nimArr[i].equals(nim)) {
                System.out.println(String.format("%-15s%-20s%-10s%-30s%-10d", nimArr[i], studentNameArr[i], matkulCodeArr[i], matkulNameArr[i], sksHourArr[i]));
                totalSks += sksHourArr[i];
                found = true;
            }
        }
        
        if (found) {
            System.out.println("Total SKS: " + totalSks); 
        } else {
            System.out.println("No KRS data for this NIM.");
        }
        System.out.println();
    }

    public static void analyzeKRS(String[] studentNameArr, String[] nimArr, int[] sksHourArr, int counter) {
        int studentsLessThan20Sks = 0;

        for (int i = 0; i < counter; i++) {
            String studentNim = nimArr[i];
            int totalSks = 0;

            for (int j = 0; j < counter; j++) {
                if (nimArr[j].equals(studentNim)) {
                    totalSks += sksHourArr[j];
                }
            }

            if (totalSks < 20) {
                studentsLessThan20Sks++;
            }
        }
        System.out.println("Jumlah mahasiswa yang mengambil SKS kurang dari 20: " + studentsLessThan20Sks);
        System.out.println();
    }
}