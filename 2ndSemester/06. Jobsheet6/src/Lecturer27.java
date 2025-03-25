public class Lecturer27 {
    String id;
    String name;
    boolean gender;
    int age;

    public Lecturer27(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void print() {
        String genderStr = gender ? "Male" : "Female";
        System.out.println("ID: " + id + ", Name: " + name + ", Gender: " + genderStr + ", Age: " + age);
    }
}
