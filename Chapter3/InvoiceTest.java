package Chapter3;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter harware part number: ");
        String partNumber = input.nextLine();
        System.out.print("Enter hardware part descriptions: ");
        String partDesc = input.nextLine();
        System.out.print("Enter quantity of part(s): ");
        int quantityOfItem = input.nextInt();
        System.out.print("Enter price of each parts: ");
        double pricePerItem = input.nextDouble();
        Invoice myInvoice = new Invoice(partNumber, partDesc, quantityOfItem, pricePerItem);
        myInvoice.setpartDesc(partDesc);
        myInvoice.setpartNumber(partNumber);
        System.out.printf("Total Cost of item %s with %s is: $%.2f",
         partNumber, myInvoice.getpartDesc(), myInvoice.getInvoiceAmount(pricePerItem, quantityOfItem));
        //Here i chose to use getters and constructor to receive the values of the Strings
        input.close();
    }
}
