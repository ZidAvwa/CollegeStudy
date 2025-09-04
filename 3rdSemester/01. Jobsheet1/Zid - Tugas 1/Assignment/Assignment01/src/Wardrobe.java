public class Wardrobe {
    private int doors;
    private boolean hasMirror;

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setMirror(boolean hasMirror) {
        this.hasMirror = hasMirror;
    }

    public void showInfo() {
        System.out.println("Wardrobe Doors: " + doors);
        System.out.println("Has Mirror: " + hasMirror);
    }
}