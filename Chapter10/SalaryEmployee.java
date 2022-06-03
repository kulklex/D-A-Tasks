public class SalaryEmployee extends Employee {
    private double weeklySalary;

    public SalaryEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        if(weeklySalary < 0.0){throw new IllegalArgumentException("Weekly Salary must be >= 0.0");}
        this.weeklySalary = weeklySalary;    
    }

    public void setWeeklySalary(double weeklySalary){
        if(weeklySalary < 0.0){throw new IllegalArgumentException("Weekly Salary must be > 0.0");}
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary(){
        return weeklySalary;
    }

    @Override
    public double earnings(){
        return getWeeklySalary();
    }

    @Override
    public String toString(){
        return String.format("Salaried employee: %s%n%s: $%,.2f", super.toString(), "Weekly Salary", getWeeklySalary());
    }
}
