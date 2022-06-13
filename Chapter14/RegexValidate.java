import java.util.Scanner;

public class RegexValidate {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name: ");
        String firstname = scanner.nextLine();
        System.out.println("Please enter last name: ");
        String lastname = scanner.nextLine();
        System.out.println("Please enter address: ");
        String address = scanner.nextLine();
        System.out.println("Please enter city: ");
        String city = scanner.nextLine();
        System.out.println("Please enter state: ");
        String state = scanner.nextLine();
        System.out.println("Please enter zip: ");
        String zip = scanner.nextLine();
        System.out.println("Please enter phone: ");
        String phone = scanner.nextLine();

        System.out.println("%nValidate Result: ");
        if(!Regex.validateFirstName(firstname)){
            System.out.println("Invalid firstname");
        } else if (!Regex.validateLastName(lastname)){
            System.out.println("Invalid lastname");
        } else if (!Regex.validateAddress(address)){
            System.out.println("Invalid address");
        } else if (!Regex.validateCity(city)){
            System.out.println("Invalid city");
        } else if (!Regex.validateState(state)){
            System.out.println("Invalid state");
        } else if (!Regex.validateZip(zip)){
            System.out.println("Invalid zip code");
        } else if (!Regex.validatePhone(phone)){
            System.out.println("Invalid phone number");
        } else {
            System.out.println("Valid input. Thank you");
        }
        scanner.close();
    }
}
