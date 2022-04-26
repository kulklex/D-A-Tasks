package Chapter2;

import java.util.Scanner;

public class WorldGrowth {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double currentPopulation, increase, nextyr, in2yrs, in3yrs, in4yrs, in5yrs;
    System.out.print("Enter Current World Population in Figures: ");
    currentPopulation = input.nextDouble();
    increase = 0.01 * currentPopulation;
    nextyr = increase + currentPopulation;
    in2yrs = increase + nextyr;
    in3yrs = increase + in2yrs;
    in4yrs = increase +  in3yrs;
    in5yrs = increase + in4yrs;
    System.out.printf("Next Year's population would be %.2f%n", nextyr);
    System.out.printf("In Two Year's population would be %.2f%n", in2yrs);
    System.out.printf("In Three Year's population would be %.2f%n", in3yrs);
    System.out.printf("In Four Year's population would be %.2f%n", in4yrs);
    System.out.printf("In Five Year's population would be %.2f%n", in5yrs);
    input.close();

    }
}
