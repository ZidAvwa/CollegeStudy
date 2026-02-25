public class Laptop {
    private String merk;
    private Processor proc;

    public void info() {
        System.out.printf("Merk Laptop = %s\n", merk);
        proc.info();
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public Processor getProc() {
        return proc;
    }

    public String getMerk() {
        return merk;
    }
}