import java.util.Scanner;

public class LicenseExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double counterPass = 0;
        double counterFailure = 0;
        double total = 0;
        int counter = 1;

        while(counter <= 10){
            System.out.printf("Enter Score: ");
            double score = input.nextDouble();
            if(score >= 50){
                counterPass += 1;
            }
            if(score < 50){
                counterFailure += 1;
            }
            total += score;
            counter += 1;
        }
        if(counterPass >= 8){System.out.println("Bonus to instructor!");}
        System.out.printf("The total number of Students that passed are %.0f%n", counterPass);
        System.out.printf("While Total number of students thta failed are %.0f%n", counterFailure);
        System.out.printf("Studnets Average is %.2f%n", total/10);
        input.close();
    }
}
