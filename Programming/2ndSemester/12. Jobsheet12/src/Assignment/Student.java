package Assignment;
public class Student {
    String nim, name;
    String purpose;

    public Student() {
    }

    public Student(String nim, String name, String purpose) {
        this.nim = nim;
        this.name = name;
        this.purpose = purpose;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + purpose);
    }
}
