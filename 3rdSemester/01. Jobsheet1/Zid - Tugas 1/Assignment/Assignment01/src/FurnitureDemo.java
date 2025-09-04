public class FurnitureDemo {
    public static void main(String[] args) {
        // Standalone Sofa
        Sofa sofa = new Sofa();
        sofa.setMaterial("Leather");
        sofa.setSeats(3);
        sofa.showInfo();

        System.out.println();

        // Standalone Wardrobe
        Wardrobe wardrobe = new Wardrobe();
        wardrobe.setDoors(4);
        wardrobe.setMirror(true);
        wardrobe.showInfo();

        System.out.println();

        // Parent Bed
        Bed bed = new Bed();
        bed.setSize("Queen");
        bed.setStorage(true);
        bed.showInfo();

        System.out.println();

        // Child 1: BunkBed
        BunkBed bunkBed = new BunkBed();
        bunkBed.setSize("Single");
        bunkBed.setStorage(false);
        bunkBed.setLevels(2);
        bunkBed.setLadder(true);
        bunkBed.showInfo();

        System.out.println();

        // Child 2: CanopyBed
        CanopyBed canopyBed = new CanopyBed();
        canopyBed.setSize("King");
        canopyBed.setStorage(true);
        canopyBed.setCanopyMaterial("Wooden Frame");
        canopyBed.setCurtains(true);
        canopyBed.showInfo();
    }
}
