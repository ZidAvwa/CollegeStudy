public class Lecturer27 {
    String lecturerID, name, expertiseField;
    boolean status;
    int startYear;
    
    void print(){
        System.out.println("Lecturer ID : " + lecturerID);
        System.out.println("Lecturer name : " + name);
        System.out.println("Status : " + (status?"Active":"Inactive"));
        System.out.println("Year started : " + startYear);
        System.out.println("Expertise Field : " + expertiseField);
    }

    void setStatus(boolean status){
        this.status = status;
        System.out.println("Status set");
    }

    int calculateTenure(int yearNow){
        return yearNow - startYear;
    }

    void changeExpertiseField(String newField){
        expertiseField = newField;
        System.out.println("Field changed");
    }

    public Lecturer27(){}
    public Lecturer27(String id, String nm, boolean sts, int strYr, String flExp){
        lecturerID = id;
        name = nm;
        status = sts;
        startYear = strYr;
        expertiseField = flExp;
    }
}
