public class TestMotorcycle {
    public static void main(String[] args) {
        Engine eng = new Engine();
        eng.setCapacity(150);
        eng.setFuelType("Petrol");

        Motorcycle mtr = new Motorcycle();
        mtr.setBrand("Yamaha");
        mtr.setColor("Red");
        mtr.setMaxSpeed(180);
        mtr.setEngine(eng);

        mtr.increaseSpeed(60);
        mtr.decreaseSpeed(20);

        mtr.displayInfo();
    }
}