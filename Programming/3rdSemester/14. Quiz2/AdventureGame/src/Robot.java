public class Robot extends Character {
    public int armor;

    public Robot(String name, int armor) {
        this.name = name;
        this.armor = armor;
    }

    @Override
    public void destroy(DestroyAble da) {
        da.destroyed();
        System.out.print(" By " + name + ".\n");
    }
}