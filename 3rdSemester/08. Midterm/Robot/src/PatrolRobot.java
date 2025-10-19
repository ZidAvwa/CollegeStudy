public class PatrolRobot extends Robot {
    Battery Battery = new Battery();

    public PatrolRobot(String Name, int cpuspeed, int power, Battery battery) {
        this.Name = "PATROL " + Name;
        CPUSpeed = cpuspeed;
        Power = power;
        Battery = battery;
    }
    public void increasePower(){ Power += 20; }
}