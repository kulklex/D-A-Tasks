public class CommissionEmployees extends Object{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;


    public CommissionEmployees(String firstName, String lastName, String socialSecurity, double grossSales, double commissionRate){
        if (grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        if (commissionRate < 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.socialSecurityNumber = socialSecurity;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    public void setGrossSales(double grossSales){
        if(grossSales < 0.0)
        throw new IllegalArgumentException("Gross must be >= 0.0");

        this.grossSales = grossSales;
    }

    public double getGrossSales(){
        return grossSales;
    }

    public void setCommissionRate(double commissionRate){
        if(commissionRate <= 0.0 || commissionRate>= 1.0){
            throw new IllegalArgumentException("Commission must be > 0.0 and < 1.0");
        }
        this.commissionRate  = commissionRate;
    }

    public double getCommissionRate(){
        return commissionRate;
    }

    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
         "commission employee", getFirstName(), getLastName(), "social security number", getSocialSecurityNumber(),
         "gross sales", getGrossSales(), "commission rate", getCommissionRate(), "earnings", earnings());
    }

}
