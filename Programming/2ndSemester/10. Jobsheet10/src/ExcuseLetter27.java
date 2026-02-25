public class ExcuseLetter27 {
    String id;
    String name;
    String className;
    char typeOfExcuse; // 'S' = Sick, 'O' = Other
    int duration;

    public ExcuseLetter27() {}

    public ExcuseLetter27(String id, String name, String className, char type, int duration) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.typeOfExcuse = type;
        this.duration = duration;
    }
}
