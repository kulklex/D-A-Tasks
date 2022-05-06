package Chapter3;
public class Employee {
    private String firstName, lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        if(monthlySalary < 0){
            this.monthlySalary = 0;
        } else{
            this.monthlySalary = monthlySalary;
        }
    }

    public void setFirstName(String firstname){
        this.firstName = firstname;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String secondName){
        this.lastName = secondName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setMonthlySalary(double monthlySalary){
        if(monthlySalary < 0){
            this.monthlySalary = 0;
        } else {
            this.monthlySalary = monthlySalary + (0.1 * monthlySalary);
        }
    }

    public double getMonthlySalary(){
        return this.monthlySalary;
    }
}
