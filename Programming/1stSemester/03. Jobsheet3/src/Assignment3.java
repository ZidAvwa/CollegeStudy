import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Your Score");
        float nilai;
        nilai = sc.nextInt();
        if (nilai > 80 && nilai <= 100){
            System.out.println("Your score is A (Sangat Baik)");
        }
        else if (nilai > 73 && nilai <= 80){
            System.out.println("Your score is B+ (Lebih dari Baik)");
        }
        else if (nilai > 65 && nilai <= 73){
            System.out.println("Your score is B (Baik)");
        }
        else if (nilai > 60 && nilai <= 65){
            System.out.println("Your score is C+ (Lebih dari Cukup)");
        }
        else if (nilai > 50 && nilai <= 60){
            System.out.println("Your score is C (Cukup)");
        }
        else if (nilai > 39 && nilai <= 50){
            System.out.println("Your score is D (Kurang)");
        }
        else{
            System.out.println("Your score is E (Gagal)"); 
        }
    }
    
}
