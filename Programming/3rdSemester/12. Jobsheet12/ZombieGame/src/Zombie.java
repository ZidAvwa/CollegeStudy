public abstract class Zombie implements Destroyable {
    protected double health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public abstract void heal();
    @Override
    public abstract void destroyed();

    public String getZombieInfo() {
        return "Health = " + (int) this.health + "\nLevel = " + this.level;
    }
}