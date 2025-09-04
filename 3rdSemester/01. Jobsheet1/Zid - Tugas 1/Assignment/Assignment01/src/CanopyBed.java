public class CanopyBed extends Bed {
    private String canopyMaterial;
    private boolean hasCurtains;

    public void setCanopyMaterial(String canopyMaterial) {
        this.canopyMaterial = canopyMaterial;
    }

    public void setCurtains(boolean hasCurtains) {
        this.hasCurtains = hasCurtains;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Canopy Material: " + canopyMaterial);
        System.out.println("Has Curtains: " + hasCurtains);
    }
}