package Chapter2;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to Check if it is a even or odd number: ");
        int a = input.nextInt();
        int calc = a % 2;
        if(calc == 0){
            System.out.printf("%d is an Even Number %n", a);
        } else{
            System.out.printf("%d is a Odd Number %n", a);
        }
        System.out.print("Enter two numbers to check if they are multiples: ");
        int b = input.nextInt();
        System.out.print("Enter Second number: ");
        int c = input.nextInt();
        int calc2 = b % c;
        if(calc2 == 0){
            System.out.printf("%d is a multiple of %d%n", c, b);
        }
        if(calc2 != 0){
            System.out.printf("%d is NOT a multiple of %d%n", c, b);
        }
        input.close();
    }
}
