
public class Student27 {

    String nim, name, className;
    double ipk;

    public Student27() {
    }

    public Student27(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        ipk = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + ipk);
    }
}