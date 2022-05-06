package Chapter3;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        int Buy = 31;
        int buy = 4;
        int sum = buy + Buy;
        System.out.println(sum); 
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account("Hassan", "Yusuff");
        System.out.println(myAccount.getName());
        System.out.println("Please Enter Firstname: ");
        String FirstName = input.nextLine();
        System.out.println("Please Enter Surname");
        String SurName = input.nextLine();
        myAccount.setName(FirstName, SurName);
        System.out.print("Your Names Are: " + myAccount.getName() );
        input.close();
    }
}
