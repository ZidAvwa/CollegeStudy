public class Trip27 {

    String[] destination = {"Jogja", "Semarang", "Surabaya", "Bali"};
    int[] numTravelers = new int[4];
    double[] ticketPrices = {2000000, 1300000, 1500000, 2500000};
    double[] earningECity;

    public double totalEarning(){
        for (int i = 0; i < numTravelers.length; i++) {
            earningECity[i] = numTravelers[i]*ticketPrices[i];
        }
        return earningECity[0]+earningECity[1]+earningECity[2];
    }

    public static void print(){
        for (int i = 0; i < array.length; i++) {
            
        }
    }
}