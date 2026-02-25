public class Main {
    public static void main(String[] args) {
        Cat wildCat = new Cat();
        Fish dolphin = new Fish();
        Chicken chicken = new Chicken();

        People ani = new People("Ani");
        People budi = new People("Budi");

        ani.setPet(wildCat);
        budi.setPet(dolphin);
        ani.setPet(chicken);

        ani.walkThePet();
        budi.walkThePet();
        ani.feed();
    }
}