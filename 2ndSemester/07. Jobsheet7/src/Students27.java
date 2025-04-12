public class Students27 {
    int nim, age;
    String name;
    double gpa;

    public Students27(int nim, int age, String name, double gpa) {
        this.nim = nim;
        this.age = age;
        this.name = name;
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("NIM: " + nim);
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
    }
}
