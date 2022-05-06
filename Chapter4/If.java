
import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter Your Exam Score: ");
        int Grade = input.nextInt();
        System.out.println(Grade > 60 ? "Excellent Score" : "Loading...");
        if(Grade > 50){
            System.out.println("You passed your Exams");
        } else
            if(Grade == 50){
                System.out.println("Your score is average");
            } else {
                System.out.println("You Failed");
            }
            if(Grade <  9);
        input.close();
        }
    }
