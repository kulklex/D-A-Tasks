package Chapter2;

import java.util.Scanner;

public class Arithetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = input.nextInt();
        System.out.print("Enter Second Number: ");
        int y = input.nextInt();
        System.out.printf("The sum of the two numbers is: %d%n", (x+y));
        System.out.printf("The product of the two numbers is: %d%n", (x*y));
        System.out.printf("The difference between the two numbers is: %d%n", (x-y));
        System.out.printf("The quotient of the two numbers is: %d%n", (x / y));
        input.close();
    }
}
