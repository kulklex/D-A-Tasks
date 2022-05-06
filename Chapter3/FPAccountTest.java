package Chapter3;

import java.util.Scanner;

public class FPAccountTest {
    public static void main(String[] args) {
        FPAccount account1 = new FPAccount("Dan Krall", 50.00);
        FPAccount account2 = new FPAccount("John Smith", -7.53);

        System.out.printf("%s initial balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s initial balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for first Account: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%n Adding %.2f to first Account.......%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s's Account balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s's Account balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for Second Account: ");
        depositAmount = input.nextDouble();
        System.out.printf("%n Adding %.2f to second Account....%n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s's Account balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s's Account balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        input.close();
    }

    public void displayAccount(){
        
    }
}
