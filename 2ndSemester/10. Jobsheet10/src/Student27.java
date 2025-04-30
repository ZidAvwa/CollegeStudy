public class Student27 {
    String nim;
    String name;
    String className;
    int grade;

    public Student27(){}
    public Student27(String nim, String name, String className){
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.grade = -1;
    }
    
    public void grading(int grade){
        this.grade = grade;
    }
}
