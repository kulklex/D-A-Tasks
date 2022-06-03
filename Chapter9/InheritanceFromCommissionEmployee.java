public class InheritanceFromCommissionEmployee  extends CommissionEmployees {
    private double baseSalary;

    public InheritanceFromCommissionEmployee(String firstName, String lastName, 
    String socialSecurity, double grossSales, double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurity, grossSales, commissionRate);
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        if(baseSalary < 0.0)
        throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString(){
        return String.format("%s: %s%n%.2f: ", super.toString(), "base salary", getBaseSalary());
    }
}
