import java.util.Scanner;
public class JTICafe26 {
    public static void main(String[] args) {
        Scanner zs = new Scanner(System.in);
        String member, qris;
        int potongan = 1000, pilihan_menu;
        double total_bayar = 0, diskon, harga = 0;

        System.err.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.err.println("-------------------------");
        System.out.println("1. Rice Bowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Rice Bowl + Ice Tea)");
        System.out.println("-----------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = zs.nextInt();
        zs.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = zs.nextLine();
        System.out.print("Apakah menggunakan Qris (y/n) ? = ");
        qris = zs.nextLine();
        System.out.println("-----------------------------------");
        
        if (qris.equalsIgnoreCase("y")){
            if (member.equalsIgnoreCase("y")) {
                diskon = 0.1;
                System.out.println("Besar diskon = 10%");
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga ricebowl = " + harga);
                } 
                else if (pilihan_menu == 2) {
                    harga = 3000;
                    System.out.println("Harga ice tea = " + harga);
                } 
                else if (pilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga bundling = " + harga);
                }
                else{
                    System.out.println("Masukan pilihan menu dengan benar");
                    return;
                }
                System.out.println("Potongan Qris = " + potongan);
                total_bayar = harga - (harga * diskon) - potongan;
                System.out.println("Total bayar setelah diskon = " + total_bayar);
            } 
            else if (member.equalsIgnoreCase("n")){
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga RIce Bowl: " + harga);
                } 
                else if (pilihan_menu == 2) {
                    harga = 3000;
                    System.out.println("Harga Ice Tea: " + harga);
                }
                else if (pilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga Paket Bunding (Rice Bowl + Ice Tea): " + harga);
                }
                else{
                    System.out.println("Masukan pilihan menu dengan benar");
                    return;
                }
                System.out.println("Potongan Qris = " + potongan);
                total_bayar = harga - potongan;
                System.out.println("Total bayar = " + total_bayar);
            }
            else{
                System.out.println("Member tidak valid");
            }
        }
        else if (qris.equalsIgnoreCase("n")){
            if (member.equalsIgnoreCase("y")) {
                diskon = 0.1;
                System.out.println("Besar diskon = 10%");
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga ricebowl = " + harga);
                } 
                else if (pilihan_menu == 2) {
                    harga = 3000;
                    System.out.println("Harga ice tea = " + harga);
                } 
                else if (pilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga bundling = " + harga);
                }
                else{
                    System.out.println("Masukan pilihan menu dengan benar");
                    return;
                }
                total_bayar = harga - (harga * diskon) - potongan;
                System.out.println("Total bayar setelah diskon = " + total_bayar);
            } 
            else if (member.equalsIgnoreCase("n")){
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga RIce Bowl: " + harga);
                } 
                else if (pilihan_menu == 2) {
                    harga = 3000;
                    System.out.println("Harga Ice Tea: " + harga);
                }
                else if (pilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga Paket Bunding (Rice Bowl + Ice Tea): " + harga);
                }
                else{
                    System.out.println("Masukan pilihan menu dengan benar");
                    return;
                }
                total_bayar = harga - potongan;
                System.out.println("Total bayar = " + total_bayar);
            }
            else{
                System.out.println("Member tidak valid");
            }
        }
        else{
            System.out.println("Qris tidak valid");
        }
        System.out.println("-----------------------------------");
    }
}