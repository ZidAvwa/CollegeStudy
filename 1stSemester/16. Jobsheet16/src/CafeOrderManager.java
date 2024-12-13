import java.util.Scanner;

public class CafeOrderManager {
    public static void main(String[] args) throws Exception {
        Scanner zs = new Scanner(System.in);
        String nama[][] = new String[100][1000];
        String namaPelanggan;
        int nomorMeja;
        while (true) {
            System.out.println("\n=====MENU UTAMA=====");
            System.out.println("1. Tambahkan Pesanan");
            System.out.println("2. Tampilkan Daftar Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            String input = zs.nextLine();
            int menu = 0;
            if (input.matches("-?\\d+")) {
                menu = Integer.parseInt(input); // Convert the string to an integer
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
            }

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama pelanggan: ");
                        namaPelanggan = zs.nextLine().trim(); // trim is to remove spaces before and after the line,
                        // exmaple: " item "
                        if (!input.isEmpty()) {
                            break;
                        } else {
                            System.out.println("Empty input. Please enter a value.");
                        }
                    }
                    while (true) {
                        System.out.print("Masukkan nomor meja: ");
                        input = zs.nextLine();
                        if (input.matches("-?\\d+")) {
                            nomorMeja = Integer.parseInt(input); // Convert the string to an integer
                            break;
                        } else {
                            System.out.println("Invalid input. Please enter a valid number.");
                        }
                    }
                    nama[nomorMeja][0] = namaPelanggan;
                    menuKafe(zs, nama, nomorMeja);
                    break;
                case 2:
                    daftarPesanan(nama);
                    break;
                default:
                    break;
            }
        }
    }

    public static void menuKafe(Scanner zs, String nama[][], int nomorMeja) {
        System.out.println("===== MENU KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15000");
        System.out.println("2. Latte - Rp 22000");
        System.out.println("3. Teh Tarik - 12000");
        System.out.println("4. Mie Goreng - Rp 18000");
        while (true) {
            System.out.print("\nPilih menu (masukkan nomor menu, atau 0 untuk selesai): ");
            int choice = zs.nextInt();
            String menuChoice = "";
            if (choice == 1) {
                menuChoice = "Kopi Hitam";
            } else if (choice == 2) {
                menuChoice = "Latte";
            } else if (choice == 3) {
                menuChoice = "Teh Tarik";
            } else if (choice == 4) {
                menuChoice = "Mie Goreng";
            } else if (choice == 0) {
                break;
            }
            System.out.print("Masukkan jumlah item untuk " + menuChoice + ": ");
            int jumlahItem = zs.nextInt();
            for (int i = 0; i < nama[nomorMeja].length; i++) {
                if (nama[nomorMeja][i] == null) {
                    nama[nomorMeja][i] = menuChoice;
                }
            }
        }
    }

    public static void daftarPesanan(String nama[][]) {
        for (int i = 0; i < nama.length; i++) {
            if (nama[i] != null) {
                System.out.println(nama[i] + " " + i);
            }
            for (int j = 0; j < nama[i].length; j++) {
                System.out.println();
            }
        }
    }
}
