public class Course27 {
    String courseID, name;
    int credit, hour;
    void print(){
        System.out.println("Course ID : " + courseID);
        System.out.println("Course Name : " + name);
        System.out.println("Course Credit : " + credit);
        System.out.println("Course Hour : " + hour);
    }

    void changeCredit(int newCredit){
        credit = newCredit;
        System.out.println("Credit changed");
    }

    void addHour(int hour){
        this.hour += hour;
        System.out.println("Hour Added");
    }

    void reduceHour(int hour){
        if (this.hour >= hour){
            this.hour -= hour; 
            System.out.println("Hour Reduced");
        }else {
            System.out.println("Not enough hour");
        }
    }
    public Course27(){}
    public Course27(String id, String nm, int crt, int hr){
        courseID = id;
        name = nm;
        credit = crt;
        hour = hr;
    }
}
