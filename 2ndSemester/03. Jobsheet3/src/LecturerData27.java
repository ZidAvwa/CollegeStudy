public class LecturerData27 {
    public void showAllLecturerData(Lecturer27[] lecturerArray){
        for (Lecturer27 lecturer : lecturerArray) {
            System.out.printf("id\t: %s %n", lecturer.id);
            System.out.printf("Name\t: %s %n", lecturer.name);
            System.out.printf("Gender\t: %s %n", (lecturer.gender ? "Pria" : "Wanita"));
            System.out.printf("Age\t: %d %n", lecturer.age);
            System.out.println("------------------------");
        }
    }

    public void countLecturerByGender(Lecturer27[] lecturerArray){
        int male=0; int female=0;
        for (Lecturer27 lecturer : lecturerArray){
            if (lecturer.gender == true) male++;
            else female++;
        }

        System.out.printf("Male Lecturer Total\t: %d %n", male);
        System.out.printf("Female Lecturer Total\t: %d %n", female);
    }

    public void averageLecturerAgeByGender(Lecturer27[] lecturerArray){
        int male = 0; int female = 0; int maleAge = 0; int femaleAge = 0;
        for (Lecturer27 lecturer : lecturerArray){
            if (lecturer.gender == true) {
                male++; maleAge += lecturer.age;
            }
            else {
                female++; femaleAge += lecturer.age;
            }
        }

        double maleAverage = (male == 0) ? 0 : (double) maleAge / male;
        double femaleAverage = (female == 0) ? 0 : (double) femaleAge / female;

        System.out.printf("Male Lecturer Age Average\t: %.2f %n", maleAverage);
        System.out.printf("Female Lecturer Age Average\t: %.2f %n", femaleAverage);
    }

    public void showOldestLecturerInfo(Lecturer27[] lecturerArray){
        Lecturer27 oldest = lecturerArray[0];
        for (Lecturer27 lecturer : lecturerArray){
            if (lecturer.age > oldest.age){
                oldest = lecturer;
            } 
        }

        System.out.printf("Oldest Lecturer is: %s %n", oldest.name);
    }

    public void showYoungestLecturerInfo(Lecturer27[] lecturerArray){
        Lecturer27 youngest = lecturerArray[0];
        for (Lecturer27 lecturer : lecturerArray){
            if (lecturer.age < youngest.age){
                youngest = lecturer;
            } 
        }

        System.out.printf("Youngest Lecturer is: %s %n", youngest.name);
    }
}
