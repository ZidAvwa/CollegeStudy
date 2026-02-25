public class Motorcycle {
    private String brand;
    private String color;
    private int maxSpeed;
    private int currentSpeed;
    private Engine engine;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void increaseSpeed(int value) {
        if (currentSpeed + value <= maxSpeed) {
            currentSpeed += value;
        } else {
            currentSpeed = maxSpeed;
        }
    }

    public void decreaseSpeed(int value) {
        if (currentSpeed - value >= 0) {
            currentSpeed -= value;
        } else {
            currentSpeed = 0;
        }
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Current Speed: " + currentSpeed + " km/h");
        engine.displayInfo();
    }
}