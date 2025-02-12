public class Function {

    public static int flowerStock[][] = {
        {10, 5, 15, 7},  //RoyalGarden1
        {6, 11, 9, 12},  //RoyalGarden2
        {2, 10, 10, 5},  //RoyalGarden3
        {5, 7, 12, 9}    //RoyalGarden4
    };
    public static String flower[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    public static int price[] = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {
        totalIncome(); 
        totalStock();       
    }

    public static void totalIncome() {
        System.out.println("Each Branch Income if Sold Out:");
        for (int i = 0; i < flowerStock.length; i++) {
            int total = 0;
            for (int j = 0; j < flowerStock[i].length; j++) {
                total += flowerStock[i][j] * price[j];
            }
            System.out.printf("RoyalGarden %d: Rp. %,d\n", (i + 1), total);
        }
        System.out.println();
    }

    public static void totalStock() {
        System.out.println("Flower Stock in RoyalGarden 4:");
        flowerStock[3][0] -= 1;
        flowerStock[3][1] -= 2;
        flowerStock[3][2] -= 0;
        flowerStock[3][3] -= 5;
        for (int i = 0; i < flower.length; i++) {
            System.out.println(flower[i] + ": " + flowerStock[3][i]);
        }
    }
}