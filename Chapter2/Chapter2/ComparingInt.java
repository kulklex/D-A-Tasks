package Chapter2;

import java.util.Scanner;

public class ComparingInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = input.nextInt();
        System.out.print("Enter second number: ");
        int y = input.nextInt();
        if(x > y){
            System.out.printf("%d is larger than %d", x, y);
        }
        if(y > x){
            System.out.printf("%d is larger than %d", y, x);
        }
        if(x == y){
            System.out.printf("These numbers are equal");
        }
        input.close();
    }
}
