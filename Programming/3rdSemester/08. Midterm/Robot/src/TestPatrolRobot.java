public class TestPatrolRobot {
    public static void main(String[] args) {
        Battery batt = new Battery();
        PatrolRobot pr = new PatrolRobot("ASIMO", 2048, 150, new Battery(16000));

        pr.increasePower();
        // pr.reducePower();

        System.out.println("Name: " + pr.Name);
        System.out.println("CPUspeed: " + pr.CPUSpeed);
        System.out.println("Power: " + pr.Power);
        System.out.println("Battery Capacity: " + pr.Battery.Capacity);
    }
}
