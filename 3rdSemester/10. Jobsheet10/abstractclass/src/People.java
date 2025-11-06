public class People {
    private String name;
    private Animal pet;
    private Chicken chicken;

    public People(String name) { this.name = name; }
    public void setPet(Animal pet) { this.pet = pet; }

    public void walkThePet() {
        System.out.println("My Name is " + this.name);
        System.out.println("My Pet walks by: ");
        this.pet.moving();
        System.out.println("----------------------------");
    }

    public void feed() {
        System.out.println("My Name is " + this.name);
        System.out.println("My Pet eating a: ");
        this.chicken.eating();
        System.out.println("----------------------------");
    }
}