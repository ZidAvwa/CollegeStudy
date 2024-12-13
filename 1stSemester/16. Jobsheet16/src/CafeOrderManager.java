import java.util.Scanner;

public class CafeOrderManager {
    public static void main(String[] args){
        Scanner zs = new Scanner(System.in);
        String[][] orders = new String[100][10];
        int[][] prices = new int[100][10]; // Array to store prices for each order
        String[] customerNames = new String[100];
        while (true) {
            System.out.println("\n=====MENU UTAMA=====");
            System.out.println("1. Tambahkan Pesanan");
            System.out.println("2. Tampilkan Daftar Pesanan");
            System.out.println("3. Keluar");
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
                    menuKafe(zs, orders, prices, customerNames, 0);
                    break;
                case 2:
                    daftarPesanan(orders, prices, customerNames);
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }
    }

    public static void menuKafe(Scanner zs, String[][] nama, int[][] prices, String[] customerNames, int nomorMeja) {
        System.out.print("Masukkan nama pelanggan: ");
        String inputNama = zs.nextLine(); // Store customer name for the table
        System.out.print("Masukkan nomor meja: ");
        nomorMeja = zs.nextInt();
        customerNames[nomorMeja] = inputNama;
        System.out.println("\n===== MENU KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15000");
        System.out.println("2. Latte - Rp 22000");
        System.out.println("3. Teh Tarik - Rp 12000");
        System.out.println("4. Mie Goreng - Rp 18000");

        while (true) {
            System.out.print("\nPilih menu (masukkan nomor menu, atau 0 untuk selesai): ");
            int choice = zs.nextInt();
            zs.nextLine(); // Consume newline
            String menuChoice = "";
            int price = 0;

            // Check the menu choice
            if (choice == 1) {
                menuChoice = "Kopi Hitam";
                price = 15000;
            } else if (choice == 2) {
                menuChoice = "Latte";
                price = 22000;
            } else if (choice == 3) {
                menuChoice = "Teh Tarik";
                price = 12000;
            } else if (choice == 4) {
                menuChoice = "Mie Goreng";
                price = 18000;
            } else if (choice == 0) {
                break;
            } else {
                System.out.println("Menu tidak valid. Silakan coba lagi.");
                continue;
            }

            // Get quantity of items
            System.out.print("Masukkan jumlah item untuk " + menuChoice + ": ");
            int jumlahItem = zs.nextInt();
            zs.nextLine(); // Consume newline

            // Store the order and price in the arrays
            boolean stored = false;
            for (int i = 0; i < nama[nomorMeja].length; i++) {
                if (nama[nomorMeja][i] == null) {
                    nama[nomorMeja][i] = menuChoice + " x" + jumlahItem;
                    prices[nomorMeja][i] = price * jumlahItem; // Calculate total price for the order
                    stored = true;
                    break;
                }
            }
            // Check if the array is full
            if (!stored) {
                System.out.println("Pesanan penuh untuk meja ini. Tidak dapat menambahkan item lagi.");
            }
        }
    }

    // Method to display all orders with prices and total cost
    public static void daftarPesanan(String[][] nama, int[][] prices, String[] customerNames) {
        System.out.println("\n===== DAFTAR PESANAN =====");
        boolean hasOrders = false; // Track if there are any orders overall

        for (int i = 0; i < nama.length; i++) {
            boolean hasOrderForTable = false; // Track if the current table has any orders
            int totalHarga = 0; // Total cost for this table

            for (int j = 0; j < nama[i].length; j++) {
                if (nama[i][j] != null) {
                    hasOrderForTable = true;
                    break; // No need to check further; we know this table has orders
                }
            }

            if (hasOrderForTable) {
                hasOrders = true;
                String customerName = (customerNames[i] != null) ? customerNames[i] : "Unknown"; // Handle null names
                System.out.println("Nama Pelanggan: " + customerName);
                System.out.println("Nomor Meja: " + (i+1));
                for (int j = 0; j < nama[i].length; j++) {
                    if (nama[i][j] != null) {
                        System.out.println("  - " + nama[i][j] + " = Rp " + prices[i][j]);
                        totalHarga += prices[i][j]; // Add item price to the total
                    }
                }
                System.out.println("Total Harga Pesanan: Rp " + totalHarga);
                System.out.println("--------------------------------------");
            }
        }
        if (!hasOrders) {
            System.out.println("Tidak ada pesanan di semua meja.");
        }
    }

    
}
