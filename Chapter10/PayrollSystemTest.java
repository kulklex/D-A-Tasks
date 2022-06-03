public class PayrollSystemTest {
    public static void main(String[] args) {
        SalaryEmployee salaryEmployee = new SalaryEmployee("John", "Doe", "111-11-1111", 8000.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Dan", "Krall", "222-22-2222", 18.85, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Karen", "Price", "333-33-3333", 100000, .08);
        BasePlusCommissionEmployees basePlusCommissionEmployee = new BasePlusCommissionEmployees("Sam", "Allardyce", "444-44-4444", 700000, .15, 600);
        
        System.out.println("Employees processed individually:");
        
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
        salaryEmployee, "earned", salaryEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
        hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
        commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
        basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        //create four-element Employee array
        Employee[] employees = new Employee[4];
        
        //initialize array with Employees
        employees[0] = salaryEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Employees processed polymorphically");

        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee);

            if ( currentEmployee instanceof  BasePlusCommissionEmployees){
                BasePlusCommissionEmployees employee = (BasePlusCommissionEmployees) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("new base salary with 10% increase is : $%,.2f%n", employee.getBaseSalary());
            }
            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }

        for(int j =0; j < employees.length; ++j){
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
        }
    }
}
