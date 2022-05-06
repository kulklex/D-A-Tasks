package Chapter3;

import java.util.Scanner;

public class FPAWithdrawTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FPAWithdraw myWithdrawal = new FPAWithdraw(500); 
        System.out.print("Enter Account Name: ");
        String name = input.nextLine();
        myWithdrawal.setName(name);
        System.out.print("Enter Deposit: ");
        double deposit = input.nextDouble();
        myWithdrawal.setDepositBalance(deposit);
        System.out.printf("%s your Balance is $%.2f%n if you wish to make a withdrawal, ", myWithdrawal.getName(), myWithdrawal.getDepositBalance());
        System.out.print("Enter Amount to withdraw: ");
        double withdraw = input.nextDouble();
        myWithdrawal.setBalance(withdraw);
        System.out.printf("%s you just withdrew %f, your Account balance is %.2f", myWithdrawal.getName(), withdraw, myWithdrawal.getBalance());
        input.close();
    }
}
