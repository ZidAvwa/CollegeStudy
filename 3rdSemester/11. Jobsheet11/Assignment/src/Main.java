public class Main {
    public static void main(String[] args) {
        System.out.println("run:");
        
        Keledai k = new Keledai("Kedelai", 4, "Hehehehe", "Abu-Abu");
        k.displayData();
        System.out.println();

        Gorilla g = new Gorilla("Gulali", 4, "Haaum Hauum", "Hitam Manis");
        g.displayData();
        System.out.println();

        Singa s = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");
        s.displayData();
    }
}