public class Part1 {
    public static void main(String[] args) {
        double tshirt = 300000;
        double sock = 150000;
        double cap = 200000;
        double jacket = 350000;
        double pants = 500000;
        double blazer = 800000;
        double jeans = 1200000;

        System.out.print("Welcome to Suniclo");
        System.out.println("===========================================");
        System.out.println("Purchased Item");
        System.out.println("------------------------------------------");
        System.out.println("1. Men Oversize T-shirt Black L");
        System.out.println("2. Airismi Polkadot Kids Sock");
        System.out.println("3. Unisex Casual Cap Cream");
        System.out.println("4. Unisex Windbreaker Jacket Purple L");
        System.out.println("5. Men Heatechy Jogger Pants L");
        System.out.println("6. Women Casual Blazer Navy M");
        System.out.println("7. Women Ripped Jeans Casual Cut Navy M");
        System.out.println("------------------------------------------");

        double total = tshirt + sock + cap + jacket + pants + blazer + jeans;
        double discount = total * 0.175;
        double grandTotal = total - discount;

        System.out.println("Total\t\t: IDR "+total);
        System.out.println("Discount\t: IDR "+discount);
        System.out.println("Grand Total\t: IDR "+grandTotal);

    }
}
