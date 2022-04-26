package Chapter2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float PI = (float) Math.PI;
        System.out.println("Enter Radius of your choice to calculate Diameter, Circumference and Area of a Circle");
        float radius = input.nextFloat();
        System.out.printf("%n The Diameter is %f%n The Circumference is %f%n The Area is %f%n", (radius *2), ( PI * radius * 2), (PI * radius * radius));
        input.close();
    }
}
