public class PolymorphismTest {
    public static void main(String[] args) {
        CommissionEmployees commissionEmployee = new CommissionEmployees("Sue", "Jones", "222-22-2222", 10000, .06);
        InheritanceFromCommissionEmployee inheritanceFromCommissionEmployee     = new InheritanceFromCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
    
        System.out.printf("%s %s:%n%n%s%n%n", "Call commissionEmployee's toString with superclass reference", "to superclass object", commissionEmployee.toString());
        System.out.printf("%s %s:%n%n%s%n%n", "Call BasePlusCommissionEmployee's toString with subclass reference", "reference to subclass object", inheritanceFromCommissionEmployee.toString());

        CommissionEmployees commissionEmployee2 = inheritanceFromCommissionEmployee;
        System.out.printf("%s %s:%n%n%s%n%n", "Call BasePlusCommissionEmployee's toString with superclass", "reference to subclass object", commissionEmployee2.toString());
    }
}
