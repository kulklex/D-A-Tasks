package Chapter2;
import java.util.Scanner;

public class Welcome1{
    public static void main(String[] args) {
        /** Testing For JavaDoc Comments */
        // System.out.println("Welcome to java Programming");
        // System.out.print("Welcome to ");
        // System.out.println("Java Programming");
        // System.out.println("Welcome\nto\\Java\tProgramming\"!\"");
        // System.out.printf("%s%n%s%n","Welcome to", "Java Programming");

        Scanner input = new Scanner(System.in);

        int num1, num2, num3, product, sum;
        System.out.print("Enter first Integer: ");
        num1 = input.nextInt();
        System.out.print("Enter Second Integer: ");
        num2 = input.nextInt();
        System.out.print("Enter third Integer: ");
        num3 = input.nextInt();
        product = num1 * num2 * num3;
        sum = num1 + num2 + num3;
        System.out.printf("The Product is %d and the sum is %d", product, sum);
        // if(num1 == num2){
        //     System.out.printf("%d is equals to %d%n", num1, num2);
        // }

        // if(num1 > num2){
        //     System.out.printf("%d is greater than %d%n", num1, num2);
        // }

        // if (num1 < num2) {
        //     System.out.printf("%d is less than %d%n", num1, num2);
        // }  
        input.close();      


    }   
}
