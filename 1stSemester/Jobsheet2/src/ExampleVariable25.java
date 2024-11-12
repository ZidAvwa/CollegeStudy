public class ExampleVariable25 {
    public static void main(String[] args){
        String oneOfMyHobbies = "Listen to Music";
        boolean isSmart = true;
        char gender = 'M';
        byte age = 16;
        double gpa = 3.5, height = 1.65;
        System.out.println(oneOfMyHobbies);
        System.out.println("Are you smart? "+ isSmart);
        System.out.println("Gender: "+ gender);
        System.out.println("My current age is "+ age);
        System.out.println(String.format("My GPA is %s and my height is %s meters", gpa, height));
    }  
}
