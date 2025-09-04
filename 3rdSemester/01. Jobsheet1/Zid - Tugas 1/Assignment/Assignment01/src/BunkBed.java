public class BunkBed extends Bed {
    private int levels;
    private boolean hasLadder;

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public void setLadder(boolean hasLadder) {
        this.hasLadder = hasLadder;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Number of Levels: " + levels);
        System.out.println("Has Ladder: " + hasLadder);
    }
}