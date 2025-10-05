public class Compressor {
    private String Type;
    private int Capacity;

    public Compressor(String Type, int Capacity){
        this.Type = Type;
        this.Capacity = Capacity;
    }

    public String getType() {
        return Type;
    }   

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
}