
public class Sofa {
    private String material;
    private int seats;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void showInfo() {
        System.out.println("Sofa Material: " + material);
        System.out.println("Number of Seats: " + seats);
    }
}