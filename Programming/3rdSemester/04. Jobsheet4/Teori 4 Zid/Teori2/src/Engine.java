public class Engine {
    private int capacity;
    private String fuelType;

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public void displayInfo() {
        System.out.println("Engine Capacity: " + capacity + " cc");
        System.out.println("Fuel Type: " + fuelType);
    }
}
