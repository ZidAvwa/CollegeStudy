public class Bed {
    private String size;
    private boolean hasStorage;

    public void setSize(String size) {
        this.size = size;
    }

    public void setStorage(boolean hasStorage) {
        this.hasStorage = hasStorage;
    }

    public void showInfo() {
        System.out.println("Bed Size: " + size);
        System.out.println("Has Storage: " + hasStorage);
    }
}