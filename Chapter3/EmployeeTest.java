package Chapter3;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee myEmployee1 = new Employee("Hassan", "Yusuff", 2040000);
        Employee myEmployee2 = new Employee("Hamzah", "Shatar", 1000700);
        System.out.printf("Mr %s %s's yearly salary is: %.2f%n", myEmployee1.getFirstName(), myEmployee1.getLastName(), myEmployee1.getMonthlySalary());
        System.out.printf("Mr %s %s's yearly salary is: %.2f%n", myEmployee2.getFirstName(), myEmployee2.getLastName(), myEmployee2.getMonthlySalary());
        double salary1 = myEmployee1.getMonthlySalary();
        double salary2 = myEmployee2.getMonthlySalary();
        myEmployee1.setMonthlySalary(salary1);
        myEmployee2.setMonthlySalary(salary2);
        System.out.print("After a 10% increase in each salaries\n\n\n");
        System.out.printf("Mr %s %s's salary is now: %.2f%n", myEmployee1.getFirstName(), myEmployee1.getLastName(), myEmployee1.getMonthlySalary());
        System.out.printf("Mr %s %s's salary is now: %.2f%n", myEmployee2.getFirstName(), myEmployee2.getLastName(), myEmployee2.getMonthlySalary());
    }   
}
