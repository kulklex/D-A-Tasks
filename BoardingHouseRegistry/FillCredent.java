package BoardingHouseRegistry;

import java.util.Scanner;

public class FillCredent {
    public static void main(String[] args) {
        Credentials myCredentials = new Credentials();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.print("Enter Phone Number: ");
        String phNumber = input.nextLine();
        System.out.print("Enter Age: ");
        String age = input.nextLine();
        System.out.print("Enter Address: ");
        String address = input.nextLine();
        System.out.print("Enter Gender (M or F only): ");
        String gender = input.nextLine();
        System.out.print("Enter Email: ");
        String email = input.nextLine();
        System.out.print("Enter Date Of Birth: ");
        String DOB  = input.nextLine();
        System.out.print("Enter Maiden Name: ");
        String maidenName = input.nextLine();
        myCredentials.setCredentials(name, phNumber, age, address, gender, email, DOB, maidenName);
        System.out.printf("Your Details are as follows: %s", myCredentials.getCredentials());
        input.close();
    }
}
