public class BasePlusCommissionTest {
    public static void main(String[] args) {
        BasePlusCommisiionEmployee employee = new BasePlusCommisiionEmployee("bob", "Lewis", "333-33-3333", 5000, .04, 300);

        System.out.println("Employee information obtained by get methods:%n");

        System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%n%s %s%n", "Last nmae is", employee.getLastName());
        System.out.printf("%n%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%n%s %s%n", "Commission rate is", employee.getCommissionRate());
        System.out.printf("%n%s %s%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%n%s %s%n", "Base salary is", employee.getBaseSalary());

        employee.setBaseSalary(1000);

        System.out.printf("%n%s: %n%n%s%n", "Updated employee information obtained by toString", employee.toString());
        
        
    }
}
