public class Monster extends Character {
    public int power;

    public Monster(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void destroy(DestroyAble da) {
        da.destroyed();
        System.out.print(" By " + name + ".\n");
    }
}