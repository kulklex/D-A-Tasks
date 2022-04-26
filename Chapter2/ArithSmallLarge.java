package Chapter2;

import java.util.Scanner;

public class ArithSmallLarge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Frist Number: ");
        int x = input.nextInt();
        System.out.print("Enter Second Number: ");
        int y = input.nextInt();
        System.out.print("Enter Third Number:  ");
        int z = input.nextInt();
        System.out.print("Enter Fourth Number:  ");
        int a = input.nextInt();
        System.out.print("Enter Fifth Number:  ");
        int b = input.nextInt();
        int sum = x + y + z + a + b;
        int product = x * y * z  + a + b;
        System.out.printf("The sum of the three numbers is %d%n", sum);
        System.out.printf("The average is %d remanider %d%n", sum/2, sum%2);
        System.out.printf("The product of these numbers is %d%n", product);
        if(x > y && x > z && x > a && x > b){
            System.out.printf("The largest number is %d%n", x);
        } 
        if(x < y && x < z && x < a && x < b){
            System.out.printf("The smallest number is %d%n", x);
        }
        if(y > x && y > z && y > a && y > b){
            System.out.printf("The largest number is %d%n", y);
        }
        if(y < x && y < z && y < a && y < b){
            System.out.printf("The smallest number is %d%n", y);
        }
        if(z > x && z > y && z > a && z > b){
            System.out.printf("The largest number is %d%n", z);
        }
        if(z< x && z < y && z < a && z < b){
            System.out.printf("The smallest number is %d%n", z);
        }
        if(a > b && a > x && a > y && a > z){
            System.out.printf("The largest number is %d%n", a);
        }
        if(a < b && a < x && a < y && a < z){
            System.out.printf("The smallest number is %d%n", a);
        }
        if(b > a && b > x && b > y  && b > z){
            System.out.printf("The largest number is %d%n", b);
        }
        if(b < a && b < x && b < y && b < z){
            System.out.printf("The smallest number is %d%n", b);
        }
        if(a == b && a == x && a == y && a == z){
            System.out.printf("All numbers are equal :%d%n", a );
        }
        input.close();
    }
}