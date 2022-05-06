
import java.util.Scanner;

public class ClassAverageArbitrary {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double total = 0;
    int counter = 0;
    
    System.out.print("Enter Grade or -1 to quit: ");
    double grade = input.nextDouble();
    while(grade!=-1){
        total = total + grade;
        counter = counter + 1;
        System.out.print("Enter Next Grade or -1 to quit: ");
        grade = input.nextDouble();
    }
    if(counter != 0){
        System.out.printf("%nClass Average is %.2f%n", total/counter);
    } else{
        System.out.println("No grades were entered");
        input.close();
    }
   }
}
