package Chapter3;

public class FPAWithdraw {
    private double withdraw;
    private double balance;
    private String  name;

    public FPAWithdraw(double balance){
        this.balance = balance;
    }

    public void setWithdraw(double withdraw){
        this.withdraw = withdraw;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getWithdrawal(){
        return this.withdraw;
    }

    public String getName(){
        return this.name;
    }

    public void setDepositBalance(double deposit){
        this.balance = this.balance + deposit;
    }

    public double getDepositBalance(){
        return this.balance;
    }

    public void setBalance(double withdraw){
        this.balance = this.balance - withdraw;
    }

    public double getBalance(){
        if(this.balance < 0.0){
            return 0.0;
        }
        return this.balance;
    }

}
