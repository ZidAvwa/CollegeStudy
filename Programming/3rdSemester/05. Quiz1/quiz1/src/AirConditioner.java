public class AirConditioner {
    private String Brand;
    private int ProductionYear;
    private Compressor MainCompressor;
    private Remote MainRemote;

    public AirConditioner(String brand, int yearprod, Compressor comp, Remote rmt) {
        Brand = brand;
        ProductionYear = yearprod;
        MainCompressor = comp;
        MainRemote = rmt;
    }

    public String getBrand() {
        return Brand;
    }

    public int getProductionYear() {
        return ProductionYear;
    }

    public Compressor getMainCompressor() {
        return MainCompressor;
    }

    public Remote getMainRemote() {
        return MainRemote;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public void setProductionYear(int ProductionYear) {
        this.ProductionYear = ProductionYear;
    }

    public void setMainCompressor(Compressor MainCompressor) {
        this.MainCompressor = MainCompressor;
    }

    public void setMainRemote(Remote MainRemote) {
        this.MainRemote = MainRemote;
    }
}