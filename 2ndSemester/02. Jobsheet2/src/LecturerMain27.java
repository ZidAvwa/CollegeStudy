public class LecturerMain27 {
    public static void main(String[] args) {
        Lecturer27 leturer1 = new Lecturer27();
        leturer1.lecturerID = "ZAAB";
        leturer1.name = "Zid'Avwa Al Bari'i";
        leturer1.status = true;
        leturer1.startYear = 2007;
        leturer1.expertiseField = "design";
        leturer1.print();

        System.out.println("---------------------");
        leturer1.changeExpertiseField("game");
        leturer1.print();
        System.out.printf("Tenure : %d year %n", leturer1.calculateTenure(2025));

        Lecturer27 lecturer2 = new Lecturer27("AN", "Anissa Nabila", true, 2005, "ALSD");
        System.out.println("---------------------");
        lecturer2.print();
        
        System.out.println("---------------------");
        lecturer2.setStatus(false);
        lecturer2.print();
    }
}
