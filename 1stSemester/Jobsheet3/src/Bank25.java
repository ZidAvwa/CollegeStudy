import java.util.Scanner;
public class Bank25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int init_sav_ammount, sav_period;
        double final_sav_ammount, interest, interest_percent = 0.02;
        System.out.println("input initial saving ammount: ");
        init_sav_ammount = sc.nextInt();
        System.out.println("Input your saving period: ");
        sav_period = sc.nextInt();
        interest = sav_period * interest_percent * init_sav_ammount;
        final_sav_ammount = interest * init_sav_ammount;
        System.out.println("Interest: " + interest);
        System.out.println("Final saving ammount: " + final_sav_ammount);
    }
}
