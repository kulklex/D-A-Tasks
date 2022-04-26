package Chapter2;

import java.util.Scanner;

public class IntegerChar{
    public static void main(String[] args) {
        char grade = 'A';
        char gradeB = 'B';
        char gradeC = 'C';
        char gradea = 'a';
        char gradeb = 'b';
        char gradec = 'c';
        char grade0 = '0';
        char grade1 = 1;
        char grade2 = '2';
        char grade$ = '$';
        char gradestar = '*';
        char gradeplus = '+';
        char gradeslash = '/';
        System.out.printf("The Character %c has value %d%n", grade, ((int) 'A'));
        System.out.printf("The Character %c has value %d%n", gradeB, ((int) 'B'));
        System.out.printf("The Character %c has value %d%n", gradeC, ((int) 'C'));
        System.out.printf("The Character %c has value %d%n", gradea, ((int) 'a'));
        System.out.printf("The Character %c has value %d%n", gradeb, ((int) 'b'));
        System.out.printf("The Character %c has value %d%n", gradec, ((int) 'c'));
        System.out.printf("The Character %c has value %d%n", grade0, ((int) '0'));
        System.out.printf("The Character %c has value %d%n", grade1, ((int) '1'));
        System.out.printf("The Character %c has value %d%n", grade2, ((int) '2'));
        System.out.printf("The Character %c has value %d%n", grade$, ((int) '$'));
        System.out.printf("The Character %c has value %d%n", gradestar, ((int) '*'));
        System.out.printf("The Character %c has value %d%n", gradeplus, ((int) '+'));
        System.out.printf("The Character %c has value %d%n", gradeslash, ((int) '/'));
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Five-Digit-Number: ");
        int number = input.nextInt();
        int number1, number2, number3, number4, number5;
        number1 = (number / 10000);
        number2 = (number / 1000) % 10;
        number3 = (number / 100) % 10;
        number4 = (number / 10) % 10;
        number5 = number  % 10;
        System.out.printf("%d %d %d %d %d", number1, number2, number3, number4, number5);
        input.close();
    }
}