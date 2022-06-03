public class ProtectedBaseCommissionTest extends ProtectedBasePlusCommission {
    protected double baseSalary;


   public ProtectedBaseCommissionTest(String firstName, String lastName,
      String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
     super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, baseSalary);  
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base Salary must be >= 0.0");
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
        return baseSalary + (commissionRate * grossSales);
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
        "base-salaried commission employee", firstName, lastName, "social security number", socialSecurityNumber,
         "gross sales", grossSales, "commission rate", commissionRate, "base salary", baseSalary);
    }
    //Note that you are only able to get the super class instance variables directly because they're using "Protected" access modifier
    //this approach is not advisable, make use of private access modifier and getters and setters intead!
}
