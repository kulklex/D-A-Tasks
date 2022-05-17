public class VariableLengthargument {
    public static double average(double... number){
        double total = 0.0;

        for(double d : number){
            total+=d;
        }
        return total /number.length;
    } 

    public static void main(String[] args) {
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;

        System.out.printf("Average of d1 and d2 is %.1f%n", average(d1, d2));
        System.out.printf("Average of d1, d2 and d3 is %.1f%n", average(d1, d2, d3));
        System.out.printf("Average of d1, d2, d3 and d4 is %.1f%n", average(d1, d2, d3, d4));
    }
}
