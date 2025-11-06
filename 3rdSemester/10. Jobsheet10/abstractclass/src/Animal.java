public abstract class Animal{
    private int age;

    protected Animal(){ this.age = 0; }
    public void ageUp(){ this.age++; }
    // public abstract void moving();
    public void moving() { System.out.println("Animal is moving..."); }
}