public class CoumpoundInterest {
    public static void main(String[] args) {
        double principal = 1000;
        double r = 0.05;
        double a = 0;
        for(double n = 1; n<=10; n++){
            a = principal * Math.pow(1+r, n);
            System.out.printf("Year: %.0f,  Amount on Deposit: $%,.2f%n", n, a);
        } 

    }
}
