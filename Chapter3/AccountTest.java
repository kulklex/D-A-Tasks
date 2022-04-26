package Chapter3;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();
        System.out.println("Please Enter Firstname: ");
        String FirstName = input.nextLine();
        System.out.println("Please Enter Surname");
        String SurName = input.nextLine();
        myAccount.setName(FirstName, SurName);
        System.out.print("Your Names Are: " + myAccount.getName() );
        input.close();
    }
}
